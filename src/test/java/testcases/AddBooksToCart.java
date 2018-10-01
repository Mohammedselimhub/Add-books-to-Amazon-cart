package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.BooksPage;
import pageobjects.CartPage;
import pageobjects.ChildrensBooksPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.SignupPage;


public class AddBooksToCart extends TestCasesBase {

	HomePage homePageObject;
	ChildrensBooksPage childrenPageObject;
	BooksPage booksPageObject;
	CartPage cartPageObject;
	LoginPage loginPageObject;
	SignupPage signupPageObject;


	@Test(priority = 1, description = " user can select childerns books from department menu and filter") 
	public void selectChildernsBooksFromMenu() 
	{
		homePageObject = new HomePage(driver);
		homePageObject.clickOnChildernsBookMenu();
		childrenPageObject = new ChildrensBooksPage(driver);
		childrenPageObject.filterBooksByAgeAndLanguage();
	}

	@Test(priority = 2, description = " Add books to shopping cart") 
	public void addChildrenBooksToShoppingCart() 
	{
		booksPageObject = new BooksPage(driver);
		booksPageObject.addBooksToShopingCart();
		Assert.assertEquals(booksPageObject.itemsAddedInTheBasket.getText(),"Proceed to checkout (3 items)");
		System.out.println(booksPageObject.itemsAddedInTheBasket.getText());
		booksPageObject.clickOnCartButton();
		cartPageObject = new CartPage(driver);
		Assert.assertEquals(cartPageObject.firstBookName.getText(),"P.S. I Still Love You (To All the Boys I've Loved Before)");
		System.out.println(cartPageObject.firstBookName.getText());
		Assert.assertTrue(cartPageObject.secondtBookName.getText().equalsIgnoreCase("Always and Forever, Lara Jean (To All the Boys I've Loved Before)"));
		Assert.assertTrue(cartPageObject.thirdBookName.getText().equalsIgnoreCase("To All the Boys I've Loved Before"));
		Assert.assertTrue(cartPageObject.firstdBookprice.getText().equalsIgnoreCase("$7.75"));
		Assert.assertTrue(cartPageObject.secondBookprice.getText().equalsIgnoreCase("$8.00"));
		Assert.assertTrue(cartPageObject.thirdBookprice.getText().equalsIgnoreCase("$7.94"));
		Assert.assertTrue(cartPageObject.firstBookQuantity.getText().equalsIgnoreCase("1"));
		Assert.assertTrue(cartPageObject.secondBookQuantity.getText().equalsIgnoreCase("1"));
		Assert.assertTrue(cartPageObject.thirdBookQuantity.getText().equalsIgnoreCase("1"));
		Assert.assertTrue(cartPageObject.subTotalLable.getText().equalsIgnoreCase("$23.69"));
		cartPageObject.proceedTocheckOut();
	}

	@Test(priority = 3, description = " signup with existing user") 
	public void signupWithExistingUUser() 
	{
		loginPageObject = new LoginPage(driver);
		loginPageObject.clickOnCreateAmazonAccount();
		signupPageObject = new SignupPage(driver);
		signupPageObject.signupWithAmazonpWithExistEmail("ahmed", "", "", "");
	}

	@Test(priority = 4, description = " New user signup") 
	public void signupNewUser() 
	{
		signupPageObject = new SignupPage(driver);
		signupPageObject.signupWithAmazonwithdiffrentEmail("ahmed","ahmedqqq@gmail.com" , "", "");
		signupPageObject.navigateToAmazon(driver);
	}
	
	@Test(priority = 5, description = " open account after signup") 
	public void openYourAccount() 
	{
		signupPageObject.navigateToAmazon(driver);
		homePageObject = new HomePage(driver);
		homePageObject.clickOnYourAccount();
	}
}
