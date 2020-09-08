package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BlazeDemoHomePage {
	
	@FindBy(how=How.LINK_TEXT,using = "destination of the week! The Beach!")
	public WebElement destinationOfTheWeek;
	
	@FindBy(how=How.LINK_TEXT,using = "home")
	public WebElement homeLink;
	
	@FindBy(how=How.XPATH,using = "//select[@name='fromPort']")
	public WebElement fromPort;
	
	@FindBy(how=How.NAME,using = "toPort")
	public WebElement toPort;
	
	@FindBy(how=How.XPATH,using = "//input[@class='btn btn-primary']")
	public WebElement findFlights;

}
