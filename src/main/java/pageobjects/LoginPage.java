package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObjectsBase {

	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id="createAccountSubmit")
	WebElement createAmazonAccount ;
	
	public void clickOnCreateAmazonAccount()
	{
		clickOnButton(createAmazonAccount);
	}

}
