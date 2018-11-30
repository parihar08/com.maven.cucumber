Feature: Login
  Description: This feature is used to test the Login functionality

	#TaggedHooks are used to define global hooks(setUp and Tear down) and customized method hooks(only for a specific method)
	
	@SmokeTest  
  Scenario: Navigate to Homepage
    Given User is on Home Page
	
	@End2End
  Scenario: Successful Login with Valid Credetials
    Given User is on Home Page
    When User enters "test@email.com" and "abcabc"
    And Clicks Go Button
    Then He can visit the Practice Page
    And A message is displayed
    Then Application should be closed
    
    
  @RegressionTest  
  Scenario: Verify message should be displayed
    Given User is on Home Page
    When User enters "test@email.com" and "abcabc"
    And Clicks Go Button
    Then He can visit the Practice Page
    And A message is displayed
    Then Application should be closed