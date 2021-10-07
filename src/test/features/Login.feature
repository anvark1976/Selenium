Feature: Log in


    @smoke
  Scenario: Successful log in

    Given Customer is on DemoShop home page Login
    When Customer clicks on log in link
    Then Customer should lan on sign in page

    When Customer enter email
    When Customer enters valid password
    When Customer click on remember me
    When Customer click log in button
    Then Customer should see log out

