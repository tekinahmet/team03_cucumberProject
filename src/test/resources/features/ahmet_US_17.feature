@US_17
  Feature: US_17 The teacher should be able to give grades to the students.

  Background: successful_login
    Given navigate to homepage "https://managementonschools.com/"
    When click on login button
    And enter user name "teacherjack"
    And enter Password "Sparrow123"
    And click on login


@US_17_TC_01
  Scenario: TC_01 User should login successfully.
  Then verify User signed in
  When User logged out


@US_17_TC_02
  Scenario Outline: TC_02 The lesson, student and semester should be selectable.
    When click on Choose Lesson option
    And select "<lesson>" assigned to user
    And click on Choose Student option
    And select a "<student>"
    And click on Choose Education Term option
    And select an education semester

  Examples: test_data
    |lesson    |student   |
    |Literature|Adam Fawer|


