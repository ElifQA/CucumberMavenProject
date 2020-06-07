package com.hrms.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class LoginPageElement extends CommonMethods{
	

	@FindBy(xpath = "//div[@id='divLogo']")
	public WebElement logo;
	
	@FindBy(id="logInPanelHeading")
	public WebElement loginLabel;
	
	@FindBy(name="txtUsername")
	public WebElement username;
	
	@FindBy(css="input#txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginBtn;
	
	@FindBy(id="spanMessage")
	public WebElement errorMsg;
	
	public LoginPageElement(){
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	public void login(String uid, String pwd) {
		sendText(username, uid);
		sendText(password, pwd);
		jsClick(login.loginBtn);
	}

}
