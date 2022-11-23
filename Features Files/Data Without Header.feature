Feature: This is the login feature for orange HRm

  Scenario: Login scenario
    Given user is on the login page
    When user enters the credentials 
    |Admin|
    |admin123|
    And clicks the login button
    Then the user should see the home page
    

