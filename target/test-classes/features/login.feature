@login
Feature: Login

  @smoke
  Scenario: Valid login
    Given I open the borwser and navigate to HRMS application
    When I enter valid username and valid password
    And I click on login button
    Then I successfully logged in
    And I close browser

  @smoke
  Scenario: Invalid Login
    Given I open the borwser and navigate to HRMS application
    When I enter valid username and invalid password
    And I click on login button
    Then I see error message
    And I close browser
@regression
  Scenario Outline: Invalid Login and message validation
    When I enter "<Username>" and "<Password>"
    And I click on login button
    Then I see "<ErrorMessage>"

    Examples: 
      | Username | Password    | ErrorMessage             |
      | Admin    | Admin123    | Invalid credentials      |
      | Admin    |             | Password cannot be empty |
      |          | Hum@nhrm123 | Username cannot be empty |
      |          |             | Username cannot be empty |
