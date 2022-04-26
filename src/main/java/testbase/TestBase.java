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
	
	
	
	
	public TestBase()  {
		prop = new Properties();
		
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\MavenFrameWork\\src\\main\\java\\config\\configuration.properties");
			prop.load(file);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
		
	
	
	
	public static void initialization() {
     	//WebDriverManager.chromedriver().setup();
		String browser = (prop.getProperty("browser"));
     	if (browser.equals("chrome")) {
		driver = new ChromeDriver();
     	}
     	else if(browser.equals("firefox")) {
     	System.setProperty("webdriver.gecko.driver", "G:\\speedway\\geckodriver-v0.30.0-win32\\geckodriver.exe");
     	driver = new FirefoxDriver();	
     		
     	}
     	else {
     		System.out.println("please enter valid browser");
     	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}

}
