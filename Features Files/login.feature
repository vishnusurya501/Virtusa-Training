@Smoke
Feature: Feature to test login functionality

  Scenario: Succesfull login when user login with the credentials
    Given In the customer login page
    When user enters username and password
    And I click on login button
    Then i should redirected to next page
