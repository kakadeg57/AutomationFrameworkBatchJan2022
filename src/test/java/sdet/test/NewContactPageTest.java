package sdet.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import sdet.pages.NewContactPage;
import sdet.util.ReadData;
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
		newContactPage = homepage.createcontact();

	}

	@DataProvider(name = "testData")
	public String[][] sendData() throws IOException {
		String data[][] = ReadData.getData();
		return data;
	}

	@Test(dataProvider = "testData")
	public void validateCreateContactTest(String firstName, String LastName, String EmailID, String mobileNo,
			String Company, String Position, String Address) throws InterruptedException {
		// homepage.createcontact();
		newContactPage.createContact(firstName, LastName, EmailID, mobileNo, Company, Position, Address);
		Thread.sleep(5000);

	}

	@AfterMethod
	public void closeResources() {
		driver.close();
	}

}
