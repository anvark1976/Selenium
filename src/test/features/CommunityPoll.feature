Feature: Community Poll

  Scenario: Verify error message from vote


    Given Customer is on DemoShop home page

    When Customer clicks on Excellent button
    When Customer clicks on vote button
    Then customer should see error message(Only registered users can vote)