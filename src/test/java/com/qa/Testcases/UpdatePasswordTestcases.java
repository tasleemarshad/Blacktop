package com.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ChangePassword;
import com.qa.pages.Dashboard;
import com.qa.pages.Dealership;
import com.qa.pages.Department;
import com.qa.pages.Login;
import com.qa.pages.UpdateProfile;
import com.qa.pages.User;

public class UpdatePasswordTestcases extends TestBase{
	
	Login lginPge;
	Dashboard dshBrd;
	User userPage;
	Dealership dealershipPage ; 
	Department departmentPage;
	UpdateProfile updateprofilePage;
	ChangePassword updatePasswrdPge;
	
	
	public UpdatePasswordTestcases(){
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
		updatePasswrdPge = new ChangePassword();
	}
	
	@Test(priority=1)
	public void UpdatePassword() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		updatePasswrdPge.ClickonSettingicon();
		updatePasswrdPge.ClickonChangePasswordLink();
		updatePasswrdPge.EnterOldPassword("Dekka123@");
		updatePasswrdPge.EnterNewPassword("Abcd1234@");
		updatePasswrdPge.EnterConfirmPassword("Abcd1234@");
		Thread.sleep(1000);
		updatePasswrdPge.ClickUpdateBtn();
		
//		Current password doesn't match
		
		String actual_error =updatePasswrdPge.AlertCurrentPasswordnotmATCH();
		String expected_error = "Current password doesn't match";
		Assert.assertEquals(actual_error, expected_error);
		System.out.println(actual_error);

	}
	
}
