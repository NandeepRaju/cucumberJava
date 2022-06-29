#Author
#Date
#Description
@SmokeGoogleSearchFeature
Feature: feature to test google search functionality

  @Smoke
  Scenario: Validate google search is working
    Given Browser is open
    And User is on google search page
    When User enters a search text in search box
    And Hits a enter
    Then User is navigated to search results
