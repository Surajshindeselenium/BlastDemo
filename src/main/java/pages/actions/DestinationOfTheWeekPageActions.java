package pages.actions;

import org.testng.Assert;

import utility.SeleniumDriver;

public class DestinationOfTheWeekPageActions {
	
	public void getTitleMethod() {
		
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, "BlazeDemo - vacation");
		
	}

}
