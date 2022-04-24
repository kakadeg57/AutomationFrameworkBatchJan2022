package browser_control_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_control_commands_ex_Amezon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");                                              // This is get method
		
		driver.manage().window().maximize();
		
		System.out.println("The Title of the page is:" + driver.getTitle());               //This is get_title() method
		
		System.out.println("The URL of the page is:" + driver.getCurrentUrl());            // This is get current URL method
		
		System.out.println("This is page source of Amezon:" + driver.getPageSource());     // This is get page source method 
		
		driver.close();
		//driver.quit();
		
		WebDriver pratik = new ChromeDriver();
		
		pratik.get("https://www.netflix.com/in/Login");
	    //pratik.manage().window().maximize();

		driver.quit();
		
		WebDriver speed = new ChromeDriver();
		speed.get("https://www.spotify.com/us/");

	}

}
