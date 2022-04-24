package browser_control_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_control_commands_ex_002 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		System.out.println("The Title of page is:"+ driver.getTitle());
		System.out.println("The URL of page is:"+ driver.getCurrentUrl());
		System.out.println("The page source of myntra is:" + driver.getPageSource());
		driver.close();
		driver.quit();
		Thread.sleep(2000);
		WebDriver drivet = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		

	}

}
