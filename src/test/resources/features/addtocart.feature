Feature: Add to Cart

  Scenario Outline: Add an item to Cart
    Given I Already logged in
    When I select an item "<item>"
    Then Selected item added to cart
    Examples:
      | item                                   |
      | add-to-cart-sauce-labs-fleece-jacket |
