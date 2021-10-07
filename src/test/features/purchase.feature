Feature: Guest customer purchase



  Scenario: A book purchase
      Given Customer is on DemoShop home page
      When  Customer clicks on books
      Then  Customer should see the Books header
      Then  Customer should see sort by element

      When Customer orders by price low to high
      When Customer changes the view to list
      When Customer adds the first book to cart
      Then Customer should see updated cart

      When Customer clicks on shopping cart
      Then Customer should land on Shopping Cart page

      When Customer select Country from the list
      When customer click i agree button
      When Customer clicks Checkout button
      Then Customer should see next page

      When Customer clicks on check-out-as-guest
      Then Customer should see Checkout list

      When Customer fill billing address first name
      When Customer enter Last name
      When Customer enter Email adress
      When Customer select Country
      When Customer select City
      When Customer fill address button
      When Customer enter Zip code
      When Customer enter Phone number
      When Customer clicks on billing continue
      Then Customer should see disabled billing tab


      When Customer clicks on pick up in store checkbox
      And Customer clicks on continue button
      Then Payment tab becomes active
      When Customer click on payment method continue
      When Customer clicks on payment info continue
      Then Payment tab becomes disabled


      When Costomer clicks on confirm
      Then Order number is genereted


