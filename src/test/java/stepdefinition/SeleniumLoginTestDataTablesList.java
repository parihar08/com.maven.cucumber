package stepdefinition;
//package stepdefinition;
//
//import java.util.List;
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
//public class SeleniumLoginTestDataTables {
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

		//We can pass only one data value without header using list data tables
//		
//		List<List<String>> data = credentials.raw(); //Will give list of list of strings and give us datatable accesss from feature file
//	    WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
//		emailField.sendKeys(data.get(0).get(0)); //From 0th row get 0th element > pointing to test@email.com
//		WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
//		passwordField.sendKeys(data.get(0).get(1));
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
