package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPojo extends BaseClass {
	public CreateNewAccountPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({
		
		@FindBy(id = "u_0_2_bX"),
		@FindBy(xpath = "(//a[@role='button'])[2]")
		})
	private WebElement createnwbtn;
	
	@FindAll({
		
		@FindBy(xpath = "(//input[@type='text'])[2]"),
		@FindBy(name = "firstname"),
		})
	private WebElement firstname;
	
	@FindAll({
		
		@FindBy(xpath = "(//input[@type='text'])[3]"),
		@FindBy(name = "lastname")
		
		
	})
	private WebElement surname;
	
	

	@FindAll({
		
		@FindBy(name = "websubmit"),
		@FindBy(id ="u_3_s_J4")
		
	})
	private WebElement signupbtn;

	public WebElement getCreatenwbtn() {
		return createnwbtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}
	
	public WebElement getSurname() {
		return surname;
	}

	public WebElement getSignupbtn() {
		return signupbtn;
	}
	
	
	
	
	
}
