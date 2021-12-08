Feature: Regression Tests

  Background:
    When home page loaded click Flight status tab

  Scenario: User searches flight status between from and to destinations
    Then fill out form and click Search button
    And verify that the result is displayed

  Scenario: Flight number field should not accept other than numbers
    Then fill out Flight number finput with latters and click Enter
    Then verify that the Please enter a valid flight number message displayed

  Scenario: Invalid number error message should be displayed when a wrong flight number is entered
    Then fill out Flight number input with invalid flight number
    And verify that the message The number you entered is not a valid flight number is displayed



