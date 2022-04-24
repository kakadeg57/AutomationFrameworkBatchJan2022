package sdet.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.Login_page;
import sdet.pages.NewContact_page;
import sdet.util.Read_Data;
import testbase.Testbase;

public class NewContactPage_Test extends Testbase {
	
	Login_page login;
	HomePage  homePage;
	NewContact_page  newContactPage;
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
		login =new Login_page();
		homePage=login.login(prop.getProperty("username"),prop.getProperty("password"));
		newContactPage =homePage.creteContact();
		
	}
	
	
	@DataProvider (name="testData")    
	public String[][] sendData() throws IOException{
		String ddt[][]  =  Read_Data.getdata();
		return ddt;
	}
	
	
	
	                                     //String firstName , String lastName , String company
	@Test(dataProvider="testData")
	
	public void validateCreateContactTest(String firstName , String lastName , String company) {
		
		newContactPage.createContact(firstName, lastName, company);
		//newContactPage.createContact("shubham", "waghmare", "TCS");
		
	}
	
	
	
	
	
	/*
	@Test
	
	public void validateCreateContactTest() throws InterruptedException {
		
		
		newContactPage.createContact("shubham", "waghmare", "shubhamw582@gmail.com","IBM","QA", "software Testing", "pune", "8975408078");
		
		Thread.sleep(10000);
	}
	*/
	
	
	@AfterMethod
	public void closeResourses() {
		  driver.close();
	}
	

}
