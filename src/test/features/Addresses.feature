Feature: Addresses

  Scenario: Verification John Smiths Address

    When Customer is on DemoShop home page Login
    When Customer clicks on log in link
    Then Customer should lan on sign in page

    When Customer enter email
    When Customer enters valid password
    When Customer click log in button
    When Customer clicks on addresses link
    Then Customer should see My account Addresses
    Then Customer should verify name John Smith

