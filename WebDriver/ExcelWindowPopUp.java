package com.wbl.basic;

//public class ExcelWindowPopUp {
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class ExcelWindowPopUp {
	
	public static void main(String args[]) throws AWTException, IOException, InterruptedException{
		//new ExcelWindowPopUp().excelWrite();
		//new ExcelWindowPopUp().excelRead();
		//new ExcelWindowPopUp().fileUploadWithRobot();
		//new ExcelWindowPopUp().fileUploadWithAutoIT();
		//new ExcelWindowPopUp().fileUploadAutoITFireFox();
		
		//WebDriver driver = new HtmlUnitDriver();
		System.setProperty("phantomjs.binary.path", System.getProperty("user.dir")+"\\resources\\phantomjs.exe");	
		   WebDriver driver = new PhantomJSDriver();

		driver.get("https://www.google.com");
		System.out.println("....."+driver.getTitle());
		
		

	}
	
	public void excelRead() throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Sid\\Desktop\\Employee.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sh1 = wb.getSheet("Employee Details");
		
		XSSFRow row1 = sh1.getRow(0);
		System.out.println("Number of cells :: " + row1.getLastCellNum());
		  XSSFCell cell;
		  String s;
		
		for (int i = 0 ; i < row1.getLastCellNum(); i++) {
		    cell = row1.getCell(i);
		    s = cell.getStringCellValue();
		    System.out.println(i + " cell value = "+ s);
		}
		System.out.println("No of rows:"+ sh1.getLastRowNum());
		wb.close();
		
	}
	
	public void excelWrite() throws IOException{
		XSSFWorkbook wb = new XSSFWorkbook();  // .xlsx
		
		XSSFSheet sheet1 = wb.createSheet("Employee Details");
		
		XSSFRow sh1row1 = sheet1.createRow(0);
		XSSFCell sh1Cell1 = sh1row1.createCell(0);
		sh1Cell1.setCellValue("EmpID");
		XSSFCell sh1Cell2 = sh1row1.createCell(1);
		sh1Cell2.setCellValue("EmpName");
		
		XSSFRow sh1row2 = sheet1.createRow(1);
		XSSFCell sh1Cell3 = sh1row2.createCell(0);
		sh1Cell3.setCellValue("1234");
		XSSFCell sh1Cell4 = sh1row2.createCell(1);
		sh1Cell4.setCellValue("Joseph");
		
				
		
		XSSFSheet sheet2 = wb.createSheet("Department");
		XSSFRow sh2row = sheet2.createRow(0);
		XSSFCell sh2cell = sh2row.createCell(0);
		sh2cell.setCellValue("Enter Department Details");
		//C:\Users\sid\Desktop
		FileOutputStream file = new FileOutputStream("C:\\Users\\Sid\\Desktop\\Employee.xlsx");
		wb.write(file);
		
		System.out.println("successfully written file ");
		wb.close();	
	}
	
	public void fileUploadWithRobot() throws AWTException{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jpg2pdf.com/");
		StringSelection path = new StringSelection("C:\\Users\\sid\\Desktop\\iFrames.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		driver.findElement(By.cssSelector("#pick-files > span.ui-button-text")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		System.out.println("..1");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("..2");
		
	}
	public void fileUploadWithAutoIT(String browser) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jpg2pdf.com/");
		driver.findElement(By.cssSelector("#pick-files > span.ui-button-text")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//resources//Test.exe");
		//Process pro = new ProcessBuilder(System.getProperty(System.getProperty("user.dir")+"//resources//Test.exe"),"", "Open").start();  
	 }
	// Title --  File Upload
	//  Class -- Edit
	// Instance -- 1
	
	// Class -- Button
	public void fileUploadAutoITFireFox() throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//resources//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://jpg2pdf.com/");
		driver.findElement(By.cssSelector("#pick-files > span.ui-button-text")).click();
		Thread.sleep(100);
		System.out.println("after sleep.....");
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//resources//AutoitWithFirefox.exe");
		//Process pro = new ProcessBuilder(System.getProperty(System.getProperty("user.dir")+"//resources//Test.exe"),"", "Open").start();  
	}
}

