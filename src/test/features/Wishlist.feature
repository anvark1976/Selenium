Feature: Wishlist

  @smoke


  Scenario: Add  a book to Wishlist

    Given Customer is on DemoShop home page book
    When  Customer searches for a book
    Then  Customer is on search page

    When  Customer clicks on book
    When  Customer clicks on add to wishlist
    Then  Wishlist should get updated (0) to (1)
