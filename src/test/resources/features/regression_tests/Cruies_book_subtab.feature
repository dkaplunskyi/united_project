Feature: regression tests

  Scenario: Clicking cruise link should navigate to United Cruises page
    When home page loaded click Cruise subtab in Book tab
    And verify that the cruises united website is loaded successfully