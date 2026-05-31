package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public void launchURL(){
	
	System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	driver.get("https://www.purnadata.in/PurnaDemo/");
	
	}
	@BeforeTest
public  void loadConfig() {
		

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Shree\\eclipse-workspace nilesh123\\POM\\src\\test\\resources\\properties");
			//System.getProperty("C:\\Users\\Shree\\eclipse-workspace nilesh123\\POM\\src\\test\\resources\\properties"));
					
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}}
	
		
		public static boolean isAlertPresent(WebDriver driver) 
		{ 
			try 
			{ 
				driver.switchTo().alert().accept();
				return true; 
			}   // try 
			catch (NoAlertPresentException Ex) 
			{ 
				return false; 
			}   // catch 
		}
		
		public static void implicitWait(WebDriver driver, int timeOut) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	
	
	
}

//C:\Users\Shree\eclipse-workspace nilesh123\POM\src\test\resources\properties
