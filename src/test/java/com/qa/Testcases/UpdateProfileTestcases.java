package com.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Dashboard;
import com.qa.pages.Dealership;
import com.qa.pages.Department;
import com.qa.pages.Login;
import com.qa.pages.UpdateProfile;
import com.qa.pages.User;

public class UpdateProfileTestcases extends TestBase{
	
	Login lginPge;
	Dashboard dshBrd;
	User userPage;
	Dealership dealershipPage ; 
	Department departmentPage;
	UpdateProfile updateprofilePage;
	
	public UpdateProfileTestcases(){
		super();
		}
	 

	@BeforeMethod
	public void setUp(){
		initialization();
		lginPge = new Login();
		dshBrd = new Dashboard();
		userPage = new User();
		dealershipPage = new Dealership();
		departmentPage = new Department ();
		updateprofilePage = new UpdateProfile();
	}
	
	@Test(priority=1)
	public void AddNewDepartment() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		updateprofilePage.ClickonSettingicon();
		updateprofilePage.ClickonUpdateProfileLink();
		Thread.sleep(1000);
		updateprofilePage.updateFirstname("test");
		updateprofilePage.updateLastname("last");
		updateprofilePage.updateEmailAdress("");
		updateprofilePage.ClickUpdatebutn();
		Thread.sleep(1000);
		
//		Verify the Validation in update Profile 
		
	      String actual_error =updateprofilePage.VerifyProfileUpdated();
			String expected_error = "Profile updated successfuly";
			Assert.assertEquals(actual_error, expected_error,"profile alert is not pick");
			System.out.println(actual_error);
		
		
	}
	

}
