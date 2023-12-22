@US_19
Feature: "The teacher should be able to create meetings with students.


  Background: login in the application as a Teacher
    Given : User navigates to home page "https://managementonschools.com"
    And Click on Login Button
    And Type UserName "teacherjane" and Password "janeTeacher9"
    And Click on the login button

    @US_19_TC_01
    Scenario: Create a Student Meeting when user in the Teacher account
      Given Click Menu from right top off the page in teacher page
    And Click Meet Management from the Left Menu Bar
      And Click Dropdown from Student List
      And Set Student name "Abby Abernaty"
    And Choose a Valid date From Date of Meet section
    And enter a start time for the meeting
    And enter valid stop time for meeting
    And type a Description related to meeting
    And Click Submit Button
      Then verify if meeting created successfully
    Then Verify if Student selected successfully and visible on the list
    Then Verify if Meeting date selected successfully and visible
    Then Verify if Meeting time selected successfully and visible
    Then verify Description is visible on the created meeting
      Then close the browser


  @US_19_TC_02
  Scenario: Create a Student Meeting for more then one students
    Given Click Menu from right top off the page in teacher page
    And Click Meet Management from the Left Menu Bar
    And Click Dropdown from Student List
    And Choose two Students names are "Adam Connor","Alberto Dino"
    And Choose a Valid date From Date of Meet section
    And enter a start time for the meeting
    And enter valid stop time for meeting
    And type a Description related to meeting
    And Click Submit Button
    Then verify if meeting created successfully
    Then Verify if Student selected successfully and visible on the list
    Then Verify if Meeting date selected successfully and visible
    Then Verify if Meeting time selected successfully and visible
    Then verify Description is visible on the created meeting

@US_19_TC_03
Scenario: User should not be able to Choose Past Dates for Meeting Date

  Given Click Menu from right top off the page in teacher page
    And Click Meet Management from the Left Menu Bar
    And Click Dropdown from Student List
    And Set Student name "Abby Abernaty"
  And Choose an UNValid date From Date of Meet section
   And enter a start time for the meeting
   And enter valid stop time for meeting
   And type a Description related to meeting
    And Click Submit Button
    Then verify if meeting couldn't created successfully
    Then close the browser

  @US_19_TC_04
  Scenario: User should not be able to Choose stop time smaller than, or equal to start time

    Given Click Menu from right top off the page in teacher page
    And Click Meet Management from the Left Menu Bar
    And Click Dropdown from Student List
    And Set Student name "Abby Abernaty"
    And Choose a Valid date From Date of Meet section
    And enter a start time for the meeting
    And enter an INVALID stop time which is before the start time for meeting
    And type a Description related to meeting
    And Click Submit Button
    Then verify if ERROR message has displayed for times
    Then close the browser
