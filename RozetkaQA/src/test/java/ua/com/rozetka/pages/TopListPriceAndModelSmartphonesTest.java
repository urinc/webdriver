package ua.com.rozetka.pages;

import org.testng.annotations.Test;

import ua.com.rozetka.steps.TopListPriceAndModelSmartphonesSteps;

public class TopListPriceAndModelSmartphonesTest extends TopListPriceAndModelSmartphonesSteps {
	
		
	TopListPriceAndModelSmartphonesTest step;
	
		@Test
	public void getModelAndPriceOfTopRatedSmartphones() {
		openUrl("http://rozetka.com.ua");         // - зайти на сайт rozetka.com.ua
		goToPhonesMp3();                          // - перейти у розділ "Телефони, MP3, GPS"
		goToSmartphones();					      // - перейти у розділ "Смартфони"
		goToAllSmartphones();					  // - перейти у розділ "Всі смартфони"
		selectModelAndPriceFromTopDevices(3);	  // - вибрати з перших трьох сторінок пошукової видачі назви і ціни всіх 
												  //   девайсів позначених як "Топ продажів"
		sendModelAndPriceInformationToDB();       // - записати отримані результати у БД
		
		
		
		}
		
	
			
}