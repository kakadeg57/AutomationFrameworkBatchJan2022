package sdet.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.Login_page;
import testbase.Testbase;

public class Home_page_Test extends Testbase{
	
	Login_page  login;
	HomePage  homePage;
	
@BeforeMethod
	
	public void  setUp() {
		
		initialization();
		login =new Login_page();
		homePage=login.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}



@Test

public void validateClickonNewContactTest() {
	homePage.creteContact();
}

@Test(enabled=false)

public void validateClickonNewCompanyTest() {
	homePage.createCompany();
}

@Test(enabled=false)

public void validateCreateTaskTest() {
	homePage.createTask();
}




 @Test(enabled=false)
 public void validateLogoutTest() throws InterruptedException {
	 homePage.logout();
	 Thread.sleep(10000);
 }

 




@AfterMethod
public void closeResourses() {
	  driver.close();
}
	
	
	

}
