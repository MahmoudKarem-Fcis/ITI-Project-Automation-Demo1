package tests;

import org.testng.annotations.Test;

import pages.FinishPage;

public class Finishpage_test extends Testbase {
	
	FinishPage finishpageobj ;
	
	
	@Test(priority = 4)
	public void finishtest()
	{
		

		finishpageobj = new FinishPage(driver);
		
		finishpageobj.finishbtn();
		
		
	}
	
	
	
	

	
	
	
}
