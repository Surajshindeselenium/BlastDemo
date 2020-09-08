package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.BlazeDemoHomePage;
import utility.SeleniumDriver;

public class BlazeDemoHomePageActions {

	BlazeDemoHomePage blazeDemoHomePage = null;

	public BlazeDemoHomePageActions() {

		this.blazeDemoHomePage = new BlazeDemoHomePage();
		PageFactory.initElements(SeleniumDriver.getDriver(), blazeDemoHomePage);

	}
	
	public void clickOnHome() {
		
		blazeDemoHomePage.homeLink.click();
		
	}
	
	public void beachFlights() {
		
		blazeDemoHomePage.destinationOfTheWeek.click();
		
	}

	public void getPageTitle() {

		String homePageTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println(homePageTitle);

	}

	public void selectDepartureCity(String departureCity) {

		Select select = new Select(blazeDemoHomePage.fromPort);
		select.selectByVisibleText(departureCity);

	}

	public void selectDestinationCity() {

		Select select = new Select(blazeDemoHomePage.toPort);
		select.selectByVisibleText("London");

	}

	public void clickOnFindFlights() {

		blazeDemoHomePage.findFlights.click();

	}

}
