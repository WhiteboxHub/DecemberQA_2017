package com.wbl.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("System.getProperty(user.dir)::"+System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", 
				  System.getProperty("user.dir")+"/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println("home page title:" +driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		List<WebElement> headerLinks=
				driver.findElements(By.xpath("//*[@id=\'nav-xshop\']/a"));
		for(WebElement e : headerLinks) {
		  System.out.println(e.getAttribute("class"));
		  System.out.println(e.getAttribute("color"));
		  System.out.println(e.getCssValue("color"));
		  System.out.println(e.getText());
		  System.out.println("--------------");
		}
		//#nav-link-prime > span.nav-line-2
		WebElement element = driver.findElement(By.cssSelector("#nav-link-prime .nav-line-2"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		//action.moveToElement(element).build().perform();
		
		//.prime-button-try > a
		//[href="\/gp\/prime\/\?ref\=nav_menu_greenbg_rocketman_unrec_cta"]
/*		WebDriverWait wait = new WebDriverWait(driver,30);
		element =wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector(".prime-button-try>a")));
		element.click();
		
		System.out.println("prime page title:" +driver.getTitle());
		
		//Thread.sleep(2000);
		
		//WebElement element = driver.findElement(By.cssSelector("#nav-link-accountList>span:nth-of-type(2)"));
		
		//element.click();
		
/*
 * 
 WebDriverWait wait = new WebDriverWait(driver,30);
		element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".prime-button-try>a")));
		element.click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		wait.withTimeout(30, TimeUnit.SECONDS);
		//wait.ignoring(NoSuchElementException.class);
		WebElement elm=	wait.until(function);
				
				
 */
		
	}
}
