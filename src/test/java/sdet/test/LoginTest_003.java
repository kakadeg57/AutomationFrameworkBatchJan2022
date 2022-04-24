package sdet.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest_003 {

	WebDriver driver;

	@Parameters("url")
	@BeforeMethod   void initilization(String url) {
		System.setProperty("WebDriver.chrome.driver",
				"E:\\Pratik\\Automation Teasting\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
        
	}

	@Parameters({ "username1", "password1" })
	@Test(priority = 1)
	public void validateLoginTest1(String username1, String password1) { // Valid Username & valid Password

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username1);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password1);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		WebElement logo = driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
		System.out.println("OrangeHRM Display Method:" + logo.isDisplayed());
		Assert.assertEquals(logo.isDisplayed(), true);
	}

	@Parameters({ "username2", "password2" })
	@Test(priority = 2)
	public void validateLoginTest2(String username2, String password2) { // valid Username & InValid Password
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username2);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password2);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		String TestCase2 = driver.findElement(By.xpath("//span[text()='Invalid credentials']")).getText();
		Assert.assertEquals(TestCase2, "Invalid credentials");
	}

	@Parameters({ "username3", "password3" })
	@Test(priority = 3)
	public void validateLoginTest3(String username3, String password3) { // INvalid Username & Valid Password
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username3);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password3);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		String TestCase3 = driver.findElement(By.id("spanMessage")).getText();
		System.out.println(TestCase3);
		Assert.assertEquals(TestCase3, "Invalid credentials");

	}

	@Parameters({ "username4", "password4" })
	@Test(priority = 4)
	public void validateLoginTest4(String username4, String password4) { // InValid Username & InValid Passsword
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username4);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password4);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		String TestCase4 = driver.findElement(By.xpath("//span[text()='Invalid credentials']")).getText();
		Assert.assertEquals(TestCase4, "Invalid credentials");

	}

	@Parameters({ "username5", "password5" })
	@Test(priority = 5)
	public void validateLoginTest5(String username5, String password5) { // Valid Username & Empty password
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username5);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password5);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		String TestCase5 = driver.findElement(By.id("spanMessage")).getText();
		Assert.assertEquals(TestCase5, "Password cannot be empty");

	}

	@Parameters({ "username6", "password6" })
	@Test(priority = 6)
	public void validateLoginTest6(String username6, String password6) { // Empty username & valid password
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username6);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password6);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		String TestCase6 = driver.findElement(By.id("spanMessage")).getText();
		Assert.assertEquals(TestCase6, "Username cannot be empty");

	}

	@Parameters({ "username7", "password7" })
	@Test(priority = 7)
	public void validateLoginTest7(String username7, String password7) { // Empty username & Empty password
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username7);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password7);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		String TestCase7 = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		Assert.assertEquals(TestCase7, "Username cannot be empty");
	    

	}
	

	@AfterMethod
	public void closeResouce() {
		driver.close();
	}

}
