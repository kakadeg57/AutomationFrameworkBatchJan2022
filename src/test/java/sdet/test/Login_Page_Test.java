package sdet.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import sdet.pages.LoginPage;
import testbase.TestBase;

public class Login_Page_Test extends TestBase {
	LoginPage loginpage;

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		
	}
	@Test
	public void validateLogoTest() {
		boolean value = loginpage.logo();
		Assert.assertEquals(value, true);
		
		
	}
	@Test 	
	public void validateLoginTest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String title = driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("crmproTitle"));
	}
	
	@Test 
	public void validateLinkTest() {
		boolean value2 = loginpage.links();
		Assert .assertEquals(value2, true);
	}


	@AfterMethod
	public void closeResouce() {
	driver.close();	
	}

}
