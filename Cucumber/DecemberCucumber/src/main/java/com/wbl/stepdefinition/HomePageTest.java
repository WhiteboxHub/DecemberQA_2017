package com.wbl.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.wbl.page.HomePage;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageTest {
	
	@Given("^User is able to view the home page \\$(\\d+)$")
	public void user_is_able_to_view_the_home_page_$(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("In Given.....my first cucumber.......");
	}	
	
/*	@Given("^User is able to view the home page$")
	public void user_is_able_to_view_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("In Given.....my first cucumber.......");
	}*/

	@When("^user clicks on header link$")
	public void user_clicks_on_header_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("In When.....my first cucumber.......");
	}

	@Then("^user navigates to appropriate page$")
	public void user_navigates_to_appropriate_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new PendingException();
		System.out.println("In Then......my first cucumber......");
	}

	
	HomePage hm;
	
	WebDriver driver;
	
	@Given("^User is able to view the home page$")
	public void user_is_able_to_view_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		hm = new HomePage(HooksWBL.driver);
		
		//Moved the below code to HooksWBL @Before annotation
	/*	System.setProperty("webdriver.chrome.driver", "path of the exe file");
		 driver = new ChromeDriver();
		driver.get("http://www.whiteboxqa.com");*/
		
	}

	@When("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String link) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("In When method.........");
		System.out.println(link);
		
		//WebElement we;
		switch (link) {
		case "Schedule":
			//we = driver.findElement(By.cssSelector("#navbar-collapse > ul > li:nth-child(2) > a")).click();
			hm.clickSchedule();   
			break;
		case "FAQ":
			//we = driver.findElement(By.cssSelector("#navbar-collapse > ul > li:nth-child(5) > a")).click();
			hm.clickFAQ();
			break;
		
		 case "Demo":
			// we = driver.findElement(By.cssSelector("#navbar-collapse > ul > li:nth-child(3) > a")).click();
			 hm.clickDemo();
			 break;
		
		default:
			System.out.println("No option selected");
		}	
		
		
	}

	@Then("^User navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String linkPage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.out.println("In Then method.........");
		System.out.println(linkPage);
		
		switch (linkPage) {
		case "SchedulePage":
			Assert.assertNotNull(HooksWBL.driver.getTitle());
			break;
		case "FAQPage":
			Assert.assertNotNull(HooksWBL.driver.getTitle());
			break;
		
		 case "DemoPage":
			 Assert.assertNotNull(HooksWBL.driver.getTitle());
			 break;
		
		default:
			System.out.println("No option selected in then");
		}
		
		
		
	}


	
	 

}
