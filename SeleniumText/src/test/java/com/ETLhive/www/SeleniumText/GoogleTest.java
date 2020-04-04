package com.ETLhive.www.SeleniumText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Upasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://newtours.demoaut.com/");
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.navigate().forward();

		
		WebElement foot= driver.findElement(By.className("footer"));
		System.out.println(foot.getText());
		WebElement reg=driver.findElement(By.linkText("REGISTER"));
		reg.click();
		
		Thread.sleep(5000);

		if(driver.getTitle().equalsIgnoreCase("Register: Mercury Tours"))
		{		
		WebElement fn = driver.findElement(By.name("firstName"));
		fn.sendKeys("Upasana");
		
		WebElement ln = driver.findElement(By.name("lastName"));
		ln.sendKeys("Sahoo");
		
		WebElement ph = driver.findElement(By.name("phone"));
		ph.sendKeys("9980591003");
		
		WebElement em = driver.findElement(By.id("userName"));
		em.sendKeys("upasana.sahoo98@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("Wakad");
		driver.findElement(By.name("city")).sendKeys("Pune");
		

		

		driver.close();
		
		}
		else
		{
			driver.close();
			throw new RuntimeException("Register page is not opened");

		}
			
		//driver.close();
		
	}

}
