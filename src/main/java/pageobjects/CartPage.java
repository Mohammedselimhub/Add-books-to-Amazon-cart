package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObjectsBase{

	public CartPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(linkText="P.S. I Still Love You (To All the Boys I've Loved Before)")
	public WebElement firstBookName ; 

	@FindBy(linkText="Always and Forever, Lara Jean (To All the Boys I've Loved Before)")
	public WebElement secondtBookName ; 

	@FindBy(linkText="To All the Boys I've Loved Before")
	public WebElement thirdBookName ; 

	@FindBy(xpath=" //div[@data-asin='1442426748']//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold']")
	public WebElement firstdBookprice ; 
	
	@FindBy(xpath=" //div[@data-asin='1481430491']//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold']")
	public WebElement secondBookprice ;

	@FindBy(xpath=" //div[@data-asin='1442426713']//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold']")
	public WebElement thirdBookprice ;

	
	
	
	@FindBy(id="a-autoid-0-announce")
	public WebElement firstBookQuantity ;

	@FindBy(id="a-autoid-2-announce")
	public WebElement secondBookQuantity ;

	@FindBy(id="a-autoid-4-announce")
	public WebElement thirdBookQuantity ;

	@FindBy(xpath="//span[@class ='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-price-sign']")
	public WebElement subTotalLable ;	

	@FindBy(id="sc-buy-box-gift-checkbox")
	WebElement giftCheckBox ;

	@FindBy(name="proceedToCheckout")
	WebElement proceedToCheckoutButton ;
	




	public void proceedTocheckOut() 
	{
		if ( !giftCheckBox.isSelected() )
		{
			clickOnButton(giftCheckBox);
		}
		clickOnButton(proceedToCheckoutButton);
	}




}
