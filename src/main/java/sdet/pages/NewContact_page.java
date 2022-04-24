package sdet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import sdet.util.Utility;
import testbase.Testbase;

public class NewContact_page extends Testbase{
	
	@FindBy(css="[name='title']")
	WebElement titletext;

	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(id="email")
	WebElement  emailText;
	
	@FindBy(css ="[name='client_lookup']")
	WebElement  companyText;
	
	@FindBy(id="company_position")
	WebElement  positionText;
	
	@FindBy(id="department")
	WebElement  departmentText;
	
	@FindBy(css ="[name=address_title]	")
	WebElement  addressText;
	
	
	@FindBy(name="category")
	WebElement categoryText;
	
	@FindBy(name="status")
	WebElement statusText;
	
	
	@FindBy(id="mobile")
	WebElement mobileNo;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")
	WebElement saveBtn;
	
	public NewContact_page() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	/*			
	
	public void createContact(String fn,String ln,String En, String cn, String cp,String dt,String ad,String mob)
	 {
		
	
		Utility.selectDropDown(titletext, "Mr.");
		Utility.selectDropDown(categoryText,"Lead");
		Utility.selectDropDown(statusText, "Active");
		
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		//emailText.sendKeys(En);
		companyText.sendKeys(cn);
		//positionText.sendKeys(cp);
		//departmentText.sendKeys(dt);
		//addressText.sendKeys(ad);
		
		//mobileNo.sendKeys(mob);
		saveBtn.click();
	}
	*/
	
	public void createContact(String fn,String ln, String company)
	 {
		
	
		Utility.selectDropDown(titletext, "Mr.");
		Utility.selectDropDown(categoryText,"Lead");
		Utility.selectDropDown(statusText, "Active");
		
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		//emailText.sendKeys(En);
		companyText.sendKeys(company);
		//positionText.sendKeys(cp);
		//departmentText.sendKeys(dt);
		//addressText.sendKeys(ad);
		
		//mobileNo.sendKeys(mob);
		saveBtn.click();
	}
	
	
	
	
	
	
	
	
		
	}
	
	

