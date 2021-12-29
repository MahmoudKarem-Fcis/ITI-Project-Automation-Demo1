package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Assertcomp extends Pagebase {

	public Assertcomp(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//h2[@class='complete-header']")
	WebElement thankyoutxt ;
	


	public void assercopm1() {
		
		// TODO Auto-generated method stub
		String thnxtxt= thankyoutxt.getText();
		Assert.assertEquals(thnxtxt,"THANK YOU FOR YOUR ORDER");
		
	}

	
}
