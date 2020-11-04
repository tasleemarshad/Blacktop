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
		dealershipPage.DepName("Automation Dealer");
		dealershipPage.DepEmailID("automation@dealer.com");
		dealershipPage.DepStreet("AutoStreet");
		Thread.sleep(1000);
		dealershipPage.DepCity("AutoCity");
		dealershipPage.DepState("AutoState");
		dealershipPage.DepPhoneNUM("2298002128");
		Thread.sleep(1000);
		dealershipPage.DepExtension("63373");
		dealershipPage.DepZipCode("45000");
		Thread.sleep(1000);
		dealershipPage.DepFranchiseDropdown("BMW");
		dealershipPage.SelectDMS();
		dealershipPage.DepCMAN("222CMAN222");
		Thread.sleep(1000);
		dealershipPage.EnterDepBillName("Autobill");
		dealershipPage.EnterDepBilEmailid("Auto@bill.com");
		dealershipPage.EnterDepBilPhoneNum("9876556768");
		dealershipPage.EnterDepBilExten("5555");
		Thread.sleep(1000);
		dealershipPage.EnterDepTechName("AutoTech");
		dealershipPage.EnterDepTechEmailid("auto@tec.com");
		dealershipPage.EnterDepTechPhneNum("3742113446");
		dealershipPage.EnterDepTechExtn("8888");
//		dealershipPage.ClickCreateBtn();
		
		
	}
	
		@AfterMethod
	    public void tearDown(){
			driver.quit();
	}

}
