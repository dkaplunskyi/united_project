Feature: Regression Tests

  Background:
    When home page loaded click Car subtab in Book tab

  Scenario: Cars form should have following fields: Pickup location, Drop off location, Pickup time, Drop offtime,
  return car to same location, primary driver is 25 or older, book with miles, find cars
    Then verify that the fields and buttons are present

  Scenario: Drop off location should disappear if return car to same location checkbox is checked
#      also work for: Age field should disappear if primary driver is 25 or older checkbox is checked
    Then check Return car to same location and primary driver is Twenty-five checkboxes if it's unckeked
    And verify that the Drop off location field not displayed

  Scenario: Finding a car after filling up the form should navigate to a separate tab
    Then check Return car to same location and primary driver is Twenty-five checkboxes if it's unckeked
    Then fill out Going to and Dates and click Find cars button
    And verify that the new page loaded successfully with car results

  Scenario: Finding a car with book with miles checked should return result with miles only
    Then check Return car to same location and primary driver is Twenty-five checkboxes if it's unckeked
    Then check Book with miles checkbox
    Then fill out Going to and Dates and click Find cars button
    And verify that the new page loaded successfully with car mileage results

  Scenario: Searching for a rental car with an age lesser than Twenty-one should display “Some car rental suppliers do not rent to young drivers. If you are travelling with an older person, it may help to makethem your main driver.”
    Then check Primary Driver is Twenty-one or older checkbox if it's unckecked
    Then fill out age input with less that Twenty-one
    Then fill out Going to and Dates and click Find cars button
    And verify that the new page has correct message

  Scenario: Searching for a rental car with an age of 21 should not return any search result
    Then check Primary Driver is Twenty-one or older checkbox if it's unckecked
    Then fill out age input with Twenty-one
    Then fill out Going to and Dates and click Find cars button
    And verify that the new page has correct message without search result

  Scenario: Searching for a rental car with an age bigger than 21 should return search result
    Then check Primary Driver is Twenty-one or older checkbox if it's unckecked
    Then fill out age input with more that Twenty-one
    Then fill out Going to and Dates and click Find cars button
    And verify that the new page loaded successfully with car results


