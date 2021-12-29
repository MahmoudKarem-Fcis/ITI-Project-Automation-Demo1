 package tests;

import org.testng.annotations.Test;

import pages.UserregiterationPage;

public class Userregisterationtest extends Testbase {
	
	
	 //WebDriverWait wait ;
	UserregiterationPage registerobj;
	
	
	@Test(priority = 0)
	public void registersuccessfulluy() 
	
	{
		
		registerobj = new UserregiterationPage(driver);
		
		registerobj.userregisteration("standard_user", "secret_sauce");
		

	}

	
	
}
