package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Modules.TestBase;
import PageObject.HomePage;
import PageObject.QuotePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class QuoteApplicationForm {
	WebDriver driver;
	QuotePage quoteform;
	HomePage homepage;

	@Before 
	public void Browser_Steup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\koduk\\eclipse-workspace2\\Covea_Insurance_testing\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		quoteform = new QuotePage(driver);
		homepage = new HomePage(driver);
	}

	@Given("I am on the Homepage")
	public void i_am_on_the_homepage() throws Throwable {
		driver.navigate().to("http://live.techpanda.org/index.php/"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("I click on My quote page Link")
	public void i_click_on_my_quote_page_link() throws Throwable {
		homepage.Click_Quotepage();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		homepage.Click_Loginnew();
	}

	@Given("The user is on the quote page")
	public void the_user_is_on_the_quote_page() throws Throwable {
		driver.findElement(By.cssSelector(".page-title > h2:nth-child(1)")).isDisplayed();
	}


	@When("the dropdown is selected")
	public void the_dropdown_is_selected() throws Throwable {
		quoteform.select_dropdown();
	}

	@Then("user can select the title MR")
	public void user_can_select_the_title_mr() throws Throwable {
		quoteform.select_title();
	}



	@When("an invalid email address \\\"([^\\\"]*)\\\" is entered$")
	public void an_invalid_email_address_is_entered(String invalid_email)throws Throwable {
		quoteform.enter_invalid_email(invalid_email);
	}

	@Then("an error is displayed")
	public void an_error_is_displayed() throws Throwable {
		//driver.findElement(By.className("page-title")).isDisplayed();
		//String ExpectedMessage = driver.findElement(By.className("page-title")).getText();
		//System.out.println(ExpectedMessage);
		String ExpectedMessage = "NEWSLETTER";
		String ActualMessage  = driver.findElement(By.cssSelector("div.block:nth-child(1) > div:nth-child(1) > strong:nth-child(1) > span:nth-child(1)")).getText();
		System.out.println(ActualMessage);
		Assert.assertEquals(ExpectedMessage, ActualMessage);
	}

	@When("a valid email address \\\"([^\\\"]*)\\\" entered$")
	public void a_valid_email_address_entered(String valid_email)throws Throwable {
		quoteform.enter_valid_email(valid_email);
	}

	@Then("no error is displayed")
	public void no_error_is_displayed()throws Throwable {

	}

	@When("they complete the Your Details Section and enter a valid postcode \\\"([^\\\"]*)\\\" and clicks find address$")
	public void they_complete_the_your_details_section_and_enter_a_valid_postcode_and_clicks_find_address(String string) {

	}

	@Then("a list of addresses is shown")
	public void a_list_of_addresses_is_shown() throws Throwable{

	}

	@When("they complete all sections with valid information and click continue")
	public void they_complete_all_sections_with_valid_information_and_click_continue()throws Throwable {

	}

	@Then("the summary page is displayed")
	public void the_summary_page_is_displayed()throws Throwable {

	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
