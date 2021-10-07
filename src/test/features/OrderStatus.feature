Feature: Orderstatus


  Scenario: Pending Order

    When Customer is on DemoShop home page Login
    When Customer clicks on log in link
    Then Customer should lan on sign in page

    When Customer enter email
    When Customer enters valid password
    When Customer click log in button
    Then Customer should see log out


    When Customer clicks on order link
    Then Customer see My account order page
    Then Customer see order status pending
