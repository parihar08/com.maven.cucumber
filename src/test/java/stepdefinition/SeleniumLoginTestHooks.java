//package stepdefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class SeleniumLoginTestHooks {
//	
//	WebDriver driver;
//	
//	@Before   //Import @Before and @After from cucumber.api java package
//	public void setUp() {
//		System.out.println("This will executed once at the beginning");
//	}
//	
//	@After
//	public void tearDown() {
//		System.out.println("This will executed once at the end");
//	}
//		
//		
//	@Given("^User is on Home Page$")
//	public void user_is_on_Home_Page() {
//		driver = new FirefoxDriver();
//		String baseURL = "http://www.letskodeit.com/";
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
//		driver.get(baseURL);
//		WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
//		signupLink.click();	
//		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
//		loginLink.click();
//	}
//
//	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_UserName_and_Password(String username, String password) {
//		
//	    WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
//		emailField.sendKeys(username);
//		WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
//		passwordField.sendKeys(password);
//		
//	}
//
//	@When("^Clicks Go Button$")
//	public void clicks_Go_Button() throws InterruptedException  {
//		WebElement goButton = driver.findElement(By.id("memberLoginDialogoklabel"));
//		goButton.click();
//		Thread.sleep(3000);
//	}
//	
//	@Then("^He can visit the Practice Page$")
//	public void he_can_visit_the_Practice_Page() {
//	    WebElement practicePage = driver.findElement(By.id("DrpDwnMn04label"));
//		practicePage.click();
//	}
//
//	@Then("^A message is displayed$")
//	public void a_message_is_displayed() {
//		System.out.println("Login Successful");
//	}
//	
//	@Then("^Application should be closed$")
//	public void application_should_be_closed() {
//		driver.quit();
//	}
//}
