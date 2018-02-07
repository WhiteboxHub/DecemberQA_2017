package com.wbl.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] st) {
		boolean condition;
	//1. load the driver into the environment
    System.setProperty("webdriver.chrome.driver","C:\\Users\\dhwan\\eclipse-workspace\\DecemberExample\\Resource\\chromedriver.exe");
   //2. Create the instance of the driver 
    WebDriver driver = new ChromeDriver();
    //3. Load the given URL in the browser. it should be complete URL
    driver.get("http://toolsqa.com/automation-practice-form/");
    //find the webelement, perform action, compare actual expected
    WebElement webelement =  driver.findElement(By.xpath("//*[@id=\'content\']/div[1]/div/div/div/div[2]/div/form/fieldset/div[14]/strong/label"));
System.out.println(webelement.getText());
List<WebElement> r1 =  driver.findElements(By.name("sex"));
if(r1.get(0).isSelected()) {
	r1.get(1).click();
	System.out.println("female");
}
else
{
r1.get(0).click();
	System.out.println("male");
}


}
}
