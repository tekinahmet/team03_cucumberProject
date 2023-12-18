@US_22_TC_06F @ff
Feature:US_22 Add admin.

  Background: log in
    Given User goes to the "https://managementonschools.com/"
    When click on login button
    And enter the username "AdminProject13"
    And enter the password "Project13+"
    And click on login
    Then must see the Add Admin on the page


  Scenario: TC_06 Testing password requirements
    And User enters a password just one char
    Then It has to appear "At least 8 characters" on the below
    And User enters a password all lowercase eight char
    Then It has to appear "One uppercase character" on the below
    And User enters a password all uppercase eight char
    Then It has to appear "One lowecase character" on the below
    And User enters a password with one uppercase but without number
    Then  It has to appear "One number" on the below


