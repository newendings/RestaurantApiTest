Feature: Change Language Function

  @Deutsch
  Scenario: Change Language to Deutsch
    Given Matt is opening the Applied Intuition website
    When he changes the language to Deutsch
    Then the language box should say DE

  @Everything
  Scenario: Change Language to everything
    Given Matt is opening the Applied Intuition website
    When he changes the language to Deutsch
    Then the language box should say DE
    When he changes the language to Japanese
    Then the language box should say JP
    When he changes the language to Korean
    Then the language box should say KR

