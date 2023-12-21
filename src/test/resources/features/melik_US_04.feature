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

    @US_04_TC_01
  Scenario: Successfully adding Dean by Admin
    When User enters the name "Name"
    And User enters the surname "Surname"
    And User enters Birth Place "Birth Place"
    And User clicks the Male in the gender
    And User enters the Date of Birth
    And User enters the phone number "phone number" as xxx-xxx-xxxx
    And User enters the Ssn Number "Ssn Number" as xxx-xx-xxxx
    And User enters the User Name "User Name"
    And User enters Password "Valhalla12"
    And User click the submit button
    Then Verify that the alert is visible Dean Saved
    And Close the application


   @US_04_TC_02
  Scenario Outline: Unsuccessfull adding Dean ( Personal Information should not be left blank)
    When User leaves blank into the name "<Name>"
    And User leaves blank into the Surname "<Surname>"
    And User leaves blank into the Birth Place "<Birth Place>"
    And User clicks the Male in the gender
    And User leaves blank into the Date of Birth "<Date of Birth>"
    And User leaves blank into the Phone number "<Phone number>"
    And User leaves blank into the Ssn Number "<Ssn Number>"
    And User leaves blank into the User Name "<User Name>"
    And User leaves blank into the Password "<Password>"
    And User click the submit button
    Then Verify that the text is visible as Required
    And Close the application
    Examples:
      | Name | Surname | Birth Place | Date of Birth | Phone number | Ssn Number | User Name | Password |
      |      |         |             |               |              |            |           |          |

  @US_04_TC_03
  Scenario Outline: Unsuccessfull adding Dean ( by using invalid SSN)
    When User enters the name "Name"
    And User enters the surname "Surname"
    And User enters Birth Place "Birth Place"
    And User clicks the Male in the gender
    And User enters the Date of Birth
    And User enters the phone number "phone number" as xxx-xxx-xxxx
    And User enters the invalid Ssn Number "<Ssn Number>" as xxx-xx-xxxx
    And User enters the User Name "User Name"
    And User enters Password "Valhalla12"
    And User click the submit button
    Then Verify that the alert is visible Please enter valid SSN number
    And Close the application
    Examples:
      | Ssn Number  |
      | 22-2452-875 |
      | 222-45-875a |
      | 222-45-875@ |

  @US_04_TC_04
  Scenario Outline: Unsuccessfull adding Dean ( by using invalid SSN)
    When User enters the invalid Ssn Number "<Ssn Number>" as xxx-xx-xxxx
    And User click the submit button
    Then Verify that the text is visible for Ssn Number
    And Close the application
    Examples:
      | Ssn Number |
      | 22245-2875 |
      | 222-452875 |
      | 222452875  |


  @US_04_TC_05
  Scenario Outline: Unsuccessfull adding Dean ( by using invalid Password)
    When User enters invalid Password "<Password>"
    And User click the submit button
    Then Verify that the text is visible for password
    And Close the application
    Examples:
      | Password    |
      | better1     |
      | better12    |
      | BETTER12    |
      | BetterBread |


