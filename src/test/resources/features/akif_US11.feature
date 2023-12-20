@US11_ViceDeanManagement

  Feature: US_11 Vice Deans should be able to view the lesson schedule and make updates.

    Background: User should go to website and click on login button
      Given user goes to url "https://managementonschools.com/"
      When click on login button at the top right
      Then verify that login page opened

      @US11_TC01
      Scenario: Vice Dean should be able to view the Lesson, Day, Start Time and Stop Time created.

        And Enter vice dean credentials "TonyStark123" and "TonyStark123"
        And Click on the login button below the password field
        And Click on the Lesson Program tab
        Then Verify that lesson, day, start time and stop time information displayed on the page
