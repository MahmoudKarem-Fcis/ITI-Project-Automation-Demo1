package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cont_info extends Pagebase  {

	public Cont_info(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@FindBy(id = "first-name")
	
	WebElement firstusername ;
	
	@FindBy(id="last-name")
	WebElement lastusername ;
	
	@FindBy(id="postal-code")
	WebElement postalcodetxt ;
	
	@FindBy(id="continue")
	WebElement contbutton;
	
	
	
	public void userconinfo(String firstname , String secondname, String postalcode) 
	{
		
		//Thread.sleep(3000);
		//username.click();
		//clickbutton(firstusername);
			
		// username.sendKeys(user);
		set_text_elmenttxt(firstusername, firstname);
		
		
		
		//userpassword.click();
		//clickbutton(lastusername);
		
		//userpassword.sendKeys(password);
		set_text_elmenttxt(lastusername, secondname);
		
		
		//clickbutton(postalcodetxt);
		
		set_text_elmenttxt(postalcodetxt, postalcode);
		
		clickbutton(contbutton);
		
		
	}
	

}
