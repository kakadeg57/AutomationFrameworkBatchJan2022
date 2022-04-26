package sdet.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sdet.util.Utility;
import testbase.TestBase;

public class HomePage extends TestBase{
	
	//element repo
	@FindBy(css=".fa.fa-sign-out.icon-2x")
	WebElement logout;
	
	@FindBy(xpath = "//a[@title='Contacts']")
	WebElement contactlink;
	
	@FindBy(linkText="New Contact")
	WebElement createcontactlink;
	
	@FindBy(xpath = "//a[@title='Companies']")
	WebElement companylink;
	
	@FindBy(linkText = "New Company")
	WebElement createCompanyLink;
	
	
	
	//actions
	
	public NewContactPage createContact() {
		//mouseover  
		
		/*Actions act = new Actions(driver);
		driver.switchTo().frame("mainpanel");
		act.moveToElement(contactlink).build().perform();
		
		createcontactlink.click();*/
		Utility.switchToFrame("mainpanel");
		
		Utility.mouseOverAction(contactlink);
		createcontactlink.click();
		return new NewContactPage();
		
	}
	
	public void createCompany() {
		Utility.switchToFrame("mainpanel");
		Utility.mouseOverAction(companylink);
		createCompanyLink.click();
		
		
	}
	
	public void logout() {
		driver.switchTo().frame("mainpanel");
		logout.click();
	}
	
	
	
	//initialization
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	

}
