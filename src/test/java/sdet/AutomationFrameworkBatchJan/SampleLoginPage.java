package sdet.AutomationFrameworkBatchJan;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleLoginPage {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void initialization() {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	
	@Test
	public void validateLoginTest1()     ////valid Username , valid password
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement logoElement =driver.findElement(By.xpath("//img[@alt=\"OrangeHRM\"]"));
		System.out.println(logoElement.isDisplayed());
		Assert.assertEquals(logoElement.isDisplayed(),true);
		
	}
	
	
	@Test
	public void validateLoginTest2()     ////valid Username , invalid password
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("456666");
		driver.findElement(By.id("btnLogin")).click();
		
		String errorMsg =driver.findElement(By.id("spanMessage")).getText();
		System.out.println(errorMsg);
		Assert.assertEquals(errorMsg, "Invalid credentials");
		
	}
	
	
	/*
	@Test
	
	public void validateLoginTest2() {    //invalid Username , invalid password
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("shubham");
		driver.findElement(By.id("txtPassword")).sendKeys("456666");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertEquals("Invalid credentials", "Invalid credentials");
		
	}
	
	
	
	@Test
	public void validateLoginTest4()     ////invalid Username , valid password
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("shubham");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertEquals("Invalid credentials", "Invalid credentials");
		
	}
	
	
	
	@Test
	public void validateLoginTest5()     ////Empty  Username , Empty password
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(" ");
		driver.findElement(By.id("txtPassword")).sendKeys(" ");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertEquals("Username cannot be empty", "Username cannot be empty");
		
	}
	
	*/
	
	
	 @AfterMethod
	  public void closeResourses() {
		  driver.close();
	  }
   
	
	
	
	
	
	
	
	
	
	
	

}
