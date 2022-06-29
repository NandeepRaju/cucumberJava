Feature: Test Login Functoinality

  @Smoke
  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And User is on Login page
    When User enters <username> & <password>
    And Clicks on Login
    Then User is navigated to Home page

    Examples: 
      | username |  | password |
      | Nandeep  |  |    12345 |
      | Nandy    |  |    12345 |
