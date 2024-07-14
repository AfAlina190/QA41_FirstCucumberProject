Feature: Add a car

  @addCar
  Scenario: Add a car with valid data
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in Link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success Message is displayed
    And User clicks on OK button
    And User clicks on Let the car work link
    And User enters Location
    And User enters Car Manufacture
    And User enters Car Model
    And User enters Car Year
    And User enters Car Fuel
    And User enters Car Seats
    And User enters Car class
    And User enters Car registration number
    And User enters Car Price
    And User fills the text box About
    And User clicks Add photos of your car and uploads photo
    And User clicks Submit button
    Then User verifies Success Message appears
    And User quites browser