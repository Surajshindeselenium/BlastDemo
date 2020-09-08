package blazedemo.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.actions.BlazeDemoHomePageActions;
import pages.actions.DestinationOfTheWeekPageActions;
import utility.SeleniumDriver;

public class DestinationOfTheWeekTest extends SeleniumDriver {
	
	DestinationOfTheWeekPageActions destinationOfTheWeekPageActions = new DestinationOfTheWeekPageActions();
	BlazeDemoHomePageActions blazeDemoHomePageActions = new BlazeDemoHomePageActions();
	@BeforeMethod
	public void setUp() {
		
		openPage();
		
	}
	
	@AfterMethod
	public void tearDownMethod() {
		
			SeleniumDriver.tearDown();
		
	}
	@Test
	public void destinationOfTheWeekPageOpening() {
		blazeDemoHomePageActions.beachFlights();
		destinationOfTheWeekPageActions.getTitleMethod();
		
	}
	
}
