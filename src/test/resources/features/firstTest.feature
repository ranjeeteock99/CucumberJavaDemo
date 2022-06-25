Feature: Web Login
  Scenario: user should be able to login with valod credentials
    Given The user is on login page
    When the user enters valid credentials
    And hits the submit button
    Then The use should be logged in succesfully

