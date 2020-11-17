package com.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
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
		dealershipPage.DepName("Automatic");
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
        dealershipPage.DepFranchiseDropdown();
        Thread.sleep(1000);
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
		dealershipPage.ClickCreateBtn();
		Thread.sleep(2000);
	
//		Dealership Name already Exists 
		String actual_error =dealershipPage.NameAlreadyExists();
		String expected_error = "The name already exists.";
		Assert.assertEquals(actual_error, expected_error);
		System.out.println(actual_error);
		
//		Dealership Email already Exists 
		String actual_errorEA =dealershipPage.EmailAlreadyExists();
		String expected_errorEA = "The email address already exists.";
		Assert.assertEquals(actual_errorEA, expected_errorEA);
		System.out.println(actual_errorEA);
		
//		Dealership CMA already Exists 
		String actual_errorCM =dealershipPage.CMAAlreadyExists();
		String expected_errorCM= "The CMA already exists";
		Assert.assertEquals(actual_errorCM, expected_errorCM);
		System.out.println(actual_errorCM);
		
//		Dealership Phonenumber  already Exists 
		String actual_errorPH =dealershipPage.CMAAlreadyExists();
		String expected_errorPH= "The CMA already exists";
		Assert.assertEquals(actual_errorPH, expected_errorPH);
		System.out.println(actual_errorPH);
		
		}
	
	@Test(priority=2)
	public void EditDealership() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		dealershipPage.ClickonSettingicon();
		dealershipPage.ClickonDepartmentLink();
		dealershipPage.ClickonEditbtn();
		dealershipPage.EditName("Abcd");
		dealershipPage.EditEmailID("Abcd@yahoo.com");
		dealershipPage.EditStreet("aaa");
		dealershipPage.EditCity("ttt");
		dealershipPage.EditState("yyyy");
		dealershipPage.EditBilPhoneNum("9876543212");
		dealershipPage.EditExtension("3433");
		dealershipPage.EditZipCode("34343");
		dealershipPage.EditFranchiseDropdown();
		dealershipPage.EditSelectDMS();
		dealershipPage.DepCMAN("3");
		dealershipPage.EditBillName("3");
		dealershipPage.EditBilEmailid("");
		dealershipPage.EditBilPhoneNum("");
		dealershipPage.EditBilExten("");
		dealershipPage.EditTechName("");
		dealershipPage.EditTechEmailid("");
		dealershipPage.EditTechPhneNum("");
		dealershipPage.EditTechExtn("");
		dealershipPage.ClickUpdateBtn();
		Thread.sleep(2000);
	}
	
	

		@AfterMethod
	    public void tearDown(){
			driver.quit();
	}

	}
