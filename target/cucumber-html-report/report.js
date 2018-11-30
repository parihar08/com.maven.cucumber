$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Parihar08/Documents/workspace/com.maven.cucumber/src/main/java/com/qa/features/HubSpot.feature");
formatter.feature({
  "line": 1,
  "name": "HubSpot Login",
  "description": "Description: This feature is used to test the HubSpot Login functionality",
  "id": "hubspot-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate HubSpot HomePage Test",
  "description": "",
  "id": "hubspot-login;validate-hubspot-homepage-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User logs into application",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Home Page Tile validation",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate Home Page Header",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Validate logged in user",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Application should be closed",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_opens_the_browser()"
});
formatter.result({
  "duration": 7990641618,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 24242357,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 947754570,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.home_Page_is_displayed()"
});
formatter.result({
  "duration": 4475277795,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_Home_Page_Header()"
});
formatter.result({
  "duration": 1644038991,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_user()"
});
formatter.result({
  "duration": 109210652,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.application_should_be_closed()"
});
formatter.result({
  "duration": 229957143,
  "status": "passed"
});
});