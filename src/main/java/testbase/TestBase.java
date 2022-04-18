package testbase;



import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		prop = new Properties();
		try {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\AutomationFrameworkBatchJan2022\\src\\main\\java\\sdet\\config\\configuration.properties");
		prop.load(file);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		//WebDriverManager.chromedriver().setup();
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if(browser.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please select valid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("website"));
	}
}
