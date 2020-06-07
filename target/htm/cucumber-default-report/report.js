$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/addEmp.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@addemp"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Add new employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I add \"\u003cFirstName\u003e\", \"\u003cMiddleName\u003e\" and \"\u003cLastName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click save",
  "keyword": "And "
});
formatter.step({
  "name": "I see Employee with \"\u003cFirstName\u003e\", \"\u003cMiddleName\u003e\" and \"\u003cLastName\u003e\" is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "MiddleName",
        "LastName"
      ]
    },
    {
      "cells": [
        "Asim",
        "Can",
        "Dmr"
      ]
    },
    {
      "cells": [
        "Melek",
        "S",
        "nMJK"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmpSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmpSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addemp"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I add \"Asim\", \"Can\" and \"Dmr\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmpSteps.i_add_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmpSteps.i_click_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see Employee with \"Asim\", \"Can\" and \"Dmr\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmpSteps.i_see_Employee_with_and_is_displayed(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmpSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmpSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addemp"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I add \"Melek\", \"S\" and \"nMJK\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmpSteps.i_add_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmpSteps.i_click_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see Employee with \"Melek\", \"S\" and \"nMJK\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmpSteps.i_see_Employee_with_and_is_displayed(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Valid login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the borwser and navigate to HRMS application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsLogin.i_open_the_borwser_and_navigate_to_HRMS_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepsLogin.i_enter_valid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepsLogin.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsLogin.i_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepsLogin.i_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the borwser and navigate to HRMS application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsLogin.i_open_the_borwser_and_navigate_to_HRMS_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepsLogin.i_enter_valid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepsLogin.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsLogin.i_see_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepsLogin.i_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});