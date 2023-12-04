package utilities;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pageElements.LandingPage;

public class Basetest {
public WebDriver driver;
	
	public WebDriver intializebrowser() throws IOException {
		
		
	    	 driver= new ChromeDriver(); // intializing 
	    
		
		return driver;
	}
	
	public LandingPage LaunchApplication() throws IOException {
		driver=intializebrowser();
		LandingPage lp = new LandingPage(driver);
		lp.GoTo();
		return lp;
	}
	
//	@AfterMethod
//	public void CloseBrowser() {
//		
//		driver.quit();
//	}
}
