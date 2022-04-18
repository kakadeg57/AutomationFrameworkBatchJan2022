package sdet.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import sdet.pages.NewContactPage;
import testbase.TestBase;

public class NewContactPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	NewContactPage newContactPage;
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		newContactPage = homepage.createContact();
	}
	
	@Test
	public void validateCreateContactTest() {
		
		newContactPage.createContact("Speedway", "Tech");
		
		
	}
	
	
	@AfterMethod
	public void closeResources() {
		
		driver.close();
	}
	

}
