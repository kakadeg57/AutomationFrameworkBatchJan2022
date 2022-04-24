package sdet.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sdet.util.Utility;
import testbase.TestBase;

public class HomePage extends TestBase {

	//Element Repostry
	
	@FindBy(css = ".fa.fa-sign-out.icon-2x")
	WebElement logoutLink;
	
	@FindBy(css = "[title='Contacts']")
	WebElement contactLink;
	
	@FindBy(css = "[title='New Contact']")
	WebElement CreateContactLink;
	
	@FindBy(xpath =  "/html/frameset/frame[2]")
	WebElement frame;
	
	@FindBy(css = "[title='Companies']")
	WebElement companyLink;
	
	@FindBy(css = "[title='New Company']")
	WebElement createCompanyLink;
	                    
	@FindBy(css = "[title='Tasks']")
	WebElement taskLink;
	
	@FindBy(css = "[title='New Task']")
	WebElement createTask;
	
	
	//Actions
	
	public void logout() {
		driver.switchTo().frame("mainpanel");
		logoutLink.click();
	}
	
	public NewContactPage createcontact() {
		Utility.switchToFrame(frame);
		//driver.switchTo().frame(frame);
		Utility.mouseOverAction(contactLink);
		CreateContactLink.click();
		return new NewContactPage();
		
	}
	
	public NewCompanyPage createCompany() {
		Utility.switchToFrame(frame);
		//driver.switchTo().frame("mainpanel");
		Utility.mouseOverAction(companyLink);
		createCompanyLink.click();
		return new NewCompanyPage();
	}
	
	public void createTasks() {
		//Utility.switchToFrame(frame);
		driver.switchTo().frame("mainpanel");
		Utility.mouseOverAction(taskLink);
		createTask.click();
	}
	
	
	
	//Initilization
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
}
