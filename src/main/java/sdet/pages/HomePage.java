package sdet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sdet.util.Utility;
import testbase.Testbase;

public class HomePage extends Testbase{
	
	// Element Repository
	
	@FindBy(css=".fa.fa-sign-out.icon-2x")	
	WebElement logoutLink;
	
	@FindBy(css = "[title='Contacts']")
	WebElement Contactlink;
	
	@FindBy(css="[title='New Contact']")
	WebElement CreateContactlink;
	
	@FindBy(xpath = "/html/frameset/frame[2]")
	WebElement frame;
	
	@FindBy(css="[title='Companies']")
	WebElement Companieslink;
	
	@FindBy(css="[title='New Company']")
	WebElement createCompany;
	
	@FindBy(css="[title='Tasks']")
	WebElement Tasklink;
	
	@FindBy(css="[title='New Task']")
	WebElement createTask;
	
	
	

	
	
	//actions
	
	public void logout() {
		
		driver.switchTo().frame("mainpanel");
		logoutLink.click();
	}
	
	
	public NewContact_page    creteContact() {
		
		//it will switch control inside main panel frame/container
		
		//WebElement frame =driver.findElement(By.name("mainpanel"));
		
		Utility.SwitchToFrame(frame);
		
		// mouseOver  on Contacts
		Utility.mouseOverAction(Contactlink);
		//To click on create Contact
		CreateContactlink.click();
		return new  NewContact_page();
		
	}
	
	public void createCompany() {
		
		driver.switchTo().frame("mainpanel");
		Utility.mouseOverAction(Companieslink);
		createCompany.click();
		
		
	}
	
     public void createTask() {
		
		driver.switchTo().frame("mainpanel");
		Utility.mouseOverAction(Tasklink);
		createTask.click();
		
		
	}
	
	
	
	
	//initialization
	
	HomePage(){
		PageFactory.initElements(driver,this);
	}

}
