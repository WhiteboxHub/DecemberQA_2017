package com.wbl.stepdefinition;

//import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.wbl.page.ContactPage;
import com.wbl.page.HomePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactPageTest {
	
	ContactPage cp;
	
	@Given("^User goes to Contact Page$")
	public void user_goes_to_Contact_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		HomePage hp = new HomePage(HooksWBL.driver);
		cp=hp.goToContact();
	}

	@When("^User enters values for sending message$")
	public void user_enters_values_for_sending_message(DataTable inputData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		
	   /*   List<String> data = inputData.asList(String.class);
	      for(String s : data) {
	    	  System.out.println(s);
	      }
		*/
		
		
		Map<String, String>  dataAsMap = inputData.asMap(String.class, String.class);
		
		System.out.println( "Name :"+  dataAsMap.get("Name"));
		System.out.println( "Email :"+ dataAsMap.get("Email"));
		System.out.println( "Phone :"+ dataAsMap.get("Phone"));
		System.out.println( "Message :"+ dataAsMap.get("Message"));
		
		cp.typeName(dataAsMap.get("Name"));
		cp.typeEmail(dataAsMap.get("Email"));
		cp.typePhone(dataAsMap.get("Phone"));
		cp.typeMessage(dataAsMap.get("Message"));
		
		
	}

	@When("^User clicks on send button$")
	public void user_clicks_on_send_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		cp.clickSendMessage();
	}

	@Then("^Receive appropriate response$")
	public void receive_appropriate_response() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertNotNull(HooksWBL.driver.getTitle());
	}



}
