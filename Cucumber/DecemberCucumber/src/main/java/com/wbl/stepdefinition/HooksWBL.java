package com.wbl.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.wbl.helper.ConfigUtils;
//import com.wbl.helper.Constants;
import com.wbl.helper.WebDriverUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class HooksWBL {

	static WebDriver driver;
	static String url, browser;
	
	static {  
		//ConfigUtils configUtils = new ConfigUtils(Constants.RESOURCES_PATH + "config.properties");
		ConfigUtils configUtils = new ConfigUtils(System.getProperty("user.dir")+"/resources/config.properties");
		url = configUtils.getProperty("url");
		browser = configUtils.getProperty("browser");
	}
	
	
	@Before(order=0)
	public void before() {
		System.out.println("In BEFORE METHOD!!!");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		driver = WebDriverUtil.getDriver(browser);
		driver.get(url);
		
	}
	
	@Before(order=1)
	public void before_intialise() {
		System.out.println("In BEFORE initialise order 1 METHOD!!!");
		// *System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		//* driver = new ChromeDriver();
		//logic to initialise dependent objects
	}

	@After(order=0)
	public void after() {
		System.out.println("In AFTER METHOD order 0  !!!");
		driver.quit();
	}
	
	@After(order=1)
	public void after_order() {
		System.out.println("In AFTER METHOD  order 1 !!!");
		driver.quit();
	}
}
