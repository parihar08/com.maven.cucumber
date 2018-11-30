Feature: Login
Description: This feature is used to test the Login functionality
  
Scenario: Successful Login with Valid Credetials using DataTables

    Given User is on Home Page
    When User enters username and password
     | username			            | password   |
     | test@                    | abc        |
     | email.com                | abc        |
    And Clicks Go Button
    Then He can visit the Practice Page
    And A message is displayed
    Then Application should be closed
