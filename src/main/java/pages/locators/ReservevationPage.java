package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReservevationPage {
	
	@FindBy(how=How.ID,using = "inputName")
	public WebElement passengerName;
	
	@FindBy(how=How.ID,using = "address")
	public WebElement passengerAddress;
	
	@FindBy(how=How.ID,using = "city")
	public WebElement passengerCity;
	
	@FindBy(how=How.ID,using = "state")
	public WebElement passengerState;
	
	@FindBy(how=How.ID,using = "zipCode")
	public WebElement zipCode;
	
	@FindBy(how=How.ID,using = "cardType")
	public WebElement cardType;
	
	@FindBy(how=How.ID,using = "creditCardNumber")
	public WebElement creditCardNumber;
	
	@FindBy(how=How.ID,using = "creditCardMonth")
	public WebElement creditCardMonth;
	
	@FindBy(how=How.ID,using = "creditCardYear")
	public WebElement creditCardYear;
	
	@FindBy(how=How.ID,using = "nameOnCard")
	public WebElement nameOnCard;
	
	@FindBy(how=How.ID,using = "rememberMe")
	public WebElement rememberMe;
	
	@FindBy(how=How.XPATH,using = "//input[@type='submit']")
	public WebElement purchaseFlight;
	
	
	
	
	

}
