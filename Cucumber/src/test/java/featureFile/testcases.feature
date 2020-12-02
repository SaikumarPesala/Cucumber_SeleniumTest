Feature: Testing Cleartrip website's UI elements

Scenario: Verify whether user is able to enter FROM city name
Given User is on ClearTrip website
When User enters Three words of desired FROM City name
Then All the city names which were starting with those three letters should get displayed
And It should allow user to select desired From city from the dropdown

Scenario: Verify whether user is able to enter To city name
Given User is on ClearTrip website
When User enters Three words of desired TO City name
Then All the city names which were starting with those three letters should get displayed
And It should allow user to select desired To city from the dropdown