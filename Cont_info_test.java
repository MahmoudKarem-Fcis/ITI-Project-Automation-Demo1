package tests;


import org.testng.annotations.Test;

import pages.Cont_info;

public class Cont_info_test extends Testbase {

	
	Cont_info continfoobj;
	
	
	@Test(priority = 3)
	public void conifoverify() 
	
	{
		
		continfoobj = new Cont_info(driver);
		//Thread.sleep(1000);
		continfoobj.userconinfo("mahmoud", "karem" ,"11326");
		
		
		

	}
	
	
}
