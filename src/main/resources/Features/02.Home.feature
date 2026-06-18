Feature: Home Screen

  Scenario: Add products to cart valid case
    When User click at add to cart button for products
    Then Products added to cart successfully

    Scenario: Click on cart button valid case
      When User click on the cart button
      Then User navigate to the shopping cart screen successfully