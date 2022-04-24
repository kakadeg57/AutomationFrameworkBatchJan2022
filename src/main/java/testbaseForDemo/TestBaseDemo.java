package testbaseForDemo;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseDemo {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBaseDemo() {
		prop = new Properties();
		try {
		FileInputStream file = new FileInputStream("C:\\Users\\Smart\\eclipse-workspace\\maven_simpleproject\\src\\main\\java\\sdet\\configDemo\\configuration.properties.Demo");
		prop.load(file);
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}

	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("website"));
	}

}
