Feature: Regression Tests

  Background:
    When home page loaded click Hotel subtab in Book tab

  Scenario: Panel should have following fields: Going to, check-in, check-out, number of rooms,
  number of travelers,book with miles and find hotels button
    Then verify that the fields are present

  Scenario: One room and one travelers should be selected by default
    Then verify that the one room and one travelers selected

  Scenario: User can select maximum eighth adult and eighth children travelers, sixteen in total
    Then click Number of travelers text field
    Then click more than eighth times on plus sign for Adults and Children
    And verify that the total travelers not more than sixteen

  Scenario: User should be able to maximum 8 rooms
    Then click Number of rooms field and select last one available option
    And verify that the maximum available rooms is eighth

  Scenario: Number of travelers field should disappear when number of rooms is more than one
    Then click Number of rooms field and select last one available option
    And verify that the Number of travelers field is disappear

  Scenario: User should see result when finding for a hotel with all the form fields filled properly
    Then fill out Going to and Dates and click Find hotels button
    Then verify that the new page loaded successfully with hotels result



