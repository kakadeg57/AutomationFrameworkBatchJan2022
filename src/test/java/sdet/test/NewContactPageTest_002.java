package sdet.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import sdet.pages.NewContactPage;
import testbase.TestBase;

public class NewContactPageTest_002 extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	NewContactPage newcontactpage;
			
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		newcontactpage = homepage.createcontact();
		
	}
	@Test
	public void validateCreateContactTest() {
		newcontactpage.createContact("Pratik", "Kapade", "pratik.kapade09@gmail.com", "8308929839", "Infosys", "Tester", "Pune");
	}
	
	
	
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}

}
