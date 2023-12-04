package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class AddEmployeePage extends AbstractMethods{

	WebDriver driver;

	public AddEmployeePage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//li[@class='oxd-topbar-body-nav-tab'])[1]")
	WebElement click_addemployee;
	
	@FindBy(name="firstName")
	WebElement firstName;
	
	@FindBy(name="MiddleName")
	WebElement MiddleName;
	
	@FindBy(name="LastName")
	WebElement LastName;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement employeeid;
	
	@FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	WebElement clicklogindetails;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement enterusername;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement enterpassword;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[5]")
	WebElement enter_recofirmpassword;
	
	@FindBy(xpath="(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]")
	WebElement clickstatus;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement selectsearch;
	
	public ReportsPage addemployee() {
		implicitlywaitmethod();
		
		click_addemployee.click();
		
		firstName.sendKeys("saylee");
		MiddleName.sendKeys("N");
		LastName.sendKeys("kate");
		employeeid.sendKeys("7890");
		clicklogindetails.click();
		
		enterusername.sendKeys("Admin");
		enterpassword.sendKeys("admin123");
		enter_recofirmpassword.sendKeys("admin123");
		clickstatus.click();
		
		
		selectsearch.click();
		
		ReportsPage rp = new ReportsPage(driver);
		return rp;
	}
}
