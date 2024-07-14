Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in Link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success Message is displayed
    And User quites browser

  @invalidPassword
  Scenario Outline: Login with valid email and invalid password
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in Link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error Message is displayed
    And User quites browser
    Examples:
      | email             | password   |
      | afali24@gmail.com | 1234567Qwe |
      | afali24@gmail.com | 123456qwe@ |
      | afali24@gmail.com | 123456QWE@ |
      | afali24@gmail.com | !!!!!!Qwe@ |
