package com.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Dashboard;
import com.qa.pages.Dealership;
import com.qa.pages.Login;
import com.qa.pages.User;

public class DealershipTestcase extends TestBase {
	
	Login lginPge;
	Dashboard dshBrd;
	User userPage;
	Dealership dealershipPage ; 
	
	public DealershipTestcase(){
		super();
	}
	 
	@BeforeMethod
	public void setUp(){
		initialization();
		lginPge = new Login();
		dshBrd = new Dashboard();
		userPage = new User();
		dealershipPage = new Dealership();
	}
	
	
	@Test(priority=1)
	public void AddNewDealership() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		dealershipPage.ClickonSettingicon();
		dealershipPage.ClickonDepartmentLink();
		dealershipPage.ClickonDepartmentBtn();
		dealershipPage.DepName("");
		dealershipPage.DepEmailID("");
		dealershipPage.DepStreet("");
		dealershipPage.DepCity("");
		dealershipPage.DepState("");
		dealershipPage.DepPhoneNUM("");
		dealershipPage.DepExtension("");
		dealershipPage.DepZipCode("");
		dealershipPage.SelectFranchise();
		dealershipPage.SelectDMS();
		dealershipPage.DepCMAN("");
		dealershipPage.EnterDepBillName("");
		dealershipPage.EnterDepBilEmailid("");
		dealershipPage.EnterDepBilPhoneNum("");
		dealershipPage.EnterDepBilExten("");
		dealershipPage.EnterDepTechName("");
		dealershipPage.EnterDepTechEmailid("");
		dealershipPage.EnterDepTechPhneNum("");
		dealershipPage.EnterDepTechExtn("");
		dealershipPage.ClickCreateBtn();
		
		
	}
	
		@AfterMethod
	    public void tearDown(){
			driver.quit();
	}

}
