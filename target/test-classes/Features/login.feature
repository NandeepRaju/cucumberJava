#Author
#Date
#Description

@SmokeLoginFeature
Feature: Feature to test login functionality

@Smoke
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page
