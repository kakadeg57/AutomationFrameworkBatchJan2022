package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class LoginPage extends TestBase{
	
	//element repository
	
	@FindBy(name="username")
	WebElement usernametxt;
	
	@FindBy(name="password")
	WebElement passwordtxt;
	
	@FindBy(css=".btn.btn-small")
	WebElement loginbtn;
	 
	@FindBy(css=".navbar-brand>.img-responsive")
	WebElement logo;
	//element initialization
	@FindBy(linkText = "Sign Up")
	WebElement SignUpLink;
	@FindBy(linkText = "Pricing")
	WebElement PricingLink;
	@FindBy(linkText = "Features")
	WebElement FeaturesLink;
	@FindBy(linkText = "Customers")
	WebElement CustomersLink;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean logo() {
		return logo.isDisplayed();
		
	}
	
	public void links() {
		SignUpLink.isDisplayed();
	}
	
	
	
	//actions
	public HomePage login(String username, String password) {
		usernametxt.sendKeys(username);
		passwordtxt.sendKeys(password);
		loginbtn.click();
		return new HomePage();
	}

}
