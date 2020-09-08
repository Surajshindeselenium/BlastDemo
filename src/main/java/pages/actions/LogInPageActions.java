package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pages.locators.LogInPage;
import utility.SeleniumDriver;

public class LogInPageActions {
	
	LogInPage logInPage = null;
	
	public LogInPageActions() {
		
		this.logInPage = new LogInPage();
		PageFactory.initElements(SeleniumDriver.getDriver(), logInPage);
		
	}
	
	public void enterEmailAndPassword() {
		
		logInPage.emailAddress.sendKeys("Suraj@gamil.com");
		logInPage.password.sendKeys("1234");
		logInPage.logInButton.click();
		
		String actualPageTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualPageTitle, "Page Expired");
		
	}

}
