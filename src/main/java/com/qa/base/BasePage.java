package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasePage {
	
	public static WebDriver driver;
	public static Properties prop;

		
	public BasePage(){
		try{
		prop = new Properties();
			FileInputStream fis = new FileInputStream("/Users/Parihar08/Documents/workspace/com.maven.cucumber/"
					+ "src/main/java/com/qa/config/config.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	public static void initialization(){
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().fullscreen();
		}
		else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();;
		}
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

		}
}
