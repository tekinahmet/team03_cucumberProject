
@US_10
Feature: US_10 Vice Deans should be able to create a lesson schedule.


    @TC_01
   Scenario: : TC_01 Vice Dean should login successfully.
      Given go to homepage
      When  click login button
      And   enter username "TonyStark123"
      And   enter password "TonyStark123"
      And   click login



    @TC_02
    Scenario: Vice Dean should be able to select a course
      When click menu button
      And  click choose lesson management button
      And  click lesson program
      And  click choose lesson button
      Then choose lesson


     @TC_03
     Scenario: Vice Dean should be able to select a semester,day for the course and the start,end time
       When click 'choose education term'
       And  choose day
       And  choose start time
       And  choose stop time
       And  click submit button
       And  verify submit button clicked
