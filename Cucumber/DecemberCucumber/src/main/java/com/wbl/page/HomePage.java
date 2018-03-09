package com.wbl.page;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#navbar-collapse > ul > li:nth-child(2) > a")
	WebElement schedule;
	
	@FindBy(css="#navbar-collapse > ul > li:nth-child(5) > a")
	WebElement faq;
	
	@FindBy(css="#navbar-collapse > ul > li:nth-child(3) > a")
	WebElement demo;
	
	public void clickSchedule() { //  (WebElement we)
		schedule.click();
	}
	
	public void clickFAQ() { // (WebElement we)
		faq.click();
		//driver.findElement(By.cssSelector("#navbar-collapse > ul > li:nth-child(5) > a")).click();
	}
	
	public void clickDemo() { //  (WebElement we)
		demo.click();
	}
	
	public ContactPage goToContact() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector("#navbar-collapse > ul > li:nth-child(6) > a"))).perform();
		////*[@id="navbar-collapse"]/ul/li[6]/a
	    WebElement contact = driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[6]/ul/li[2]/a"));
	    if (contact != null) {
	      contact.click();
	      return new ContactPage(driver);
	    }
		return null;
	}
	
	
}