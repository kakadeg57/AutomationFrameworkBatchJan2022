package findelement_findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElments_Using_if_demo7 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://meesho.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> messho = driver.findElements(By.xpath("//div[@class='link-section']//a"));
		
		for(WebElement messholink:messho) {
			System.out.println(messholink.getText());
			
			Thread.sleep(3000);
			
			if(messholink.getText().contains("Speakers"));
			messholink.click();
		}
		

	}

}
