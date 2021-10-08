Feature: Sharea a Book with a friend using email
  @smoke
  Scenario: Share a book with friend



    Given Customer is on DemoShop home page Login
    When Customer clicks on log in link
    Then Customer should lan on sign in page

    When Customer enter email
    When Customer enters valid password
    When Customer click on remember me
    When Customer click log in button
    When Customer searching for Health book
    When Customer click on Health book link
    When Customer click on Email a friend button
    When Customer enters Email a friend
    When Customer click send email button
    Then Customer should verify Health Book Your message has been sent.