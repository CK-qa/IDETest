Feature: test feature
Scenario: items count

  Given user has 100 items
  When user loses 50 items
  Then he has 50 items