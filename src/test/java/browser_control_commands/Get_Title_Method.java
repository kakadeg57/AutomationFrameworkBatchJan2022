package browser_control_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Title_Method {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");                                              // This is get method
		
		driver.manage().window().maximize();
		
		System.out.println("The Title of the page is:" + driver.getTitle());               //This is get_title() method
		

	}

}
