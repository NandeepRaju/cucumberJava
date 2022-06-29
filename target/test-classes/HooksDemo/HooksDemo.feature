Feature: Check login functionality

	@Smoke
  Scenario: 
    Given User is on login page
    When User enters valid username and password
    And Clicks on login button
    Then User is navigated to the home page

  Scenario: 
    Given User is on login page
    When User enters valid username and password
    And Clicks on login button
    Then User is navigated to the home page
