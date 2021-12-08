Feature: Regression Tests

  Scenario: User should see vacation search result with all fields filled properly
    When home page loaded click Packages subtab in Book tab
    Then fill out location and dates field and click Find trips button
    And verify that the new page loaded successfully with packages results

  Scenario: Vacation form should have only up to 4 rooms
    When home page loaded click Packages subtab in Book tab
    Then click Rooms field and select the largest available number
    Then verify that the largest number of room is four

  Scenario: Rooms container should say “rooms” if room count is bigger than one
    When home page loaded click Packages subtab in Book tab
    Then click Rooms field and select the largest available number
    And verify that the container has rooms word

  Scenario:Rooms option dropdown should disappear when Flight and car option is selected
    When home page loaded click Packages subtab in Book tab
    Then click Flight and car radio button
    And verify that the Rooms field disappear

