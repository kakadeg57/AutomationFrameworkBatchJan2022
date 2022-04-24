package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.Testbase;

public class Login_page  extends Testbase{
	
	
	  // Element repository
	
	@FindBy(name="username")
	WebElement usernametxt;
	
	@FindBy(name="password")
	WebElement  passwordtxt;
	
	@FindBy(css=".btn.btn-small")
	WebElement loginBtn;
	
	@FindBy(css=".navbar-brand")
	WebElement logoImg;
	
	@FindBy(linkText ="Sign Up")
	WebElement SignUpLink; 
	
	@FindBy(linkText ="Pricing")
	WebElement PricingLink; 
	
	@FindBy(linkText ="Features")
	WebElement FeaturesLink; 
	
	@FindBy(linkText ="Customers")
	WebElement CustomersLink; 
	
	
	
	
	//Element  initialization
	
	
	public Login_page() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	//Actions
	
	public   HomePage login (String username ,String password) {
		
		 usernametxt.sendKeys(username);
		 passwordtxt.sendKeys(password);
		 loginBtn.click();	
		 return new HomePage();
		 
		
	}
	
	public boolean logo() {
		
		return logoImg.isDisplayed();
	}
	
	public boolean links() {
		
		return SignUpLink.isDisplayed();
	}
	
	
	
	
	

}
