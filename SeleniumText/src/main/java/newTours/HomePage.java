package newTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import www.ETLhive.www.utility.commonUtils;

public class HomePage extends commonUtils {
	WebDriver driver;
	@FindBy (linkText="SIGN-ON") WebElement signon;
	@FindBy (linkText="REGISTER") WebElement register;
	@FindBy (linkText="SUPPORT") WebElement support;
	@FindBy (linkText="CONTACT") WebElement contact;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public boolean clickOnRegister() {
		return(clickSafelyOn(register));
		
	}
	
	public void clickOnSignOn() {
		clickSafelyOn(signon);
		
	}
	
	public void clickOnSupport() {
		clickSafelyOn(support);
		
	}
	
	public void clickOnContact() {
		clickSafelyOn(contact);
		
	}

}
