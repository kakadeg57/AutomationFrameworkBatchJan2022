package findelement_findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_Using_forloop_demo6 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://meesho.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> messho = driver.findElements(By.xpath("//div[@class='link-section']//a"));
		System.out.println(messho.size());
		
		for(WebElement messholink:messho) {
			System.out.println(messholink.getText());
		}
		

	}

}
