Feature: HubSpot Login
  Description: This feature is used to test the HubSpot Login functionality
	
  Scenario: Validate HubSpot HomePage Test
    Given User opens the browser
    When User is on Login Page
    Then User logs into application
    Then Home Page Tile validation
    Then Validate Home Page Header
    Then Validate logged in user
    And Application should be closed
 


