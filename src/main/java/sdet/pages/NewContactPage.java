package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class NewContactPage extends TestBase{
	
	@FindBy (id="first_name")
	WebElement firstName;
	
	@FindBy (id="surname")
	WebElement lastName;
	
	@FindBy (xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")
	WebElement saveBtn;
	
	public NewContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createContact(String fn,String ln) {
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		saveBtn.click();
	}

}
