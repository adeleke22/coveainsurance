package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".skip-account > span:nth-child(2)")
	WebElement QuotePage;


	@FindBy(css = "li.last:nth-child(6) > a:nth-child(1)")
	WebElement loginnew;
	
	
	public void Click_Quotepage() {
		QuotePage.click();
	}
	
	public void Click_Loginnew() {
		QuotePage.click();
	}
}
