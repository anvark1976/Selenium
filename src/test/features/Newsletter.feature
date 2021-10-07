Feature: Newsletter




  Scenario: Subscribe to Newsletter


    Given Customer is on DemoShop home page
    When  Customer enters an Email
    When  Customer clicks on Subscribe
    Then  Customer should see Subscribtion is successful
