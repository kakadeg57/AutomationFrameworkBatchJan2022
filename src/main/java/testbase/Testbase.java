package testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public Testbase() {
		
		prop = new Properties();
		
		try {
			
			FileInputStream file =new FileInputStream("C:\\Users\\dell\\eclipse-workspace1\\AutomationFrameworkBatchJan\\src\\main\\java\\sdet\\config\\Configuration.properties");
            prop.load(file);
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

public static void initialization() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("website"));
	}
	

}
