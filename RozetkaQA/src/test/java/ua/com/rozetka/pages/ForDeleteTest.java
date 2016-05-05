package ua.com.rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForDeleteTest {



		static WebDriver driver;
		
		
	//	@ BeforeClass
		public static void initDriver(){
		driver= new FirefoxDriver();
		}
		
	//	@Test	
		
		public void maintest(){
			
			goToMainPage();
			search();
				
			
		}

	
		
		
		
		
		

	public void goToMainPage() {
		
			driver.get("https://www.yandex.ua/");
			driver.manage().window().maximize();
		
		}
	
	
	
	
	
	
	
	
	public void search() {
		
		YandexPage page = new YandexPage(driver);
		page.search("lighter");
		page.search("lighter bic");
	}

	}
	
