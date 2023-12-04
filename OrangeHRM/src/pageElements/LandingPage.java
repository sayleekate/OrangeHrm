package pageElements;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class LandingPage extends AbstractMethods {

	WebDriver driver;

	public LandingPage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	public void GoTo() throws IOException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement enterusername;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement enterpassword;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitbutton;
	By enterusername1 = By.xpath("//*[@id=\\\"app\\\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	public HomePage enterlogindetails(String username, String password) throws InterruptedException {
		Wait_Till_Link_Is_Clickable(enterusername1);
		enterusername.sendKeys(username);
		enterpassword.sendKeys(password);
		submitbutton.sendKeys(Keys.ENTER);
		return null;
		
	}
	@FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[2]")
	WebElement selectPIM;
	public void openpim() throws InterruptedException {
		implicitlywaitmethod();
		selectPIM.click();

	}
}

