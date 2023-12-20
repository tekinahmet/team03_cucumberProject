@US_06
Feature: US-6 Deans should be able to create a Vice Dean account.

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




@TC_02_US6
  Scenario: TC-2 Testing if the Dean can create Female VD account successfully.
  When user click name box "ALICIA"
  And user click surname box "ShortBase1"
  And user click Birth Place box "LitteHill"
  And user click female in gender "Female"
  And user enters birthday "11-05-1975"
  And user enters phone number as xxx-xxx-xxxx  "145-457-5551"
  And user enters SSN as xxx-xx-xxxx "183-44-7894"
  And user enters userName as "denemE12345"
  And user enters password (at least eight characters, one number, uppercase letter, lowercase letter) as "Pro123JEEcT"
  And user click submit
  Then verify Vice dean Saved
  When user signed out

@TC_03_US6
  Scenario: TC-3 Testing if the Dean is able to create VD account by leaving VD's Personal info blank
  And User directly clicks on the submit button
  Then verify that the user sees a red Required warning each box
  When user signed out

@TC_4_US6
 Scenario: Dean should not be able to create VD account by providing wrong format for the SSN
 When user click name box "ALICIA"
 And user click surname box "ShortBase1"
 And user click Birth Place box "LitteHill"
 And user click female in gender "Female"
 And user enters birthday "11-05-1975"
 And user enters phone number as xxx-xxx-xxxx  "145-457-5551"
 And user enters SSN in wrong format
 And user enters userName as "denemE12345"
 And user enters password (at least eight characters, one number, uppercase letter, lowercase letter) as "Pro123JEEcT"
 And user click submit
 Then verify that the user sees a red wrong SSN warning at related box
 When user signed out

@TC_5_US6
Scenario: Testing if the Dean is able to create VD account with wrong format password(less than 8 characters)
When user click name box "ALICAN1"
And user click surname box "LongBaseL"
And user click Birth Place box "California"
And user click male in gender "Male"
And user enters birthday "10-10-1991"
And user enters phone number as xxx-xxx-xxxx  "145-456-5553"
And user enters SSN as xxx-xx-xxxx "123-44-7892"
And user enters userName as "deneme1234"
And user enters password less than eight characters as "Trial12"
And user click submit
Then verify user sees At least 8 characters warning
When user signed out

@TC_6_US6
Scenario: Testing if the Dean is able to create VD account with wrong format password (without upper case)
    When user click name box "ALICAN1"
    And user click surname box "LongBaseL"
    And user click Birth Place box "California"
    And user click male in gender "Male"
    And user enters birthday "10-10-1991"
    And user enters phone number as xxx-xxx-xxxx  "145-456-5553"
    And user enters SSN as xxx-xx-xxxx "123-44-7892"
    And user enters userName as "deneme1234"
    And user enters password less than eight characters as "trial1234"
    And user click submit
    Then verify user sees missing upper case warning
    When user signed out

@TC_7_US6
  Scenario: Testing if the Dean is able to create VD account with wrong format password(without lowercase character)
    When user click name box "ALICAN1"
    And user click surname box "LongBaseL"
    And user click Birth Place box "California"
    And user click male in gender "Male"
    And user enters birthday "10-10-1991"
    And user enters phone number as xxx-xxx-xxxx  "145-456-5553"
    And user enters SSN as xxx-xx-xxxx "123-44-7892"
    And user enters userName as "deneme1234"
    And user enters password less than eight characters as "TRIAL12345"
    And user click submit
    Then verify user sees missing One lowercase character
    When user signed out

@TC_8_US6
  Scenario: Testing if the Dean is able to create VD account with wrong format password(without a number)
    When user click name box "ALICAN1"
    And user click surname box "LongBaseL"
    And user click Birth Place box "California"
    And user click male in gender "Male"
    And user enters birthday "10-10-1991"
    And user enters phone number as xxx-xxx-xxxx  "145-456-5553"
    And user enters SSN as xxx-xx-xxxx "123-44-7892"
    And user enters userName as "deneme1234"
    And user enters password less than eight characters as "TRIALtest"
    And user click submit
    Then verify user sees missing One number character
    When user signed out
    Then user closes driver











