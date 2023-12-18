@US_22_TC_03F @ff
Feature:US_22 Add admin.

  Background: log in
    Given User goes to the "https://managementonschools.com/"
    When click on login button
    And enter the username "AdminProject13"
    And enter the password "Project13+"
    And click on login
    Then must see the Add Admin on the page

  Scenario: Testing the gender section
And User enters a name
And User  enters a surname
And User enters a birth place
And User leaves the blank gender section
And User enters a birth date
And User enters a phone number as required
And User enters a SSN as required
And  User enters an username
And  User enters a password as required
And  User clicks on the submit button
Then the user must not be able to add admin


