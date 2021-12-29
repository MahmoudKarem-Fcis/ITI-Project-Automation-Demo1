package tests;

import org.testng.annotations.Test;

import pages.Assertcomp;


public class Assertcomp_test extends Testbase {

	Assertcomp assertcompobj;
	
	
	@Test(priority = 5)
	
	public void assertforthnx() {
		
		assertcompobj = new Assertcomp(driver);
		
		assertcompobj.assercopm1();
		
		
	}
	

		
		

	
}
