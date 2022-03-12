Feature: Test login functionality

  @tag1
  Scenario Outline: Check Login is successful with valid credentials
    Given browser is open
    And user is on the login page
    When user enters <username> and <password>
    And clicks on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Lipi     | 12345    |
      | Krish    | 12345    |
