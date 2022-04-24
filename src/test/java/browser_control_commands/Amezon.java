package browser_control_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amezon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");   //this is get method
		
		driver.manage().window().maximize();
		
		System.out.println("The Title of page is : " + driver.getTitle()); // getTilte method
		
		System.out.println("The URL of the page is :" + driver.getCurrentUrl()); // this is getcurrent
		
		System.out.println("This is pagesource of Amezon:" + driver.getPageSource()); //pageSource method
		
		driver.close();
		//driver.quit();
		//Thread.sleep(5000);
		
		

	}

}
