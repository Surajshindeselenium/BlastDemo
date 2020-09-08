package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.ReservevationPage;
import utility.SeleniumDriver;

public class ReservevationPageActions {
	
	ReservevationPage reservevationPage = null;
	
	public ReservevationPageActions() {
		
		this.reservevationPage = new ReservevationPage();
		PageFactory.initElements(SeleniumDriver.getDriver(), reservevationPage);
		
	}
	
	public void enterPassengerName() {
		
		reservevationPage.passengerName.sendKeys("Peter Smith");
		
	}
	
	public void enterPassengerAddress() {
		
		reservevationPage.passengerAddress.sendKeys("Paris");
		
	}
	
	public void selectCardType() {
		
		Select select = new Select(reservevationPage.cardType);
		select.selectByVisibleText("American Express");
	}
	
	public void clickOnPurchaseFlight() {
		
		reservevationPage.purchaseFlight.click();
		
	}

}
