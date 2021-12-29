package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pagebase {
	
	protected WebDriver driver;
	
	public Pagebase(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
				
	}
	
	protected static void clickbutton(WebElement button)
	
	{
		
		button.click();
		
	}
	
	protected static void  set_text_elmenttxt(WebElement textelement , String value)
	{
	
		textelement.sendKeys(value);
		
	}
	

}
