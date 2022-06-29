Feature: Test Login Functoinality using POM

  @Smoke
  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open-POM
    And User is on Login page-POM
    When User enters <username> & <password>-POM
    And Clicks on Login-POM
    Then User is navigated to Home page-POM

    Examples: 
      | username |  | password |
      | Nandeep  |  |    12345 |
      | Nandy    |  |    12345 |
