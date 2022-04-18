package sdet.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import sdet.util.Utility;
import testbase.TestBase;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test
	public void validateClickOnNewContact() {
		Utility.switchToFrameMainPanel();
		homePage.createContact();
	}
	
	@Test(enabled = false)
	public void validateClickOnNewCompanyTest() {
		Utility.switchToFrameMainPanel();
		homePage.createCompany();
	}
	
	@Test(enabled = false)
	public void validateLogoutTest() throws InterruptedException {
		homePage.logout();
		
		Thread.sleep(10000);
	}
	
	@AfterMethod
	public void closeResources() {
	//homePage.logout();
	//driver.close();
	}
	
	
	
	
	
	

}
