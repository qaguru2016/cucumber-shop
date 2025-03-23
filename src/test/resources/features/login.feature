Feature: Login Functionality

  Scenario: Valid Login
    Given User is on the Login page
    When User enters valid username and password
    Then User should be redirected to the Home page