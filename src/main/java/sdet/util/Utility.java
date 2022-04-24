package sdet.util;

import java.awt.event.ActionEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import sdet.pages.LoginPage;
import testbase.TestBase;

public class Utility extends TestBase {

	LoginPage loginpage;
	
	public static void switchToFrame(WebElement frame) {
		driver.switchTo().frame(frame);
		//Utility.switchToFrame(frame);
		
	}
	
	public static void mouseOverAction(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
	public static void selectDropDown(WebElement element, String value) {
		Select s1 = new Select(element);
		s1.selectByVisibleText(value);
	}
} 








