package sdet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import sdet.pages.LoginPage;
import testbase.TestBase;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void validateLogoTest() {
		boolean value = loginPage.logo();
		Assert.assertEquals(value, true);
	}
	@Test
	public void validateLoginTest() {
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		String title = driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("crmproTitle"));
	}
	
	@Test
	public void validateLinksTest() {
		loginPage.links();
	}
	
	@AfterMethod
	public void closeResources() {
	driver.close();
	}
}
