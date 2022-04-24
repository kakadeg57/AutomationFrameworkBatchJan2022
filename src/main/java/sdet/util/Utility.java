package sdet.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import sdet.pages.Login_page;
import testbase.Testbase;

public class Utility  extends Testbase{
	
	Login_page loginpage;
	
	public static void SwitchToFrame(WebElement frame) {
		driver.switchTo().frame(frame);
	}
	
	public static void mouseOverAction(WebElement element) {
		Actions  act =new Actions(driver);
		act.moveToElement(element).build().perform();	
	}
	
	public static void selectDropDown(WebElement dropDown,String value) {
		
		Select sel =new Select(dropDown);
		sel.selectByVisibleText(value);
		
	}

}
