package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.errorprone.annotations.FormatMethod;

import sdet.util.Utility;
import testbase.TestBase;

public class NewContactPage extends TestBase {
	
	@FindBy(id = "first_name")
	WebElement firstName;

	@FindBy(id = "surname")
	WebElement lastName;
	
	@FindBy(name = "title")
	WebElement title;

	@FindBy(id = "email")
	WebElement createemail;

	@FindBy(id = "mobile")
	WebElement createmobileno;
	
	@FindBy(xpath = "//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[2]/input[3]")
	WebElement companyname;
	
	@FindBy(xpath = "//*[@id=\"company_position\"]")
	WebElement position;
	
	@FindBy(xpath = "//*[@id=\"contactForm\"]/table/tbody/tr[3]/td/fieldset/table/tbody/tr/td/table/tbody/tr[1]/td[2]/input")
	WebElement address;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")
	WebElement savebtn;
	
	/*@FindBy(xpath = "//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[2]/table/tbody/tr[9]/td[2]/input[2]")
	WebElement noemail;

	@FindBy(xpath = "//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[2]/table/tbody/tr[10]/td[2]/input[2]")
	WebElement nosms;

	@FindBy(xpath = "//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[2]/table/tbody/tr[11]/td[2]/input[2]")
	WebElement nocalls;*/
	
	public NewContactPage() {
		PageFactory.initElements(driver, this);

	}

	public void createContact(String fn, String ln, String email, String mobile, String comp, String pos, String add)  {
		Utility.selectDropDown(title, "Mr.");
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		createemail.sendKeys(email);
		createmobileno.sendKeys(mobile);
		companyname.sendKeys(comp);
		position.sendKeys(pos);
		address.sendKeys(add);
		//savebtn.click();
		
		

		/*noemail.click();
		nosms.click();
		nocalls.click();*/

		
	}

	
		

	}


		
		

	


