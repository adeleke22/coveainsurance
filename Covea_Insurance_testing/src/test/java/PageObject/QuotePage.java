package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotePage {

	
	WebDriver driver;
	public QuotePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".skip-account")
	WebElement btn_dropdown;
	public void select_dropdown () {
		btn_dropdown.click();
	}
	
	@FindBy(css = "div.links:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")
	WebElement btn_title;
	public void select_title () {
		btn_title.click();
	}
	
	@FindBy(name = "")
	WebElement txt_Firstname;
	public void txt_Firstname (String string ) {
		txt_Firstname.sendKeys(string);
	}
	
	@FindBy(name = "")
	WebElement txt_Surname;
	public void txt_surname (String string) {
		txt_Surname.sendKeys(string);
	}
	
	
	@FindBy(name = "q")
	WebElement txt_Email_Address;
	public void enter_invalid_email (String email) {
		txt_Email_Address.sendKeys(email);
	}
	
	public void enter_valid_email (String email) {
		txt_Email_Address.sendKeys(email);
	}
	
	@FindBy(name = "")
	WebElement txt_Confirm_Email_Address;
	
	@FindBy(name = "")
	WebElement txt_Telephone_Number;
	
	@FindBy(name = "")
	WebElement txt_Postcode;
	
	@FindBy(name = "")
	WebElement btn_Continue;
	
}
