package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FinishPage extends Pagebase {

	
	
	public FinishPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@FindBy(id = "finish" )
	WebElement finishkbtn;
	
	
	public void finishbtn() {
		
		
		clickbutton(finishkbtn);
		
	}
	

}
