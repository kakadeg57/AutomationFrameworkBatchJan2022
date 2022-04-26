package sdet.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

import org.openqa.selenium.WebElement;



public class NewContactPage extends TestBase{
	
	
	@FindBy(id="first_name")
	WebElement firstnametxt;
	
	@FindBy(id="surname")
	WebElement lastnametxt;
	
	@FindBy(xpath="//td[@align='center'and @valign='top' and @colspan='2']//descendant::input[2]")
	WebElement save;
	
	@FindBy(css ="[name='client_lookup']")
	WebElement  companyText;
	
	public NewContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createnewContact(String name,String last,String company) {
		firstnametxt.sendKeys(name);
		lastnametxt.sendKeys(last);
		companyText.sendKeys(company);
		save.click();
		
		
		
	}

}
