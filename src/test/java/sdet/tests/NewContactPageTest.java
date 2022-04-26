package sdet.tests;

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
	NewContactPage newcontact;
	LoginPage loginpage;
	HomePage homepage;
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		newcontact=homepage.createContact();
		
		
	}
	
	@DataProvider(name="testData")
	public String[][] sendData() throws IOException {
		String ganesh[][]=ReadData.getData();
		return ganesh;
	}
	
	
	
	@Test(dataProvider="testData")
	public void validatenewContact(String firstname, String lastname, String company) {
		newcontact.createnewContact(firstname,lastname,company);
		
		
		
	
		
	}
	
	
	@AfterMethod
	public void close() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
	

}
