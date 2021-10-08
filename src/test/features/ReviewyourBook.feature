Feature: Review your Book

  Scenario: Reviewing a Book

    Given Customer is on DemoShop home page Login
    When Customer clicks on log in link
    Then Customer should lan on sign in page

    When Customer enter email
    When Customer enters valid password
    When Customer click on remember me
    When Customer click log in button
    When Customer searching for Health book
    When Customer click on Health book link

    When Customer click on Add your review
    When Customer review title
    When Customer review text
    When Customer clicks submit review button
    Then Customer should see review result

