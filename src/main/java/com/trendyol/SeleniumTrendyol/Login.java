package com.trendyol.SeleniumTrendyol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy; 

public class Login extends App {
	
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "loginSubmit")
	private WebElement loginSubmit;
	
	@FindBy(className = "user")
	private WebElement userName;           

	public Login(WebDriver driver) {
		super(driver);
		
	}
	
	//Login formunu doldurmak için 
		public void enterLoginForm(String email, String password) {
			this.email.clear();
			this.email.sendKeys(email);

			this.password.clear();
			this.password.sendKeys(password);
		}
		
		//Login olmak için button click  
		public void submit() {
			loginSubmit.click(); 
		}
		 public String getUserName(){
				return userName.getText();
		 }

}
