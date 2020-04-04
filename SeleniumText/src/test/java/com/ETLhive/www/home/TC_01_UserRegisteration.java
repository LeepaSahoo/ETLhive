package com.ETLhive.www.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import newTours.HomePage;
import newTours.RegisterPage;

public class TC_01_UserRegisteration {
		//public static void main(String[] args) throws InterruptedException {
	
			@Test
			public void f1() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Upasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().deleteAllCookies();
			
			//creating objects of base class
			HomePage hm= new HomePage(driver);
			RegisterPage rp=new RegisterPage(driver);
			
			
			//test steps start from here
			driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			Assert.assertTrue(hm.clickOnRegister(),"Clicking on Register link");
			Assert.assertTrue(rp.enterFirstName(),"Entering first name");
			Assert.assertTrue(rp.enterLastName(),"Entering last name");
			Assert.assertTrue(rp.selectCountry(),"Selecting a country");
			Thread.sleep(5000);
			driver.close();
	}

}
