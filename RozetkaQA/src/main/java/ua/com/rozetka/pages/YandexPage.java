package ua.com.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexPage {

	WebDriver driver;
	
	
	@FindBy (xpath=("//*[@id='text']"))
	WebElement searchField;
	
//	By searchField1 = By.xpath("//*[@id='text']");
//	WebElement searchField ; 
//	
	 
	
	public YandexPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void search(String s) {

	//	searchField  = driver.findElement(searchField1); 
		searchField.sendKeys(s, Keys.ENTER);
		
		//searchField = driver.findElement(By.id("lst-ib"));
	
		
	}

}
