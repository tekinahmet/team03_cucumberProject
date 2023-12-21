
@US_20
  Feature: US_20 The teacher should be able to view, update and delete meetings.


    @TC_01
    Scenario: TC_01 Teacher should login successfully
      Given go to homepage
      When  click on login button
      And   enter username "teacherjane"
      And   enter password "janeTeacher9"
      And   click login

    @TC_02
    Scenario: The Date, Start Time, Stop Time and Description of the meetings should be visible to the teacher
      Given click menu
      And click meet management
      And verify date time enter
      And verify start time enter
      And verify stop time enter
      Then verify description enter
    @TC_03
    Scenario: The teacher should be able to update and delete meetings
      Given click menu button
      And   click meet management button
      And click edit button
      And change date of meet
      #And change start time
      #And change stop time
      #And delete description
      #And add new description
      Then click changed submit button
      And close meeting
      And delete meetings




