@scenario_outline_1 @regression
Feature: search_feature
  Background: navigate_to_google
    Given user navigates to "https://www.google.com"

  Scenario Outline: TC_search_items
    And user search for "<search_item>" on google
    Then user verifies page title contains "<search_item>"
    Then close the application

    Examples: test_data
      | search_item |
      | iPhone      |
      | apple       |
      | tesla       |
      | tea pot     |
      | toyota      |


#Scenario: --->>> Scenario Outline :
#Examples: must be added to pass the test data
#"test data" --->>> "<column_name>"
#in this example, there is 1 scenario outline, but 5 scenarios since this repeats 5 times