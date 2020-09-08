package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {
	
	@FindBy(how=How.ID,using = "email")
	public WebElement emailAddress;
	
	@FindBy(how=How.ID,using = "password")
	public WebElement password;
	
	@FindBy(how=How.XPATH,using = "//button[@type='submit']")
	public WebElement logInButton;

}
