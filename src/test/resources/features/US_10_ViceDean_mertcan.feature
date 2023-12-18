@US_10
Feature: US_10 Vice Deans should be able to create a lesson schedule.

  @TC_01
   Scenario: : TC_01 Vice Dean should login successfully.
      Given go to homepage
      When  click login button
      And   enter username "AdminProject13"
      And   enter password "Project13"
      And   click login
      Then  verify User logged in

    @TC_02
    Scenario: Vice Dean should be able to select a course
      When click lesson program
      And click choose lesson management button
      And click choose lesson button
      Then choose lesson


     @TC_03
     Scenario: Vice Dean should be able to select a semester,day for the course and the start,end time
       When click 'choose education term'
       And  choose education term
       And  click 'choose day'
       And  choose choose day
       Then choose day
       And  click start time
       Then choose start time
       And  click stop time
       Then choose stop time
       And  click submit button
       And  verify submit button clicked



