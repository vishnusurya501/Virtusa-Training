@Simplelogin
Feature: Test Google Search
  Scenario: Google search scenario
    Given user is entering the website
    When user is searching for some keywords
    And enters the return key
    Then user is directed to next page
    