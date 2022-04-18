package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class LoginPage extends TestBase{
	
	// element repository 
	
	@FindBy(name="username")
	WebElement usernametxt;
	
	@FindBy(name = "password")
	WebElement passwordtxt;
	
	@FindBy (css = ".btn.btn-small")
	WebElement loginBtn;
	
	@FindBy (css = ".navbar-brand > .img-responsive")
	WebElement logoImg;
	
	@FindBy(linkText = "Sign Up")
	WebElement signUpLink;
	@FindBy(linkText = "Pricing")
	WebElement pricingLink;
	@FindBy(linkText = "Features")
	WebElement featuresLink;
	@FindBy(linkText = "Customers")
	WebElement customersLink;
	
	// Elements inilization 
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// actions
		public HomePage login(String username,String password) {
			usernametxt.sendKeys(username);
			passwordtxt.sendKeys(password);
			loginBtn.click();
			return new HomePage();
		}
		
		public boolean logo() {
			return logoImg.isDisplayed();
		}
		
		public void links() {
			signUpLink.isDisplayed();
		}
}
