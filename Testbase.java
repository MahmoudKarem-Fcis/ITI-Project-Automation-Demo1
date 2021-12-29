package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Testbase {
	
	public static WebDriver driver;
	
	
	@SuppressWarnings("deprecation") 
	@BeforeSuite
	@Parameters({"browser"})
	public void startdriver(@Optional("chrome") String browsername)
	{
		if (browsername.equalsIgnoreCase("chrome")) 
		{
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe" );
			driver=new ChromeDriver();
			
		}
		
		else if (browsername.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe" );
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://www.saucedemo.com/");
		
	}
	
	
	
	
	//@SuppressWarnings("deprecation")
	@AfterSuite
	public void stopdriver()
	{
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.quit();
		
		
	}

}
