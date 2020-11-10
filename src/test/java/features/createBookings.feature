Feature: Create a new Booking
  
  Scenario: Create a new Booking
  Given I have navigated to Hotel Booking Form
  When I enter required values in all fields
  And click on Save Button
  Then New Booking should be created
  
