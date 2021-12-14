Feature: Regression Tests

  Scenario: Choosing round trip option should have departing and return date fields
    When click Round-trip radio button
    Then verify that the departing and return date fields are displayed

  Scenario: Choosing one way flight option should only have departing date fields
    When click one way redio button
    Then verify that the return date field is not displayed

  Scenario: User should be able to increment traveler count up to 9
    When home page loaded click Travelers field
    Then increase adults travelers to max available number
    And verify that the total travelers not more than nine

  Scenario: User can select one traveler from every single passenger type
    When home page loaded click Travelers field
    Then add one passenger in every single passenger type
    And verify that the fields has one added passenger

  Scenario: Leaving from and going to fields should switch when click on switch icon in the middle
    When fill out Origin text field input
    And fill out Destination text field input
    Then click switch icon in the middle and verify that the Leaving from and Going to fields switched

  Scenario: Leaving from and going to fields should have correct placeholders
    Given verify that Leaving from and Going to fields have correct placeholders

  Scenario: User should be able to remove leaving from location value
    Given fill out Origin text field input
    Then click cross icon and verify that the origin field is empty

  Scenario: User should be able to remove going to location value
    Given fill out Destination text field input
    Then click cross icon and verify that the going to field is empty

  Scenario: User can select different flight classes such as Economy, Premium economy, Business or First
    Given click each flight classes then verify that is selected

  Scenario: Advance search should open a separate page with more advanced search fields
    Given home page is loaded then click Advanced search link
    And verify that the Advanced search page is loaded successfully

  Scenario: Minimum one traveler should be selected
    When home page loaded click Travelers field
    Then decrease adults travelers to min available number
    And verify that the total travelers not less than one

  Scenario: Checking flexible dates option should change the Dates field to month dropdown only
    When home page is loaded then click Advanced search link
    Then click Flexible dates checkbox input
    And verify that the Dates field changed to month drop down list

  Scenario: User can only travel with one pet
    When home page loaded click Travelers field
    Then click Travel with one pet link
    And verify that the user can onlyt select one pet


