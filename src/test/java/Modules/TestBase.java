package Modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.QuotePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestBase {

	public static WebDriver driver;


//	public WebDriver getDriver(){
//		if(driver == null){
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\koduk\\eclipse-workspace2\\Covea_Insurance_testing\\src\\test\\resources\\Drivers\\chromedriver.exe");
//			//driver = new ChromeDriver();
//
//		}
//		return driver;
//	}

//	@Before 
//	public void Browser_Steup() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\koduk\\eclipse-workspace2\\Covea_Insurance_testing\\src\\test\\resources\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//	}
//	
//	@After
//	public void teardown() {
//		driver.close();
//		driver.quit();
//	}
//	
//
//	public WebDriver getWebDriver()
//	{
//		return driver;
//	
//	}
	
}
