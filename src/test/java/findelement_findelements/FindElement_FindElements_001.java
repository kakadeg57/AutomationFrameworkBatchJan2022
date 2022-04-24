package findelement_findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement_FindElements_001 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*WebElement amezon = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		amezon.sendKeys("mobile");*/
		
		/*WebElement amezon1 = driver.findElement(By.xpath("//div[@id='navFooter']//a"));
		System.out.println(amezon1.getText());*/
		
		//Wrong xpath for No such Element exception
		/*WebElement amezon = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox111']"));
		amezon.sendKeys("mobile");*/
		
		
		//This is FindeElements Method
		
		/*List<WebElement> amezon = driver.findElements(By.xpath("//input[@id='twotabsearchtextbox']"));
		System.out.println(amezon.size());*/
		//Amezon chy site vrr fakt ekch searchbox aahe mhanun result madhe 1 aale aahe......jar aaplyala size check karayhi asel trr...
		
		
		//List<WebElement>amezon = driver.findElements(By.xpath("//div[@id='navFooter']//a"));
		//System.out.println(amezon.size());
	                                                                                               
		 /*Multiple link sathi. result 55 ale aahe...... 
         * jar aapalyala tyachi fakt size 
         pahije asel tr link of webelement ch use karaycha*/
		
		
		//for(WebElement amezonlink:amezon) {                                                           
			//System.out.println(amezonlink.getText());
			
			/* jar aaplyala purn link consol madhe pahije astil      
            trr "for loop" cha used karava lagel*/
			
			
			//if(amezonlink.getText().equals("Facebook")) {                                              
				//amezonlink.click();
				//if(amezonlink.getText().contains("Facebook"))   
				//contaions method also used
				
				 /*jar suppose mla amezon vrr konti link opne 
                   karaychi asel trr mla "if"
                  cha use karava lagel*/
				
				
		//	}
		//}
		//WebElement amezon1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox111']"));
		//System.out.println(amezon1.getSize());
		
		/*ya thikani jar aapn wrong xpath ghetla trr trr consol madhe 
		  zero as print hoil*/
		 
		
		
		
		
		

	}

}
