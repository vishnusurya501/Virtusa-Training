Feature: This is login feature for orange

  Scenario Outline: Login scenario in orange hrm
    Given user is on the  login page of hrm
    When user enters the credentials values "<username>" and "<password>".
    And clicks  login button in hrm
    Then the user should directed home page of hrm

    Examples: 
      | username | password |
      | Admin5    | admin23 |
      | Admin    | admin123 |
