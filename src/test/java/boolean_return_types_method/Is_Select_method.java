package boolean_return_types_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Select_method {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.uitestpractice.com/Students/Form");
		
		driver.manage().window().maximize();
		
		WebElement radio1 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		//WebElement radio2 = driver.findElement(By.xpath("//label[text()=' Radio2']"));
		
		System.out.println(radio1.isSelected());
		//System.out.println(radio2.isSelected());
		
		radio1.click();
		
		System.out.println(radio1.isSelected());
		

	}

}
