package browser_control_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAtribute_002 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement pratik = driver.findElement(By.xpath("//input[@type='text']"));
		
		System.out.println("The value of attribute is:"+ pratik.getAttribute("aria-label"));
		

	}

}
