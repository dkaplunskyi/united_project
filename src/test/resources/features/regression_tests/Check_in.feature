
Feature: Regression Tests

  Background:
    When home page loaded click Check-in tab

  Scenario: Empty flight check-in form should show error messages when searched without filling up
    Then click on Search button
    And verify that the warning messages are displayed

    Scenario: There should be a check-in details link and navigates to correct page
      Then click check-in details link
      And verify that the page Check-in and Airport Processing Times loaded successfully

    Scenario: There should be a check-in with MilesPlus link and navigates to correct page
      Then click check-in with MilesPlus link
      And verify that the page check-in with MilesPlus link loaded successfully