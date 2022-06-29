Feature: Test Login Functoinality using PF

  @Smoke
  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open-PF
    And User is on Login page-PF
    When User enters <username> & <password>-PF
    And Clicks on Login-PF
    Then User is navigated to Home page-PF

    Examples: 
      | username |  | password |
      | Nandeep  |  |    12345 |
      | Nandy    |  |    12345 |
