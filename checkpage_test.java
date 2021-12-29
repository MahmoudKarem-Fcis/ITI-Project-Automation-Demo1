package tests;

import org.testng.annotations.Test;

import pages.Checkout_page;


public class checkpage_test extends Testbase{

	
	Checkout_page checkpageobj ;
	
	/*@Test(priority = 0)
	public void Registerone()
	{
		
		UserregiterationPage registerpageobj = new UserregiterationPage(driver);
		
		registerpageobj.userregisteration("standard_user", "secret_sauce");
		
		
	}
	
	/*@Test(priority = 1)
	public void productsone() {
		
	ProductsPage productobj = new ProductsPage(driver);
	
	productobj.userproducts();
	
	
	}*/
	
	@Test(priority  = 2)
	
	public void checkoutitems()
	
	{
		
		checkpageobj = new Checkout_page(driver);
		
		checkpageobj.usercheck();
		
		
		
	}
	
}
