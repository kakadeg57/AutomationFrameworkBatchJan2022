package browser_control_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close_Quit_method {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.close();                                // driver.close(): Used to close the current browser having focus.
		
		                                                // driver.quit(): Used to close all the browser instances
		driver.quit();

	}

}
