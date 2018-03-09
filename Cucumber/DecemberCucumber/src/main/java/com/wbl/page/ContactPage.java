package com.wbl.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ContactPage {

	WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver = driver;
		//write code for mousehover info and click contact
		//driver.get("http://whiteboxqa.com/contact.php");
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#contact_body > div.form-group.name > input")
	WebElement nameText;
	
	@FindBy(css="#email")
	WebElement emailText;
	
	@FindBy(css="#phone")
	WebElement phoneText;
	
	@FindBy(css="#message")
	WebElement messageText;
	
	@FindBy(css="#submit")
	WebElement sendButton;
	
	public void typeName(String name) { //  (WebElement we)
		nameText.sendKeys(name);
	}
	
	public void typeEmail(String email) { // (WebElement we)
		emailText.sendKeys(email);
	}
	
	public void typePhone(String phone) { //  (WebElement we)
		phoneText.sendKeys(phone);
	}
	
	
	public void typeMessage(String message) { //  (WebElement we)
		messageText.sendKeys(message);
	}
	
	
	public void clickSendMessage() { //  (WebElement we)
		sendButton.click();
	}
}







	
	
	
	
	