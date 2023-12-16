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
      When click menu button
      And click choose lesson management button
      And click lesson program
      And click choose lesson button
      Then choose lesson

     @TC_03
     Scenario: Vice Dean should be able to select a semester,day for the course and the start,end time
       When click menu button2
       And  click lesson management
       And  choose education term
       And  click 'choose day'
       And  choose day
       Then click start time
       And  choose start time
       And  click stop time
       Then choose stop time
       And  click submit button
       And  verify submit button clicked



