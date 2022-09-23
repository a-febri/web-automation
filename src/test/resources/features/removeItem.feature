Feature: Remove item
  Scenario Outline: Remove last added item from cart
    Given I Already logged in
    And I already added a product to cart "<product1>"
    When I add more product to cart "<product2>"
    And I click cart icon
    And I click remove button
    Then The last added product will be disappear on the cart page
    Examples:
    |product1               |product2|
    | add-to-cart-sauce-labs-fleece-jacket |add-to-cart-test.allthethings()-t-shirt-(red)|
