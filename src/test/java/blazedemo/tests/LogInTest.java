package blazedemo.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.actions.BlazeDemoHomePageActions;
import pages.actions.LogInPageActions;
import utility.SeleniumDriver;

public class LogInTest extends SeleniumDriver {
	
	BlazeDemoHomePageActions blazeDemoHomePageActions = new BlazeDemoHomePageActions();
	LogInPageActions logInPageActions = new LogInPageActions();
	
	@Test
	public void invalidCredentials() {
		
		blazeDemoHomePageActions.clickOnHome();
		logInPageActions.enterEmailAndPassword();
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		openPage();
		
	}
	
	@AfterMethod
	public void tearDownMethod() {
		
			SeleniumDriver.tearDown();
		
	}

}
