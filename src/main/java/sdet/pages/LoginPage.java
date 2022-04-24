package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class LoginPage extends TestBase {
       //Element Repostry
	 @FindBy(name="username")
	 WebElement usernametxt;
	 
	 @FindBy(name="password")
	 WebElement passwordtxt;
	 
	 
	 @FindBy(css = ".btn.btn-small")
	 WebElement loginbtn;
	 
	 @FindBy(css = ".navbar-brand > .img-responsive")
	 WebElement logoImage;
	 
	 @FindBy(linkText = "Sign Up")
	 WebElement signUpLink; 
	 
	 // Initilization
	 
	 public LoginPage() {
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	
	 // Action
	 public HomePage login(String username, String password) {
		usernametxt.sendKeys(username);
		passwordtxt.sendKeys(password);
		loginbtn.click();
		return new  HomePage();
	 }
	 
	 public boolean logo() {
		 return logoImage.isDisplayed();
	 }
	 
	 public boolean links() {
		return signUpLink.isDisplayed();
	 }
	 
	 
	 
}



