package browser_control_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_text_method_001 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://meesho.com/");
		
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//span[text()='Download App']"));
		
		System.out.println("the value of text is:" + text.getText());
		

		

	}

}
