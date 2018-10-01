package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectsBase {

	protected WebDriver drvier; 
	public Select select; 
	public JavascriptExecutor jse;
	public Actions action;


	public PageObjectsBase (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	protected static void clickOnButton(WebElement button) 
	{
		button.click();
	}

	protected static void setTextForElement(WebElement textElement , String value) 
	{
		textElement.sendKeys(value);
	}


	public void scrollDown()
	{
		jse.executeScript("scrollBy(0, 1800)");	
	}
	
	public void scrollDownless()
	{
		jse.executeScript("scrollBy(0, 1000)");	
	}

}
