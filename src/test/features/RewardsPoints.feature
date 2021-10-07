Feature: RewardsPoints


  Scenario: My Rewards



    When Customer is on DemoShop home page Login
    When Customer clicks on log in link
    Then Customer should lan on sign in page

    When Customer enter email
    When Customer enters valid password
    When Customer click log in button
    When Customer click My account
    Then Customer should lan on My account - Customer info  page

    When Customer click Reward points link
    Then Customer should lan on My account - Reward points page
    Then Customer should verify the text Your current balance is 0 reward points (0.00).