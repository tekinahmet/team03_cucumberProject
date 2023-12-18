@US_22_TC_02F @ff
Feature:US_22 Add admin.

  Background: log in
    Given User goes to the "https://managementonschools.com/"
    When click on login button
    And enter the username "AdminProject13"
    And enter the password "Project13+"
    And click on login
    Then must see the Add Admin on the page

  Scenario: TC_02 User leaves the blank everything
And User directly clicks on the submit button
Then verify that the user sees a red Required warning each box