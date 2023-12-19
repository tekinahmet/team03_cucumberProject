@us09
Feature: Vice Deans should be able to view the lesson list and make updates

  Background: login in the application
  Given : User navigates to home page "https://managementonschools.com"
  And Click on Login Button
  And type User Name, Password and Click on the login button

  Scenario:TC_01 Check if the lessons list is visible

    Given : Click Menu from right top off the page

      And Click Lesson Management from the Left Menu Bar
      And Click Lessons
      Then Check the page if created Lesson names are visible
      Then Check the page if created Compulsories are visible
      Then Check the page if created Credit Scores are visible
      Then close the browser

