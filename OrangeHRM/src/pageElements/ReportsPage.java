package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class ReportsPage extends AbstractMethods{

	WebDriver driver;

	public ReportsPage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);


	}
	
	@FindBy(xpath="//li[@class='oxd-topbar-body-nav-tab --visited']")
	WebElement reports;
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	WebElement reportname;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement selectsearch;
	
	public CloseBrowser report() {
		implicitlywaitmethod();
		
		reports.click();
		reportname.sendKeys("Administration");
		selectsearch.click();
		
		CloseBrowser cb = new CloseBrowser(driver);
		return cb;
	}
}

