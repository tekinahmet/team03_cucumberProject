@US_03 @regression
Feature:User should be able to send messages from contact page
  Background:Go_to_Homepage
    Given user navigates to "https://managementonschools.com/"

  @US03_TC01
  Scenario Outline:user sending successful message
    And user clicks on contact link
    And user enters name "<name>"
    And user enters valid email address "<email>"
    And user enters subject "<subject>"
    And user enters message "<message>"
    And user clicks on send message button
    Then verify contact message created successfully confirmation appear
    Examples: test_data
      | name | email       | subject | message      |
      | kate | abd@abc.com | Maths   | This is text |

  @US03_TC02
  Scenario:User sending message with no name no subject and message
    And user clicks on contact link
    And user enters valid email address "abd@abc.com"
    And user clicks on send message button
    Then verify the required message is visible




  @US03_TC03
  Scenario Outline:User sending message with invalid email
    And user clicks on contact link
    And user enters name "<name>"
    And user enters valid email address "<email>"
    And user enters subject "<subject>"
    And user enters message "<message>"
    And user clicks on send message button
    Then verify please enter valid email message will appear
    Examples: test_data
      | name | email     | subject | message      |
      | kate | abdab.com | Maths   | This is text |