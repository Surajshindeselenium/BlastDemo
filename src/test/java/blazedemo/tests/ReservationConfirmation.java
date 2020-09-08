package blazedemo.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.actions.BlazeDemoHomePageActions;
import pages.actions.FlightsSearchPageActions;
import pages.actions.PurchaseConfirmationPageActions;
import pages.actions.ReservevationPageActions;
import utility.SeleniumDriver;

public class ReservationConfirmation extends SeleniumDriver {
	
	BlazeDemoHomePageActions blazeDemoHomePageActions = new BlazeDemoHomePageActions();
	FlightsSearchPageActions flightsSearchPageActions = new FlightsSearchPageActions();
	ReservevationPageActions reservevationPageActions = new ReservevationPageActions();
	PurchaseConfirmationPageActions purchaseConfirmationPageActions = new PurchaseConfirmationPageActions();
	
	@BeforeMethod
	public void setUp() {
		
		openPage();
		
	}
	
	@AfterMethod
	public void tearDownMethod() {
		
			SeleniumDriver.tearDown();
		
	}
	
	@Test
	public void reservationConfirmationTest() throws InterruptedException  {
		
		Thread.sleep(5000);
		
		blazeDemoHomePageActions.getPageTitle();
		blazeDemoHomePageActions.selectDepartureCity("Mexico City");
		blazeDemoHomePageActions.selectDestinationCity();
		blazeDemoHomePageActions.clickOnFindFlights();
		
		flightsSearchPageActions.chooseFlight();
		
		reservevationPageActions.enterPassengerName();
		reservevationPageActions.enterPassengerAddress();
		reservevationPageActions.selectCardType();
		reservevationPageActions.clickOnPurchaseFlight();
		
		purchaseConfirmationPageActions.confirmPurchaseID();
		
		
		
	}

}
