@Feature1
Feature: A test feature

  Scenario: Successful scenario for TES-1
    Given I have the number 5
    And I also have the number 7
    When I multiply 5 with 7
    Then I get 35

  Scenario: Failing scenario for TES-1
    Given I have the number 5
    And I also have the number 8
    When I multiply 5 with 8
    Then I get 40
