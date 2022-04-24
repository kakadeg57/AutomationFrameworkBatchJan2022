package findelement_findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement_Expections_demo3 {            

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://meesho.com/");
		
		WebElement messho = driver.findElement(By.xpath("//input[@type='text123']"));          //Wrong Xpath for Expection
		 
		messho.sendKeys("Sunglasses");

		
		

	}

}
