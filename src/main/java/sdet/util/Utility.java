package sdet.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testbase.TestBase;

public class Utility extends TestBase{
	
	
	public static void switchToFrame(String frame) {
		driver.switchTo().frame(frame);
		
	}
	
	public static void mouseOverAction(WebElement frame) {
		Actions act = new Actions(driver);
		act.moveToElement(frame).build().perform();

}
}