Feature:
  As test feature
  I want to calculate
  Properly


  Scenario: items count
  Given user has 100 items
  When user loses 50 items
  Then he has 50 items
  And everybody happy


  Scenario: items count 2

    Given user has 120 items
    When user loses 70 items
    Then he has 50 items
    And everybody happy


  Scenario Outline: items blala
    Given there are <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers

    Examples:
      | start | eat | left |
      |  12   |  5  |  7   |
      |  20   |  5  |  15  |
