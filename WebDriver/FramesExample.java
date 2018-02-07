package com.wbl.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new FramesExample().useFrames();
	}
	public void useFrames() {
		//C:\Shen\selenium\eclipseWorkspace\DecemberBatch\resources\chromedriver.exe
		System.out.println("Current directory :: " + System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		WebElement frame1 = driver.findElement(By.name("packageListFrame"));
		WebElement frame2 = driver.findElement(By.name("packageFrame"));
		WebElement frame3 = driver.findElement(By.name("classFrame"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a")).click();//body > div.indexContainer > ul > li:nth-child(5) > a
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("/html/body/div/ul[1]/li[10]/a")).click();//body > div > ul:nth-child(2) > li:nth-child(10) > a > span
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li/dl[2]/dd/a[1]")).click();
		///html/body/div[4]/div[1]/ul/li/dl[2]/dd/a[1]

	}

}
