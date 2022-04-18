package sdet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sdet.util.Utility;
import testbase.TestBase;

public class HomePage extends TestBase{
	
	// elements repo
	
	@FindBy (css =".fa.fa-sign-out.icon-2x")
	WebElement logoutLink;
	
	@FindBy (xpath="/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/a")
	WebElement contactsLink;
	
	@FindBy (xpath="/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/ul/li[1]/a")
	WebElement createContactLink;
	
	@FindBy (name = "mainpanel")
	WebElement frame;
	
	@FindBy (linkText = "Companies")
	WebElement companyLink;
	
	@FindBy (linkText = "New Company")
	WebElement creatCompany;
		
	// actions
	public void logout() {
		driver.switchTo().frame("mainpanel");
		logoutLink.click();
	}
	
	public NewContactPage createContact() {	
		Utility.switchToFrameMainPanel();
		Utility.mouseOverAction(contactsLink);
		createContactLink.click();
		return new NewContactPage();
	}
	
	public void createCompany() {
		Utility.mouseOverAction(companyLink);
		creatCompany.click();
		
	}
	
	public void createNewDeal() {
		Utility.mouseOverAction(companyLink);
		creatCompany.click();
		
	}
	
	
	//initiliazation
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	

}
