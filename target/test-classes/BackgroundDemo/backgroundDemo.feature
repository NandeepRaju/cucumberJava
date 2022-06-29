Feature: Check homepage functionality

  Background: User is logged in
    Given User is on login page1
    When User enters username and password
    And User clicks on login button
    Then User is navigated to homepage

  Scenario: Check logout link
    #Given User is logged in
    When User clicks on welcome link
    Then Logout link is displayed

  Scenario: Verify quick launch toolbar is displayed
    #Given User is logged in
    When User clicks on dashboard link
    Then Quick launch toolbar is displayed
