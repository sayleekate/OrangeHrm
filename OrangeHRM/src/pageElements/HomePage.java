package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class HomePage extends AbstractMethods{
	WebDriver driver;

	public HomePage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[2]")
	WebElement selectPIM;
	public Employeelistpage openpim() throws InterruptedException {
		implicitlywaitmethod();
		selectPIM.click();

		Employeelistpage el = new Employeelistpage(driver);
		return el;
	}	
	}

