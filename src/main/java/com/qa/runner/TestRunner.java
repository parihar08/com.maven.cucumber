package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;  //Cucumber Options are settings for our test
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true, // it displays output in a readable manner
		dryRun = false,  //It checks if any of the steps in the feature file has the step definition defined. By default is false
		//features= "feature/logintest.feature", 
		features= "/Users/Parihar08/Documents/workspace/com.maven.cucumber/src/main/java/com/qa/features/HubSpot.feature", //It helps cucumber to locate the feature file
		glue={"com/qa/stepdefinitions"},//It helps cucumber to locate the step definition file
		plugin = {"html:target/cucumber-html-report","json:target/cucumber.json","html:pretty/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"}, //to generate reports
		strict = true,
		//tags = {"@RegressionTest", "@SmokeTest"} //AND operator. execute scenario tagged as both Regression and Smoke
		//tags = {"@End2End, @RegressionTest"} //OR operator. execute scenario tagged as either E2E or Regression
		//tags = {"~@RegressionTest", "@SmokeTest"} //Ignores Regression Test with ~ sign
		tags = {"~@End2End, @~RegressionTest", "~@SmokeTest"} //Execute all the test cases that are not tagged
		)

public class TestRunner {

}