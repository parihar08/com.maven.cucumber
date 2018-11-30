Feature: Login
  Description: This feature is used to test the Login functionality
   
   
  @SmokeTest  
  Scenario: Navigate to Homepage
    Given User is on Home Page
     
  @RegressionTest
  Scenario: Navigate to Practice Page
    Given User is on Home Page
    When User enters "test@email.com" and "abcabc"
    And Clicks Go Button
    Then He can visit the Practice Page
        
  @RegressionTest @SmokeTest
  Scenario: User Click on Go Button
    Given User is on Home Page
    When User enters "test@email.com" and "abcabc"
    And Clicks Go Button
    
  @End2End   
  Scenario: Successful Login with Valid Credetials
    Given User is on Home Page
    When User enters "test@email.com" and "abcabc"
    And Clicks Go Button
    Then He can visit the Practice Page
    And A message is displayed
    Then Application should be closed
    
  @RegressionTest @SmokeTest @End2End  
  Scenario: Verify message should be displayed
    Given User is on Home Page
    When User enters "test@email.com" and "abcabc"
    And Clicks Go Button
    Then He can visit the Practice Page
    And A message is displayed
    Then Application should be closed