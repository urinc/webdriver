package ua.com.rozetka.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;

	public WebElement webElementWaitsLocator(By locator) {
		return (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

	

}
