package newTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demoFrame {
@Test
@Parameters({"body"})
public void f3 (String text) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Upasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/iframe");
	driver.switchTo().frame(0);
	WebElement body1=driver.findElement(By.id("tinymce"));
	body1.clear();
	body1.sendKeys(text);
	driver.switchTo().defaultContent();
	WebElement abc=driver.findElement(By.id("mceu_15-open"));
	abc.click();
	driver.close();
}	
}
