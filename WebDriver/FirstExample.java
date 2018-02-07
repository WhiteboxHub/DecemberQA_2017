package com.wbl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample {
	 public static void main(String[] args) {
		  
		  //1. load the driver into the environment
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\dhwan\\eclipse-workspace\\DecemberExample\\Resource\\chromedriver.exe");
		   //2. Create the instance of the driver 
		    WebDriver driver = new ChromeDriver();
		    //3. Load the given URL in the browser. it should be complete URL
		    driver.get("http://www.whiteboxqa.com");
		    //find the webelement, perform action, compare actual expected
		    WebElement webelement =  driver.findElement(By.cssSelector("#navbar-collapse > ul > li:nth-child(3) > a"));//xpath("//*[@id='navbar-collapse']/ul/li[3]/a"));
		    webelement.click();
		    System.out.println("Title:" +driver.getTitle());
		    
		    
		    
}
}
