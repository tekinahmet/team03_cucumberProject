@US_12
Feature: US_012 ViceDean lesson management

  Background: login_successfully
    Given go to homepage "managementOnSchools"
    When click login button
    And enter username "ViceDeanName"
    And enter password "ViceDeanPasswprd"
    And click login



  @TC_01
  Scenario: Vice Dean Assign a lesson to the teacher
    When  Click on the menu
    And   Navigate lesson managment
    And   Select a Lesson from Lesson Program Assignment List
    And   choose a teacher from the list
    And   Click on submit button
    Then  Verify that 'Lesson added to teacher' is shown on popup
    And   logout



  @TC_02
  Scenario: Attempt to Schedule Duplicate Lesson
    Given   the user is on the Lesson Management page
    When    select a lesson
    And     select another lesson with the same hour and day
    And     choose the a teacher from the list
    And     clicks the submit button
    Then    the message 'Course schedule cannot be selected for the same hour and day' should be displayed
    And     logout


  @TC_03
  Scenario: Assign Multiple Lessons to a Teacher
    Given   the user is on the Lesson Management Page
    And     Navigate to Lesson Programme Assignment List
    When    select multiple lessons from the list
    And     choose a teacher from the teacher list
    And     clicks the submit button
    Then    verify that the selected lessons are assigned to the teacher
    And     logout