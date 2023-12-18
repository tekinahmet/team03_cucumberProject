@US_22_TC_04F @ff
Feature:US_22 Add admin.

  Background: log in
    Given User goes to the "https://managementonschools.com/"
    When click on login button
    And enter the username "AdminProject13"
    And enter the password "Project13+"
    And click on login
    Then must see the Add Admin on the page


    Scenario: TC_04 Testing the year section  with critical years
      And User enters a name
      And  User  enters a surname
      And User enters a birth place
      And User chooses a gender (clicks on male or female)
      And User enters a date (trying critical values)
      And User enters a phone number as required
      And  User enters a SSN as required
      And  User enters an username
      And User enters a password as required
      And User clicks on the submit button
     Then user should not be able to log in with that imposible date


