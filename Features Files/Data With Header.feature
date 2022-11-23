Feature: This is login feature for orange HRm

  Scenario: Login scenario in orange
    Given user is on  login page
    When user enters the credentials values
    |username|password|
    |Admin   |admin123|
    And clicks  login button
    Then the user should directed home page
    
