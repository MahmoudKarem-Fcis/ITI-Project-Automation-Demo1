package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductsPage;
import pages.UserregiterationPage;


public class Product_page_test extends Testbase {


	ProductsPage productobj;

	UserregiterationPage userregisterobj;

	/*@Test(priority = 0)
	public void Registerone()
	{

		UserregiterationPage registerpageobj = new UserregiterationPage(driver);

		registerpageobj.userregisteration("standard_user", "secret_sauce");


	}*/
	@Test(priority = 1)
	public void chooseitem()
	{
		//userregisterobj = new UserregiterationPage(driver);
		
		//userregisterobj.userregisteration("problem_user", "secret_sauce");

		productobj =new ProductsPage(driver);



		Assert.assertTrue(productobj.successmessage.getText().contains("PRODUCTS"));

		productobj.userproducts();


	}





}
