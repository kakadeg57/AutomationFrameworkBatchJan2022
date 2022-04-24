package boolean_return_types_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Displayed_method {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		//driver.manage().window().maximize();
		
		WebElement text= driver.findElement(By.xpath("(//span[@class='hdfc-logo-icon'])[3]"));
		
		System.out.println("HDFC Display method:" + text.isDisplayed());
		
		

	}

}
