package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends Pagebase {

	public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement backpack ;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement bikelight;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement boltshirt;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cartlink;
	
	@FindBy(xpath = "//span[@class='title']")
	public WebElement successmessage ;
	
	@FindBy(id = "react-burger-menu-btn")
	WebElement leftmenu;
	
	//@FindBy(id = "logout_sidebar_link")
	//WebElement leftmenu_logout;
	
	public void userproducts()
	{
		
		clickbutton(backpack) ;
		
		clickbutton(bikelight);
		
		clickbutton(boltshirt);
		
		clickbutton(cartlink);
		
		//clickbutton(leftmenu_logout);
		
	}
	

}
