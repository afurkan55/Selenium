package com.trendyol.SeleniumTrendyol;

import org.junit.AfterClass; 
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{protected static WebDriver driver;


@BeforeClass
public static void before(){
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\afurk\\git\\SeleniumTrendyol\\geckodriver.exe"); 
	driver = new FirefoxDriver();
	
}
@AfterClass
public static void after() throws InterruptedException{
	Thread.sleep(3000);
} 

public WebDriver getDriver(){
	return driver;
}
    
}
