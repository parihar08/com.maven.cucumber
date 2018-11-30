Feature: Login
  Description: This feature is used to test the Login functionality

	#Hooks are used to define the preconditions(@Before) and post conditions(@After)
  Scenario: Successful Login with Valid Credetials
    Given User is on Home Page
    When User enters "test@email.com" and "abcabc"
    And Clicks Go Button
    Then He can visit the Practice Page
    And A message is displayed
    Then Application should be closed
    
  Scenario: Verify message should be displayed
    Given User is on Home Page
    When User enters "test@email.com" and "abcabc"
    And Clicks Go Button
    Then He can visit the Practice Page
    And A message is displayed
    Then Application should be closed