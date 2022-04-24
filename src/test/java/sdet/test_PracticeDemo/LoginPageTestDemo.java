package sdet.test_PracticeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import sdet.pages_PracticeDemo.LoginPageDemo;
import testbaseForDemo.TestBaseDemo;

public class LoginPageTestDemo extends TestBaseDemo {
	LoginPageDemo loginpagedemo;

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpagedemo = new LoginPageDemo();

	}

	@Test
	public void valildateLoginTestDemo() {
		loginpagedemo.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterTest
	public void closeResources() {
		driver.close();

	}

}
