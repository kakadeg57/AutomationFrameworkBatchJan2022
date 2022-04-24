package findelement_findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement_FindElements_002 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement myntra = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		myntra.sendKeys("mens wear");
		
		WebElement myntra1 = driver.findElement(By.xpath("//div[@class='desktop-pSearchlinks']//a"));
		System.out.println(myntra1.getText());
		
		List<WebElement> myntra2 = driver.findElements(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		System.out.println(myntra2.size());
		
		List<WebElement> myntra3 = driver.findElements(By.xpath("//div[@class='desktop-pSearchlinks']//a"));
		System.out.println(myntra3.size());
		
		for(WebElement myntralink:myntra3) {
			System.out.println(myntralink.getText());
		
		if(myntralink.getText().equals("Cricket Shoes")) {
             myntralink.click();
			            // OR
          if(myntralink.getText().contains("Cricket Shoes")) {
             myntralink.click();
            	 
             }
				
			}
			
			
			
		}
	}

}
