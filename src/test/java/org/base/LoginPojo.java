package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
public LoginPojo() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id = "email")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBys({
		
	//	@FindBy(id = "email"),
	//	@FindBy(name = "pass"),
		@FindBy(xpath = "//input[@type='password']")
		
		
		
	})
	private WebElement passwrd;

	public WebElement getPasswrd() {
		return passwrd;
	}
	
	@FindAll({
		
		@FindBy(id= "u_0_d_/K"),
		@FindBy(name = "login"),
		@FindBy(xpath = "//button[@value='1']")
		
		
	})
	private WebElement lgbn;

	public WebElement getLgbn() {
		return lgbn;
	}
	
	


}
