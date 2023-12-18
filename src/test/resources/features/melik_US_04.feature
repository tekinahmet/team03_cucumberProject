@US_04
Feature: Admin should be able to add Dean

  Background: User should be logged in the website
    Given User navigates to the "https://managementonschools.com/"
    When  User clicks the login button at the top of page
    And   User enters the username as "AdminProject13"
    And   User enters the password as "Project13+"
    And   User clicks the login button
    And   User clicks the menu button
    And   User clicks the Dean Management button
    And   Verify that Admin is on Dean Management page

  Scenario: Successfully adding Dean by Admin
    When User enters the name "Name"
    And User enters the surname "Surname"
    And User enters Birth Place "Birth Place"
    And User clicks the Male in the gender
    And User enters the Date of Birth
    And User enters the phone number "phone number" as xxx-xxx-xxxx
    And User enters the Ssn Number "Ssn Number" as xxx-xx-xxxx
    And User enters the User Name "User Name"
    And User enters Password "Password" (at least eight characters, one number, uppercase letter, lowercase letter)
    And User click the submit button