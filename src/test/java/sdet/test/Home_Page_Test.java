package sdet.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import testbase.TestBase;

import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Page_Test extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void validateClickOnNewContactTest() {
		homepage.createcontact();
	}

	@Test
	public void validateCreateCompanyTest() {
		homepage.createCompany();
	}

	@Test
	public void validateCreateTasksTest() {
		homepage.createTasks();
	}

	@Test(enabled = false)
	public void validateLogoutTest() {
		homepage.logout();

	}

	@AfterMethod
	public void closeResouce() {
		// homepage.logout();
		 //driver.close();
	}
	

}
