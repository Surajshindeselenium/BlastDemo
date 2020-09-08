package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightsSearchPage {
	
	@FindBy(how=How.XPATH,using = "//input[@type='submit'][1]")
	public WebElement chooseFlight;


}
