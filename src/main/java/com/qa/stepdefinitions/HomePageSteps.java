package com.qa.stepdefinitions;

import org.junit.Assert;

import com.qa.base.BasePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends BasePage{
	
	LoginPage loginPage;
	HomePage homePage = new HomePage();
	
	@Given("^User opens the browser$")
	public void user_opens_the_browser()  {
		BasePage.initialization();    
	}

	@When("^User is on Login Page$")
	public void user_is_on_Login_Page()  {
		loginPage = new LoginPage(); 
		String title = loginPage.getLoginPageTitle();
		Assert.assertEquals("HubSpot Login", title);
	   
	}

	@Then("^User logs into application$")
	public void user_enters_username_and_password()  {
		homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^Home Page Tile validation$")
	public void home_Page_is_displayed()  {
		String homePageTitle = homePage.getHomePageTitle();
		Assert.assertEquals("Reports dashboard", homePageTitle);
	}

	@Then("^Validate Home Page Header$")
	public void validate_Home_Page_Header() { 
		String homePageHeader = homePage.getHomePageHeader();
		Assert.assertEquals("Sales Dashboard", homePageHeader);
	}

	@Then("^Validate logged in user$")
	public void validate_logged_in_user()  {
		String accountName = homePage.getLoggedInAccountName();
		Assert.assertEquals(prop.getProperty("accountname"), accountName);
	}
	
	@Then("^Application should be closed$")
	public void application_should_be_closed() {
	driver.quit();

	}

}
