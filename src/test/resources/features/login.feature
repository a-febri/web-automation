Feature: login

  Scenario Outline: Successfully logged in
    Given I already on log in page
    When I input username "<username>"
    And I input password "<password>"
    And I click login button
    Then I redirected to inventory page
    Examples:
      | username        | password       |
      | standard_user | secret_sauce |