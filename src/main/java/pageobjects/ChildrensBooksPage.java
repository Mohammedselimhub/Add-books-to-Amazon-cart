package pageobjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChildrensBooksPage extends PageObjectsBase {

	public ChildrensBooksPage(WebDriver driver)
	{
		super(driver);
		jse = (JavascriptExecutor) driver;
	}


	@FindBy(linkText="Ages 9-12 Years Old")
	WebElement ageFillterLink; 

	@FindBy(name="s-ref-checkbox-3291437011")
	WebElement englishBooksFilterCheckBox;

	@FindBy(id="loginbutton")
	WebElement loginButton;

	@FindBy (linkText="To All the Boys I've Loved Before")
	WebElement bookSelectedLink;


	public void filterBooksByAgeAndLanguage()
	{
		clickOnButton(ageFillterLink);
		scrollDown();

		if ( !englishBooksFilterCheckBox.isSelected() )
		{
			clickOnButton(englishBooksFilterCheckBox);
		}
		
		clickOnButton(bookSelectedLink);
	}


}
