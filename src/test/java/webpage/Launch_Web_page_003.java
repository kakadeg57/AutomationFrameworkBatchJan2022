package webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Web_page_003 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver pratik = new ChromeDriver();
		pratik.get("https://chrome.google.com/webstore/category/extensions?utm_source=chrome-ntp-icon");
		pratik.manage().window().maximize();


	}

}
