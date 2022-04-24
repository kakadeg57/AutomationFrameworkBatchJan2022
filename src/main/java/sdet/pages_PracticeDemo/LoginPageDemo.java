package sdet.pages_PracticeDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbaseForDemo.TestBaseDemo;

public class LoginPageDemo extends TestBaseDemo {

	// Element Repository
	@FindBy(xpath = "//input[@name='username']")
	WebElement usernametxt;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordtxt;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbt;

	// Initilization
	public LoginPageDemo() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void login(String username, String password) {
		usernametxt.sendKeys(username);
		passwordtxt.sendKeys(password);
		loginbt.click();
	}

}
