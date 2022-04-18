package sdet.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import sdet.pages.LoginPage;
import testbase.TestBase;

public class Utility extends TestBase{

	
	public static void switchToFrameMainPanel() {
		driver.switchTo().frame("mainpanel");
		
	}
	
	public static void mouseOverAction(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

}
