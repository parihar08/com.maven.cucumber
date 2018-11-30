//package stepdefinition;
//
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class SeleniumLoginTestDataTablesMap {
//	
//	WebDriver driver;
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
//	@When("^User enters username and password$")
//	public void user_enters_UserName_and_Password(DataTable credentials) {
//		
//		for(Map<String,String> data : credentials.asMaps(String.class, String.class))
//		//Will return map object and iterate over it to access data from feature file
//		//We can pass multiple data values using map data tables
//		{
//			WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
//			emailField.sendKeys(data.get("username")); //pointing to test@email.com
//			WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
//			passwordField.sendKeys(data.get("password"));
//		}
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
