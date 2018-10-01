package pageobjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class BooksPage extends PageObjectsBase {

	public BooksPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}

	
	
	@FindBy(xpath="//span[@id='productTitle']")
	public WebElement firstBook; 
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCartButton; 
	
	@FindBy(xpath="//img[@src='https://images-na.ssl-images-amazon.com/images/I/518WDIwqi5L._AC_SL230_.jpg']")
	public WebElement secondBookLink;
	
	@FindBy(xpath ="//img[@src='https://images-na.ssl-images-amazon.com/images/I/51-G1oBxtsL._AC_SL230_.jpg']")
	WebElement thirdBookLink;


	@FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
	public WebElement itemsAddedInTheBasket;
	
	@FindBy(id="hlb-view-cart-announce")
	WebElement goToCartButton;
	
	
	
	
	public void addBooksToShopingCart()
	{
		clickOnButton(addToCartButton);
		scrollDownless();
		action.moveToElement(secondBookLink).click().build().perform();
		clickOnButton(addToCartButton);
		scrollDownless();
		action.moveToElement(thirdBookLink).click().build().perform();
		clickOnButton(addToCartButton);
	}
	
	public void clickOnCartButton()
	{
		clickOnButton(goToCartButton);
	}
	

	

	
	
}
