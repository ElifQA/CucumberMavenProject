@addemp
Feature: Add Employee

  Background: 
    Given I am logged into HRMS
    And I navigated to Add Employee Page

  @smoke
  Scenario Outline: Add new employee
    When I add "<FirstName>", "<MiddleName>" and "<LastName>"
    And I click save
    Then I see Employee with "<FirstName>", "<MiddleName>" and "<LastName>" is displayed
#ctrl+shift F
    Examples: 
      | FirstName | MiddleName | LastName |
      | Asim      | Can        | Dmr      |
      | Melek     | S          | nMJK     |

  @regression
  Scenario: Add Employee without employee id
    When I add "Jemi", "M" and "White"
    And I delete employee id
    And I click save
    Then I see employee without employee id is being added
@regression
   Scenario: Add and modify employee details
   When I enter employee details
   | FirstName | MiddleName | LastName |
   |John|J| Smith|
   Then I click save
  # And I click on Edit
  
   Then I am able to modify Employee Details
      | DriverLisence | ExpirationDate | SSN         | SIN     | Gender | MaritalStatus | Nationality | DOB        |
      | N78787458     | 2021-12-08     | 123-45-6789 | 7687687 | Male   | Other         | Afghan      | 1980-10-10 |
      | Nhkjkgkhg458   | 2018-12-08     | yiy-45-6789 | uyiy    | Female | Married       | Burmese     | 1980-10-10 |