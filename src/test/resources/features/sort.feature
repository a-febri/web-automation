Feature: Search products
 Scenario Outline: Sorting product name Z to A
    Given I Already logged in
    And I already added a product to cart "<product>"
    When I click sorting field
    And I select "<filter>"
    Then Product should be sorted by "<filter>"
    Examples:
   |product|filter|
   |add-to-cart-sauce-labs-fleece-jacket|Name (Z to A)|
