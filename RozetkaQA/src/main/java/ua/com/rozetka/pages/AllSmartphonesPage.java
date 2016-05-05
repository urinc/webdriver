package ua.com.rozetka.pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllSmartphonesPage extends BasePage {
	By allSmartphonesButton = By.xpath("//*[@id='menu_categories_left']/li[1]//li[1]/a");
	By moreTrades = By.xpath("//*[@class='preloader-animation']");
	By nameLocator = By.xpath(
			"(//*[@class='g-tag  g-tag-icon-middle-popularity sprite']"
			+ "/ancestor::*[@class='g-i-tile g-i-tile-catalog'])"
			+ "//*[@class='g-i-tile-i-title clearfix']");
	By priceLocator = By.xpath(
			"(//*[@class='g-tag  g-tag-icon-middle-popularity sprite']"
			+ "/ancestor::*[@class='g-i-tile g-i-tile-catalog'])"
			+ "//*[@class='g-price-uah']");
	
	By availablePagesLocator = By.xpath(".//*[@class='paginator-catalog-l-i']");
	
//	WebDriver driver = null;
	ConnectionDB cdb=new ConnectionDB(); 
	
	public AllSmartphonesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void allSmartphones() {

		webElementWaitsLocator(allSmartphonesButton).click();
	}

	public void setQuantityOfPages(int quantityOfPages) {
		
		
		for (int i = 0; i < quantityOfPages - 1; i++) {
			webElementWaitsLocator(moreTrades).click();
		}
		
	}

	
	
	
	public void getModelPriceFromTopSales() {
		
		List<WebElement> modelList = this.driver.findElements(nameLocator);
		List<WebElement> priceList = this.driver.findElements(priceLocator);
	
		System.out.println("Quantity of TOP-RATED-SMARTPHONES: " + modelList.size());
		
		for (int i = 0; i < modelList.size(); i++) {
			String getModelName = modelList.get(i).getText().replaceAll("[\\а-яА-Я+!]", "");
			String getPrice = priceList.get(i).getText().replaceAll("[^\\d]", "");
			cdb.setDB(getModelName, getPrice);
		}	
		
		cdb.getDB();
		
	}
}
