package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends PageObjectsBase {

	public SignupPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(id ="ap_customer_name")
	WebElement signupNameTxtBox;

	@FindBy(id ="ap_email")
	WebElement signupEmailTxtBox;

	@FindBy(id ="ap_password")
	WebElement signupPasswordTxtBox;

	@FindBy(id ="ap_password_check")
	WebElement signupRePasswordTxtBox;

	@FindBy(id ="continue")
	WebElement signupContinueButton;

	@FindBy(linkText ="a different e-mail address")
	WebElement signupWithAnotherEmailLink;




	public void signupWithAmazonpWithExistEmail(String signupName, String signupEmail, String signupPassword, 
			String signuprePassword)
	{
		setTextForElement(signupNameTxtBox, signupName);
		setTextForElement(signupEmailTxtBox, signupEmail);
		setTextForElement(signupPasswordTxtBox, signupPassword);
		setTextForElement(signupRePasswordTxtBox, signuprePassword);
		clickOnButton(signupContinueButton);
	}

	public void signupWithAmazonwithdiffrentEmail(String signupName, String signupEmail, String signupPassword, 
			String signuprePassword)
	{
		clickOnButton(signupWithAnotherEmailLink);
		setTextForElement(signupNameTxtBox, signupName);
		setTextForElement(signupEmailTxtBox, signupEmail);
		setTextForElement(signupPasswordTxtBox, signupPassword);
		setTextForElement(signupRePasswordTxtBox, signuprePassword);
		clickOnButton(signupContinueButton);
	}
	
	public void navigateToAmazon(WebDriver driver) 
	{
		driver.navigate().to("https://www.amazon.com");	
	}
}
