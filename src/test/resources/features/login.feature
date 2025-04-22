Feature: Login Functionality
#Background:
#  Given User is on the Login page

  Scenario Outline: Valid Login
    When User logins with valid username "<username>" and password "<password>"
    Then User should be redirected to the Home page
    Examples:
      | username             | password |
      | pradeep.pp@gmail.com | Test#123 |
