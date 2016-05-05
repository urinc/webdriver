package ua.com.rozetka.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	// WebDriver driver;
	public	WebDriver driver;
	
	
	
//	public void initDriver(){
//	this.driver= new FirefoxDriver();
//	}
	
	@AfterMethod
	public void TearDown() {
		this.driver.quit();
	}
	
	@BeforeMethod
	
	public void initDriver(){
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	}
	
	
	public void openUrl(String url) {
			driver.get(url);
	}	
	
	
	
	
	
}
