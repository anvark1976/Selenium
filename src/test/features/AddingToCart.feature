Feature: Adding to cart

  Scenario: Add a health book to cart


    Given Customer is on DemoShop home page book
    When  Customer searches for a book
    Then  Customer is on search page

    When  Customer clicks on add to cart
    Then  Shopping cart should get updated
