@US_16
Feature: US_16 The Vice Dean should be able to view the messages sent by users.



  Background: login_successfully
    Given go to homepage
    When click login button
    And enter username "HankTheVD"
    And enter password "321Pro-*Je"
    And click login

  @TC_01
  Scenario: TC_01 User should login successfully.
    Then verify User logged in
    When User signed out

  @TC_02
  Scenario: TC_02 VD should be able to see the delete button.
    When click menu button
    And click Contact Get All
    Then verify User sees Contact Message header
    And verify User sees Delete button
    When User signed out

  @TC_03
  Scenario: TC_03 VD should be able to view messages, authors, emails, sending dates and subject information.
    When click menu button
    When click Contact Get All
    And verify User sees Contact Message header
    And verify User sees Name
    And verify User sees Email
    And verify User sees Date
    And verify User sees Subject
    And verify User sees Message
    When User signed out

  @TC_04
  Scenario: TC_04 VD should be able to delete messages.
    When click menu button
    And click Contact Get All
    Then verify User sees Contact Message header
    And verify User deletes messages
    When User signed out
#   Then User closes the driver