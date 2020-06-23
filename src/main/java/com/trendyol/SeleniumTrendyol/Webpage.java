package com.trendyol.SeleniumTrendyol;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 

public class Webpage  extends App {

	private static String webUrl="https://www.trendyol.com/";
	 
	  
	  @FindBy(id = "accountBtn")
	  private WebElement accountBtn;      
	  
	  @FindBy(id = "loginSubmit")
	  private  WebElement  loginSubmit;
	  
	  public Webpage(WebDriver driver) {
	        super(driver);
	  }
	 
	 public void getLoginPage(){
		 accountBtn.click();
		 wait.until(elementClickableById(loginSubmit));
	 }
	 public String getUrl(){
			return webUrl;
	 }
	
	  
}
