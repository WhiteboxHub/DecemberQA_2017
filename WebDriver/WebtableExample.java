package com.wbl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableExample {

	public static void main(String[] arg)
	{
		//1. load the driver into the environment
	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\dhwan\\eclipse-workspace\\DecemberExample\\Resource\\chromedriver.exe");
   //2. Create the instance of the driver 
    WebDriver driver = new ChromeDriver();
    //3. Load the given URL in the browser. it should be complete URL
    driver.get("http://toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
	
    WebElement parentObj=driver.findElement(By.xpath("//*[@id='post-2924']/div[1]/div[2]/div/div/div[1]/div/table"));
    java.util.List<WebElement> tRows = parentObj.findElements(By.tagName("tr"));
    for(int i=1;i<tRows.size();i++){
		WebElement myRow=tRows.get(i);
		java.util.List<WebElement> tCol = tRows.get(1).findElements(By.tagName("td"));
		for(int j=1;j<tCol.size()-1;j++){
			WebElement myCol=tCol.get(j);
			//System.out.println(myCol.getText()+" ");
			
			
			System.out.println(myRow.getText());
			
			
		}
		System.out.println();
	}
	
	
}}
