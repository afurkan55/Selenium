package com.trendyol.SeleniumTrendyol;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCase extends AppTest {
	
	
	@Test
	public void test_1_1_homePageControl(){ 
		Webpage homePage=new Webpage(driver);
		driver.get(homePage.getUrl());
		homePage.waitForPageLoad();
	    System.out.println("title ="+driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da")); 
		System.out.println("Trendyol Alışveriş sitesi başarılı bir şekilde açıldı");
	}
	
	
	
	
	
	@Test
	public void test_1_2_loginPage(){ 
		Webpage homePage=new Webpage(driver);
		homePage.getLoginPage();
		Assert.assertTrue(driver.getTitle().equals("Giriş Yap "));
		System.out.println("Kullanıcı girişi için sayfa başarılı bir şekilde açıldı...");
	}
	
	
	@Test
	public void test_1_3_signIn(){  
		Login loginPage =new Login(driver);
		loginPage.enterLoginForm("selenium.trendyol@gmail.com", "A.123456789");
		loginPage.submit();
		loginPage.waitForPageLoad(); 
		Assert.assertTrue(loginPage.getUserName().equals("selenium.trendyol@gmail.com"));
		System.out.println("Kullanıcı Girişi Başarılı ...");
	 
	}

}
