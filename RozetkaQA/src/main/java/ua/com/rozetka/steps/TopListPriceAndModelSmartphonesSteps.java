package ua.com.rozetka.steps;

import ua.com.rozetka.pages.AllSmartphonesPage;
import ua.com.rozetka.pages.BaseTest;
import ua.com.rozetka.pages.PhonesMp3Page;

public class TopListPriceAndModelSmartphonesSteps extends BaseTest {

	PhonesMp3Page phones;
	AllSmartphonesPage modelPriceFromTopDevices;
	AllSmartphonesPage smartphones;

	public void goToPhonesMp3() {
		phones = new PhonesMp3Page(driver);
		phones.clickPhonesMp3Button();

	}

	public void goToSmartphones() {
		phones.clickPhonesButton();

	}

	public void goToAllSmartphones() {
		smartphones = new AllSmartphonesPage(driver);
		smartphones.allSmartphones();
	}

	public void selectModelAndPriceFromTopDevices(int quantityOfPages) {
		modelPriceFromTopDevices = new AllSmartphonesPage(driver);
		modelPriceFromTopDevices.setQuantityOfPages(quantityOfPages);
	}

	public void sendModelAndPriceInformationToDB() {
		modelPriceFromTopDevices.getModelPriceFromTopSales();
	}

}
