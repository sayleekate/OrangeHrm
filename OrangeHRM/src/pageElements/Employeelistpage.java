package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Employeelistpage extends AbstractMethods{

	WebDriver driver;

	public Employeelistpage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	WebElement employeename;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement employeeid;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	WebElement employeestatus_Dropdown;
	
	@FindBy(xpath="//*text()='Full-Time Contract']")
	WebElement selecting_Employeestatus;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	WebElement includedropdown;
	
	@FindBy(xpath="//*text()='Past Employees Only']")
	WebElement includeselect;
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[2]")
	WebElement supervisorname;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")
	WebElement jobtitledropdown;
	
	@FindBy(xpath="//*text()='Chief Executive Officer']")
	WebElement selectjobtitle;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")
	WebElement subunitropdown;
	
	@FindBy(xpath="//*text()='Administration']")
	WebElement selectsubunit;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement selectsearch;
	
	public AddEmployeePage employeelist() {
		implicitlywaitmethod();
		
		employeename.sendKeys("saylee");
		employeeid.sendKeys("1234");
		
		employeestatus_Dropdown.click();
		selecting_Employeestatus.click();
		
		includedropdown.click();
		includeselect.click();
		
		supervisorname.sendKeys("Sowmya");
		
		jobtitledropdown.click();
		selectjobtitle.click();
		
		subunitropdown.click();
		selectsubunit.click();
		
		selectsearch.click();
		
		AddEmployeePage ae = new AddEmployeePage(driver);
		return ae;
				
	}
}

