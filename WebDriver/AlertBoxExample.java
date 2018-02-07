package com.wbl.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/selenium/delete_customer.php");// navigate to the URl
			driver.findElement(By.name("cusid")).sendKeys("500");
			driver.findElement(By.name("submit")).click();// for submit---
			
			Alert alert=driver.switchTo().alert();
			
			String alertmessage=driver.switchTo().alert().getText();
			
			System.out.println(alertmessage);
			
			alert.accept();
			try{
			Thread.sleep(4000);
			
			
				Alert alert1=driver.switchTo().alert();
				
				String alertmessage1=driver.switchTo().alert().getText();
				System.out.println(alertmessage1);
				
				alert1.accept();
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
				driver.close();
			}
			driver.close();
		}

	}
