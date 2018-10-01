package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObjectsBase {

	public HomePage(WebDriver driver)
	{
		super(driver);
		action = new Actions(driver);
	}

	@FindBy(id="nav-link-shopall")
	public WebElement departmentHoverMenu; 

	@FindBy(xpath ="//span[@class='nav-text'][contains(text(),'Books ')]")
	WebElement booksHovermenu;

	@FindBy(xpath="//span[@class='nav-text'][contains(text(), 'Children')]")
	WebElement childrenBooksHoverMenu;

	@FindBy(xpath="//span[@class='nav-line-2'][contains(text(),'Account')]")
	WebElement accountAndListHoverMenu;
	
	@FindBy(xpath="//span[@class='nav-text'][contains(text(),'Your Account')]")
	WebElement yourAccountHoverMenu;
	
	
	

//	perform.moveToElement(accountMenu).perform();
//
//	perform.moveToElement(myAccountMenu).click().perform();
//
//

	public void clickOnChildernsBookMenu()
	{
		action.moveToElement(departmentHoverMenu)
		.moveToElement(booksHovermenu)
		.moveToElement(childrenBooksHoverMenu)
		.click()
		.build()
		.perform();
	}

	public void clickOnYourAccount()
	{
		action.moveToElement(accountAndListHoverMenu)
		.moveToElement(yourAccountHoverMenu)
		.click()
		.build()
		.perform();
	}




}