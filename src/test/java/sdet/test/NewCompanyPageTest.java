package sdet.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import sdet.pages.NewCompanyPage;
import testbase.TestBase;

public class NewCompanyPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	NewCompanyPage newCompanyPage;
       
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		newCompanyPage = homepage.createCompany();
		
		
	}
	
	@Test
	public void validateCreateCompanyTest() {
		newCompanyPage.createCompany("Infosys");
	}
	
	
	
	
	
	/*@AfterMethod
	public void closeResources() {
		driver.close();
	}*/
	
}
