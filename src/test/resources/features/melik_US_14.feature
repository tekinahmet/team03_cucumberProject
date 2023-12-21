@US_14
Feature: Vice Dean should be able to see and update teachers

  Background: User should be logged in the website
    Given User navigates to the "https://managementonschools.com/"
    When  User clicks the login button at the top of page
    And   User enters the username as "Valhalla"
    And   User enters the password as "Valhalla12"
    And   User clicks the login button
    And   User clicks the menu button
    And   User clicks the Teacher Management button
    And   Verify that User is on Teacher Management page
    Then verify whether the created FelixKeeling as username are visible in the list for user


  Scenario: Vice Dean should be able to see and uptade Teacher Information Successfully
    And  User clicks the edit button
    And  User choose a lesson
    And User types the name
    And User types the surname
    And User types Birth Place
    And User types email into the emailbox
    And User types the phone number as xxx-xxx-xxxx
    And User types the Ssn Number as xxx-xx-xxxx
    And User clicks the is advisor teacher
    And User clicks the Female in the gender
    And User types the Date of Birth
    And User types the UserName
    And User types Password "Valhalla12"
    And User clicks the Submit button for teacher
    Then verify that Teacher updated Successful
