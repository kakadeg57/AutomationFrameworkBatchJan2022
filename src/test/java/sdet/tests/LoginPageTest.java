package sdet.tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.LoginPage;
import testbase.TestBase;

public class LoginPageTest  extends TestBase{
	
	

	

	LoginPage loginpage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		
	}
	
	
	@Test
	public void validLogoTest() {
		boolean value=loginpage.logo();
		Assert.assertEquals(value, true);
		
	}
	
	
	@Test
	public void validateLoginTest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String title = driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("CrmTitle"));
		
	}
	
	@Test
	public void validLinkTest() {
		
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
		
	}

}
