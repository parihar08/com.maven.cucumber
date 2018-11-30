Feature: Login
  Description: This feature is used to test the Login functionality

  Scenario Outline: Successful Login with Valid Credetials
    Given User is on Home Page
    When User enters "<username>" and "<password>"
    And Clicks Go Button
    Then He can visit the Practice Page
    And A message is displayed
    Then Application should be closed

    Examples: 
      | username                 | password   |
      | test@email.com           | abcabc     |
      | pari_indiana88@yahoo.com | parihar_08 |
