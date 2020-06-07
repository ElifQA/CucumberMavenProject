package com.hrms.Steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.Pages.AddEmployeePageElements;
import com.hrms.Pages.DashboardPageElement;
import com.hrms.Pages.LoginPageElement;
import com.hrms.Pages.PersonalDetailsPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;




public class AddEmpSteps extends CommonMethods{ //commmethd extends--pageinit extends Baseclass
	//AddEmployeePageElements addemp;
	//PersonalDetailsPageElements pDetails;
	String empId; 
	
	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() {
		//LoginPageElement login=new LoginPageElement();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
//		 sendText(login.username, "Admin");
//		    sendText(login.password, "admin123");
	}

	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() {
		//DashboardPageElement dashboard= new DashboardPageElement();
//		jsClick(dashboard.pim);
//        jsClick(dashboard.addEmp);
		dashboard.navigateToAddEmployee();
	}

	@When("I add {string}, {string} and {string}")
	public void i_add_and(String fName, String mName, String lName) {
	
	 addemp=new AddEmployeePageElements();
	    sendText(addemp.firstName, fName);
	    sendText(addemp.middleName, mName);
	    sendText(addemp.lastName, lName);
	   empId=addemp.empId.getText();
	}

	@When("I click save")
	public void i_click_save() {
		addemp=new AddEmployeePageElements();
	  jsClick(addemp.saveBtn);
	   //addemp.saveBtn.click();
	}

	@Then("I see Employee has been succesfully added")
	public void i_see_Employee_has_been_succesfully_added() {
	    pDetails=new PersonalDetailsPageElements();
	    Assert.assertEquals("Employee is not being added", pDetails.empId.getText(), empId);
	    
	}
	
	@Then("I see Employee with {string}, {string} and {string} is displayed")
	public void i_see_Employee_with_and_is_displayed(String fName, String mName, String lName) {
		pDetails=new PersonalDetailsPageElements();
		boolean newemp=pDetails.empPicture.isDisplayed();
		Assert.assertTrue("employee not added", newemp);
	    
	}
	@When("I delete employee id")
	public void i_delete_employee_id() {
		addemp.empId.clear();
	   
	}

	@Then("I see employee without employee id is being added")
	public void i_see_employee_without_employee_id_is_being_added() {
		pDetails=new PersonalDetailsPageElements();
		//Assert.assertEquals("Employee is NOT being added", pDetails.empId.getText(), empId);
				boolean empic=pDetails.empPicture.isDisplayed();
				Assert.assertTrue("employee not added", empic);
	   
	}
	//Data table if there is no header and simple --> use List =asList() 
										//retrieve daata ---sop asList.get(0)=John
	@When("I enter employee details")
	public void i_enter_employee_details(DataTable empdetails) {
		addemp=new AddEmployeePageElements();
		
		List<Map<String, String >> emplist=empdetails.asMaps();
		
		for (Map<String, String> map : emplist) {
			sendText(addemp.firstName, map.get("FirstName"));
			sendText(addemp.middleName, map.get("MiddleName"));
			sendText(addemp.lastName, map.get("LastName"));
		
		}
	    
	}

	@Then("I click on Edit")
	public void i_click_on_Edit() {
		//pDetails.edit_saveBtn.click();
		pDetails=new PersonalDetailsPageElements();
		jsClick(pDetails.edit_saveBtn);
	    
	}

	@Then("I am able to modify Employee Details")
	public void i_am_able_to_modify_Employee_Details(DataTable modfydetails) throws InterruptedException {
		pDetails=new PersonalDetailsPageElements();
		List<Map<String, String>> modifyList=modfydetails.asMaps();
		for (Map<String, String> map : modifyList) {
		jsClick(pDetails.edit_saveBtn);
	Thread.sleep(2000);
		sendText(pDetails.driverLicenseNo, map.get("DriverLisence"));
		sendText(pDetails.driverLicenseExp, map.get("ExpirationDate"));
//		sendText(pDetails.SSNNo, map.get("SSN"));
//		sendText(pDetails.SINNo, map.get("SIN"));
//		
	clickRadio(pDetails.gender, map.get("Gender"));
	selectDdValue(pDetails.MaritalStatusBtn, map.get("MaritalStatus"));
	//Select selectM = new Select(pDetails.MaritalStatusBtn);
	selectDdValue(pDetails.nationality, map.get("Nationality"));
	
	sendText(pDetails.dobCalendar, map.get("DOB"));

	
//	takeScreenshot("newEmp");

	jsClick(pDetails.edit_saveBtn);
}
	}
	    
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


