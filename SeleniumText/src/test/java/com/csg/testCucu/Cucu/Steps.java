package com.csg.testCucu.Cucu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Steps {
WebDriver driver;

@Given("^User opens \"([^\"]*)\" url$")
public void openGooglePage(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Upasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(url);

}
}
