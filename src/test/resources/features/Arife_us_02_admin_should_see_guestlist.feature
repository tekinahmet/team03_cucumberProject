@US_02
Feature: Admin should be able to see the guest user list
  Background: login as Admin
    Given go to the "managementOnSchools"


  Scenario:TC_01_See the guest user
    And login as Admin
    Given  click on Menu button
    When click on Guest User
    Then Verify name, phone number, Ssn and user name exist on the page
    Then close driver



  Scenario: TC_02_Delete the guest user
    And login as Admin
    Given  click on Menu button
    When click on Guest User
    Then click on >>arrow button to go to the last page
    Then click on delete icon
    Then verify the information of the user is deleted
    Then close driver






