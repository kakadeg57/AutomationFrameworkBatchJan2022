package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class NewCompanyPage extends TestBase {
	
	
	@FindBy(xpath = "//*[@id=\"company_name\"]")
	WebElement companyname;
	
	@FindBy(xpath = "//*[@id=\"companyForm\"]/table/tbody/tr[1]/td/input")
	WebElement savebt;
	
	
	
	public NewCompanyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createCompany(String cn) {
		companyname.sendKeys(cn);
		savebt.click();
	}
	
	

}
