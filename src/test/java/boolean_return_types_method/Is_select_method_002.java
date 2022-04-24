package boolean_return_types_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_select_method_002 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		
		WebElement P = driver.findElement(By.xpath("//label[text()='Impressive']"));
		
		//System.out.println(radio.isSelected());
		
		
		P.click();
		System.out.println(P.isSelected());
		

	}

}
