package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.FlightsSearchPage;
import utility.SeleniumDriver;

public class FlightsSearchPageActions {
	
	FlightsSearchPage flightsSearchPage = null;
	
	public  FlightsSearchPageActions() {
		
		this.flightsSearchPage = new FlightsSearchPage();
		PageFactory.initElements(SeleniumDriver.getDriver(), flightsSearchPage);
		
	}
	
	public void chooseFlight() {
		
		flightsSearchPage.chooseFlight.click();
		
	}
	
	

}
