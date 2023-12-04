package tests;

import org.testng.annotations.Test;

import utilities.Basetest;
import utilities.ExcelUtility1;

public class PIMFlow extends Basetest{

	pageElements.LandingPage lp;
	pageElements.HomePage hp;
	pageElements.Employeelistpage el;
	pageElements.AddEmployeePage ep;
	pageElements.ReportsPage rp;
	pageElements.CloseBrowser cb;
	@Test
	public void pimflow() throws Exception {
	   lp=LaunchApplication();
		
       ExcelUtility1 xs = new ExcelUtility1();
		
		String username = xs.Get_Username(1, 0).toString();
		String password = xs.Get_password(1, 1).toString();
		hp=lp.enterlogindetails(username,password);
				
	}
	
	@Test(dependsOnMethods = { "pimflow" })
	public void clickonpim() throws Exception {
		
		el=hp.openpim();
	}
	
	@Test(dependsOnMethods = { "pimflow", "clickonpim" })
	public void searchemployee() throws Exception {
		
		ep=el.employeelist();
	}
	
	@Test(dependsOnMethods = { "pimflow", "clickonpim" ,"searchemployee"})
	public void addemployeedetails() throws Exception {
		
		rp=ep.addemployee();
	}
	
	@Test(dependsOnMethods = { "pimflow", "clickonpim" ,"searchemployee","addemployeedetails"})
	public void reportdetails() throws Exception {
		
		cb=rp.report();
		cb.closebrowser();
	}
}
        



		
		
	

