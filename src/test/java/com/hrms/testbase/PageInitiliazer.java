package com.hrms.testbase;

import com.hrms.Pages.AddEmployeePageElements;
import com.hrms.Pages.DashboardPageElement;
import com.hrms.Pages.LoginPageElement;
import com.hrms.Pages.PersonalDetailsPageElements;

public class PageInitiliazer extends BaseClass{
	
	protected static LoginPageElement login;
	protected static DashboardPageElement dashboard;
	protected static AddEmployeePageElements addemp;
	protected static PersonalDetailsPageElements pDetails;
	
	public static void initializeAllPage(){
		login = new LoginPageElement();
		dashboard = new DashboardPageElement();
		addemp = new AddEmployeePageElements();
		pDetails = new PersonalDetailsPageElements();
		
	}

}
