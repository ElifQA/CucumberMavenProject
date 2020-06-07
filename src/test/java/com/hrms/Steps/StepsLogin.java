package com.hrms.Steps;

import org.junit.Assert;

import com.hrms.Pages.LoginPageElement;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class StepsLogin extends CommonMethods{
	LoginPageElement login;
	@Given("I open the borwser and navigate to HRMS application")
	public void i_open_the_borwser_and_navigate_to_HRMS_application() {
	    BaseClass.setUp();
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		 login=new LoginPageElement();
	    sendText(login.username, "Admin");
	    sendText(login.password, "admin123");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		click(login.loginBtn);
	    	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
	    System.out.println("I am logged in");
	}
	@When("I enter valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password() {
		login=new LoginPageElement();
	   sendText(login.username, "Admin");
	   sendText(login.password, "456");
	}

	@Then("I see error message")
	public void i_see_error_message() {
		Boolean error=login.errorMsg.isDisplayed();
		Assert.assertTrue("Error message is not displayed", error);
		
	}
	@Then("I close browser")
	public void i_close_browser() {
	   tearDown();
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String uname, String pword) {
		login=new LoginPageElement();
		sendText(login.username, uname );
		sendText(login.password, pword);
	   
	}

	@Then("I see {string}")
	public void i_see(String errMsg) {
	  Boolean error= login.errorMsg.isDisplayed();
	  Assert.assertTrue("Error message is not displayed", error);
	}


}
