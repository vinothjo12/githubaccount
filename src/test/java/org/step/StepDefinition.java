package org.step;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.base.CreateNewAccountPojo;
import org.base.LoginPojo;
import org.checkerframework.checker.units.qual.m;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	// createnewacnt feature file, 1 scenario
	
	
	@Given("to launch chrome browser")
	public void toLaunchChromeBrowser() {
		launchBrowser();
		max();
	    
	}

	@When("to click create new button")
	public void toClickCreateNewButton() {
		url("https://www.facebook.com/");
		CreateNewAccountPojo p = new CreateNewAccountPojo();
		button(p.getCreatenwbtn());
	    
	}
	
	@When("pass fb first name")
	public void passFbFirstName(io.cucumber.datatable.DataTable d) {
		implicityWaits(10);
		List<String> data = d.asList();
		String name = data.get(1);
		
		CreateNewAccountPojo p = new CreateNewAccountPojo();
		sendkey(p.getFirstname(), name);
	    
	}

	@When("pass sur name")
	public void passSurName(io.cucumber.datatable.DataTable t) {
		List<List<String>> data = t.asLists();
		String sur = data.get(1).get(2);
		CreateNewAccountPojo p = new CreateNewAccountPojo();
		sendkey(p.getSurname(), sur);
	    
	}

	@Then("to click signup button")
	public void toClickSignupButton() {
		CreateNewAccountPojo p = new CreateNewAccountPojo();
		button(p.getSignupbtn());
	    
	}
	
	// Login feature file, 2 scenerio

	@Given("To open Chrome Browser")
	public void toOpenChromeBrowser() {
		launchBrowser();
		max();
		url("https://www.facebook.com/");
	    
	}

	
	
	@When("To pass valid username nd password")
	public void toPassValidUsernameNdPassword(io.cucumber.datatable.DataTable m) {
	
		Map<String, String> data = m.asMap(String.class, String.class);
		String name = data.get("usernam");
		String pass = data.get("passwor");
		
		LoginPojo p = new LoginPojo();
		sendkey(p.getLogin(), name);
		sendkey(p.getPasswrd(), pass);
	    
	}
	@When("To pass invalid username nd invalid password")
	public void toPassInvalidUsernameNdInvalidPassword(io.cucumber.datatable.DataTable d) {
		
		List<Map<String, String>> m = d.asMaps(String.class, String.class);
		
		String pass = m.get(0).get("moive");
		String name = m.get(1).get("hero");
		
		LoginPojo p = new LoginPojo();
		sendkey(p.getLogin(), name);
		sendkey(p.getPasswrd(), pass);
	}
	

	@Then("To click LoginButton")
	public void toClickLoginButton() {
		LoginPojo p = new LoginPojo();
		button(p.getLgbn());
	    
	}

	


}
