package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserregiterationPage extends Pagebase {


	public UserregiterationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}


	@FindBy(id="user-name")
	WebElement username ;
	
	
	
	@FindBy(id="password")
	WebElement userpassword ;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	
	public void userregisteration(String user , String password)
	{
		
		//username.click();
		clickbutton(username);
			
		// username.sendKeys(user);
		set_text_elmenttxt(username, user);
		
		
		
		//userpassword.click();
		clickbutton(userpassword);
		
		//userpassword.sendKeys(password);
		set_text_elmenttxt(userpassword, password);
		
		clickbutton(loginbutton);
		
		
	}
	
	

}
