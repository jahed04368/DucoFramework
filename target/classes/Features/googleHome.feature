Feature: google home page test

  @DucoTest
  Scenario Outline: User goes to Google Homepage
    Given user is on Google homepage
    When  User asserts google logo
    And the user enters "<search>"
    And user clicks search
    And User is shown their search
    Then user clicks on their desired site

    Examples:
      |search|
      |hudl|
  @DucoTest
  Scenario: I'm feeling lucky test
    Given user is on Google homepage
    When  User asserts google logo
    And user clicks on feeling lucky
    Then user asserts intro text

  @DucoTest
  Scenario: User goes to Google Homepage
    Given user is on Google homepage
    When  User asserts google logo
    Then user deletes last 1 hour activity