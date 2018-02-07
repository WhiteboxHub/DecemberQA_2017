package com.wbl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] arg)
	{
		//1. load the driver into the environment
	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\dhwan\\eclipse-workspace\\DecemberExample\\Resource\\chromedriver.exe");
   //2. Create the instance of the driver 
    WebDriver driver = new ChromeDriver();
    //3. Load the given URL in the browser. it should be complete URL
    driver.get("http://toolsqa.com/automation-practice-form/");
    WebElement chhk1=driver.findElement(By.xpath("//*[@id=\'profession-0\']"));
    chhk1.click();
    WebElement chhk2=driver.findElement(By.xpath("//*[@id='profession-1']"));
   chhk2.click();
  
	
	
	
	
}
}
