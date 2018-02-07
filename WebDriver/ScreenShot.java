package com.wbl.test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhwan\\eclipse-workspace\\DecemberExample\\Resource\\chromedriver.exe");
		   //2. Create the instance of the driver 
		    WebDriver driver = new ChromeDriver();
		    //3. Load the given URL in the browser. it should be complete URL
		    driver.get("http://toolsqa.com/automation-practice-form/");
		//Capturing the SS in Webdriver
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:/Users/dhwan/Desktop/MyScreen.jpg"));
		driver.quit();
	}
}
