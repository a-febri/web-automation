Feature: Continue shopping
  Scenario Outline: Verify continue shopping button
    Given I Already logged in
    And I already added a product to cart "<product>"
    When I click on cart button
    And I click on continue shopping button
    Then I redirected to inventory page
    Examples:
    |product|
    |add-to-cart-sauce-labs-fleece-jacket|
