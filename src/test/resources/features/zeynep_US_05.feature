@US_05
  Feature: US_05 Admins should be able to see and delete Deans
    Background: login
      Given go to webpagee
      When click on loginn
      And enter usernamee "AdminProject13"
      And enter passwordd "Project13+"
      And click login buttonn
      And click on Menu buttonn
      And click on Dean Management

    @US_05_TC_01
      Scenario: Admin should be able to see Name, Gender, Phone Number, SSN and User Name information of Deans
        Then Verify Name column is visible
        Then Verify Gender column is visible
        Then Verify Phone Number column is visible
        Then Verify SSN column is visible
        Then Verify User Name Information is visible

    @US_05_TC_03
      Scenario: Admin should be able to update Deans
        Then Click on edit button at the end of the row
        And enter name
        And enter surname "sahlo"
        And birth place "london"
        And gender
        And date of birth "01.01.2001"
        And phone number "444-789-7894"
        And ssn "444-44-7894"
        And user name information "DeanFolina"
        And passwordz "Project13+"
        And click on submit button
        Then Verify that Dean updated successful message is visible
