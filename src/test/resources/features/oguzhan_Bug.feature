@US_06_Bug
Feature: US-6 _Bug Deans should be able to create a Vice Dean account.

  Background: dean_creates_viceDeans
    Given go to homepage
    When click login button
    And enter username "Final Project"
    And enter password "123Pro_*Je"
    And click login
    Then verify user logged in
    When click menu button
    And click Vice Dean Management
    Then verify User sees Vice Dean Management header

  @TC_01_US6
  Scenario: TC-1 Testing if the Dean can create Male VD account successfully.
    When user click name box "ALICAN1"
    And user click surname box "LongBaseL"
    And user click Birth Place box "California"
    And user click male in gender "Male"
    And user enters birthday "10-10-1991"
    And user enters phone number as xxx-xxx-xxxx  "145-456-5553"
    And user enters SSN as xxx-xx-xxxx "123-44-7892"
    And user enters userName as "deneme1234"
    And user enters password (at least eight characters, one number, uppercase letter, lowercase letter) as "Pro123JEcT"
    And user click submit
    Then verify Vice dean Saved
    When user signed out