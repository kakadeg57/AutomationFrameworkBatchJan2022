package css_selectors;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selectors_001 {

	public static void main(String[] args)  {
	
		WebDriverManager.chromedriver().setup();
		
			WebDriver driver = new ChromeDriver();	
			
			driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
			
			driver.manage().window().maximize();
			
		    driver.findElement(By.cssSelector("#firstName")).sendKeys("pratik");                   
		    
		    driver.findElement(By.cssSelector(".gender")).sendKeys("Male"); 
		    
		    
		    
		    
		    
		    
		    
		    
		    
		   // System.out.println(driver.findElements(By.cssSelector("*")).size());                   
		  //System.out.println(driver.findElement(By.cssSelector("button")).getAttribute("id"));   
	}

}
