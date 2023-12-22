@US_09
Feature: Vice Deans should be able to VIEW/DELETE/UPDATE lessons

  Background: login in the application as a vice dean
  Given : User navigates to home page "https://managementonschools.com"
  And Click on Login Button
  And Type UserName "techprojane" and Password "Janetechpro1"
  And Click on the login button

    @US_09_TC_01
  Scenario:TC_01 Check if the lessons list is visible

    Given : Click Menu from right top off the page

      And Click Lesson Management from the Left Menu Bar
      And Click Lessons
      Then Check the page if created Lesson names are visible
      Then Check the page if created Compulsories are visible
      Then Check the page if created Credit Scores are visible
      Then close the browser

  @US_09_TC_02
  Scenario: TC_02 Vice Dean Should be able to DELETE Lesson

    Given : Click Menu from right top off the page
      And Click Lesson Management from the Left Menu Bar
      And Click Lessons
      And Click from first row Delete Icon from the Lessons list below
      Then Check if there is a succession message for the deleted Lesson
      Then Assert Lesson you deleted not on the list anymore
      Then close the browser

  @US_09_TC_03
  Scenario: TC_03 Vice Dean Should be able to DELETE Lesson

    Given : Click Menu from right top off the page
    And Click Lesson Management from the Left Menu Bar
    And Click Lessons
    And Inspect if there is any update section
    Then close the browser









