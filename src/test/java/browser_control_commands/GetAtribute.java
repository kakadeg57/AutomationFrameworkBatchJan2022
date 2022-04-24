package browser_control_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAtribute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://discord.com/login");
		
		driver.manage().window().maximize();
		
		WebElement value = driver.findElement(By.xpath("//input[@name='email']"));
		
		System.out.println("The value of attribute is:" + value.getAttribute("class"));
		

	}

}
