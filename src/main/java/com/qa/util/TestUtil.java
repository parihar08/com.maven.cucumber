package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.base.BasePage;


public class TestUtil extends BasePage{
	
	public static String fileDirectory;
	public static String fileName;
	
	public static void shortWait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void mediumWait() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void longWait() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void takeScreenshotAtEndOfTest() throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		//File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
		Date dateobj = new Date();
		//System.out.println(df.format(dateobj));
		//FileUtils.copyFile(srcFile,new File(currentDir + "/screenshots/"+System.currentTimeMillis()+".png"));
		fileDirectory = currentDir + "/screenshots/"+df.format(dateobj)+".png";
		FileUtils.copyFile(srcFile,new File(fileDirectory));
		fileName = df.format(dateobj)+".png";
	}
}
