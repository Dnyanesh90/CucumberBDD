Feature: Test Free CRM Application

  Scenario: Test Home page Functionality
    Given user open a browser
    Given user on CRM login page
    When enter valid username and password in CRM
    Then user is on CRM home page
