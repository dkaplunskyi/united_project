Feature: Sanity Tests

  Background:
    Given user is on home page

  Scenario: User should be able to change language to Deutsch
    When page is loaded click English on top header
    Then click Select Language
    And select Deutsch
    And click Ändern button
    Then verify that the language change to Deutsch

  Scenario: Footer links should not be broken
    Then find all links and veify each link has href attribute

  Scenario: Top header tabs should show correct panels when clicked
    Then varify that the each tab has area-selected attribute true

  Scenario: Home page booker container tabs should display correct fields
    And Book tab should have all necessary fields
    And Flight status tab should have necessary fields
    And Check-in tab should have necessary fields
    And My trips tab should have necessary fields

  Scenario: Advisory top section should display info with links
    Then verify that the info display has link

  Scenario: Top header links
    Then varify that the each tab active after click

