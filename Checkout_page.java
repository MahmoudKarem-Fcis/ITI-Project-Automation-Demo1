package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout_page extends Pagebase{

	public Checkout_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(id = "checkout")
	WebElement checkbtn;
	
	
	
	
	
	
	//(//div[@class='inventory_item_name'])[1]//////////*******////////////
	
	public void usercheck()
	{
		clickbutton(checkbtn);
		
		
		//clickbutton(finishkbtn);
		
	}
	

}
