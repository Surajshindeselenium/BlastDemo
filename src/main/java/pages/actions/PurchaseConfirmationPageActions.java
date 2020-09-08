package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pages.locators.PurchaseConfirmationPage;
import utility.SeleniumDriver;

public class PurchaseConfirmationPageActions {
	
	PurchaseConfirmationPage purchaseConfirmationPage = null;
	
	public PurchaseConfirmationPageActions() {
		
		this.purchaseConfirmationPage = new PurchaseConfirmationPage();
		PageFactory.initElements(SeleniumDriver.getDriver(), purchaseConfirmationPage);
		
	}
	
	public void confirmPurchaseID() {
		
		boolean idStatus = purchaseConfirmationPage.confirmationId.isDisplayed();
		Assert.assertTrue(idStatus);
		
	}
	

}
