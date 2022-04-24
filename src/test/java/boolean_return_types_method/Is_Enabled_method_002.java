package boolean_return_types_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Enabled_method_002 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.quora.com/");
		
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//div[text()='A place to share knowledge and better understand the world']"));
		
		System.out.println("Quora Enabled method:"+ text.isEnabled());
		
		

	}

}
