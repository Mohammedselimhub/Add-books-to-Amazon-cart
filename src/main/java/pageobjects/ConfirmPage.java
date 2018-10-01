package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmPage extends PageObjectsBase {

	public ConfirmPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="h2.uiHeaderTitle")
	public WebElement confirmEmailTitle; 
	
	@FindBy(partialLinkText="Log Out")
	public WebElement confirmLogout;
	
	@FindBy(id ="userNavigationLabel")
	WebElement logOutMenuButton;


	@FindBy(partialLinkText="Log Out")
	WebElement logOutButton;


	public void clickOnLogoutMenu()
	{
		clickOnButton(logOutMenuButton);
	}

	public void clickOnLogoutButton()
	{
		clickOnButton(logOutButton);
		clickOnButton(confirmLogout);
	}

	
	
}
