Feature: Checkout
  Scenario Outline: Verify checkout button is enable
    Given I Already logged in
    And I already added a product to cart "<product>"
    When I click on cart button
    And I click on checkout button
    Then I redirected to checkout step one page
    Examples:
    |product|
    |add-to-cart-sauce-labs-fleece-jacket|