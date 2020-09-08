package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PurchaseConfirmationPage {
	
	
	@FindBy(how=How.CSS,using = "body > div.container > div > "
			+ "table > tbody > tr:nth-child(1) > td:nth-child(2)")
	public WebElement confirmationId;

}
