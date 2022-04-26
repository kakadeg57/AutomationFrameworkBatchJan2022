package sdet.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import testbase.TestBase;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test(enabled=false)
	public void validLoginTest() throws InterruptedException {
		homepage.logout();
		Thread.sleep(3000);
		
	}
	@Test
	public void validCreateContactTest() {
		homepage.createContact();
	}
	@Test(enabled=false)
	public  void createCompany() {
		homepage.createCompany();
	}
	@AfterMethod
	public void closeResources() {
		driver.close();
		
	}

}
