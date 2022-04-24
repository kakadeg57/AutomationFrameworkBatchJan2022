package sdet.test;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.Login_page;
import testbase.Testbase;

public class Login_page_Test extends Testbase {
	
	Login_page  login;
	

	
	@BeforeMethod
	
	public void  setUp() {
		
		initialization();
		login =new Login_page();
		
	}
	
	@Test
	
	public void validateLogoTest() {
		 boolean value =login.logo();
		Assert.assertEquals(value,true);
		
	}
	
	@Test
    public void validatelinksTest() {
		 boolean value1=login.links();
		 Assert.assertEquals(value1,true);
	}
	
	
	
	
    @Test
	public void validateLoginTest() {
    	
		login.login(prop.getProperty("username"),prop.getProperty("password"));
		   String title  =driver.getTitle();
		 //  System.out.println(title);
		   Assert.assertEquals(title, prop.getProperty("crmproTitle"));
	
    }
    
    
     
	
	 @AfterMethod
	  public void closeResourses() {
		  driver.close();
	  }
   
	
	
	
	
	
	
	

}



