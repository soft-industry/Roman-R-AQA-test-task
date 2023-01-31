Feature: Search for the product

  Scenario: System returns response if correct keyword was sent
    When user calls search endpoint for "mango"
    Then user sees search results for "mango"


  Scenario: System returns error if incorrect keyword was sent
    When user calls search endpoint for "car"
    Then user sees error
