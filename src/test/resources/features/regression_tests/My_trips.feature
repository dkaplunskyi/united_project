Feature: regression test

  Background:
    When home page loaded click My Trips tab

  Scenario: There should be a link to find United Travel Credits page
    Then click Find your travel credits link
    And verify that the United Travel Credits page loaded successfully

  Scenario: Empty My Trips form should show error messages when searched without filling up
    Then click search button
    And verify that the messages are displayed