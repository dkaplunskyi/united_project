Feature: Smoke Tests

  Verify app is loaded with a main search window with following tabs:
  stays,flights,cars packages, things to do, cruise
@test
  Scenario: Verify app is loaded with a main search window with following tabs: Book, Flight status, Check-in, My trips
    When page is loaded verify following tabs are present

  Scenario: Available flights are displayed when user searches for round-trip basic economy ticket
    When fill out Origin text field
    Then fill out Destination text field
    And click Search button
    Then verify that the flights info are displayed

  Scenario: User checks out one way flight ticket for the date of Jan 15, 2022
    Given select One-way radio button
    When fill out Origin text field
    Then fill out Destination text field
    Then choose Jan 15 date
    And click Search button
    Then verify that the flights info are displayed

  Scenario: User checks out 3 round trip flight tickets: 2 adults, 1 infant for the date of Feb 15, 2022
    Given select Roundtrip radio button
    When fill out Origin text field
    Then fill out Destination text field
    Then choose departure and return date
    Then add two adults and one infant passenger
    And click Search button
    Then verify that the flights info are displayed



