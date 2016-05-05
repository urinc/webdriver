package ua.com.rozetka.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhonesMp3Page extends BasePage{
	
	
	By phonesMp3GpsButton = By.xpath("//*[@menu_id='47']");
	By smartphonesButton  = By.xpath("//*[@id='m-main']/li[2]/div/div/div/div/ul/li[1]/a");
	By smartphonesButton2 = By.xpath("//*[@id='menu_categories_left']/li[1]/ul/li[1]");
	
	public PhonesMp3Page(WebDriver driver) {
		this.driver = driver;
		}

	public void clickPhonesMp3Button() {
		webElementWaitsLocator(phonesMp3GpsButton).click();
		
		
	}
	
	public void clickPhonesButton() {
		try{		
			webElementWaitsLocator(smartphonesButton).click();
		}
		catch (Exception e){
			webElementWaitsLocator(smartphonesButton2).click();
		}	
		
	}
}	

