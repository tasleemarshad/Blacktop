package com.qa.Testcases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.qa.base.TestBase;
import com.qa.pages.Dashboard;
import com.qa.pages.Login;

import com.qa.pages.User;

public class UserTestCase extends TestBase {

	Login lginPge;
	Dashboard dshBrd;
	User userPage;
	
	public UserTestCase(){
		super();
	}
	 
	@BeforeMethod
	public void setUp(){
		initialization();
		lginPge = new Login();
		dshBrd = new Dashboard();
		userPage = new User();
	}
	
	@Test(priority=1)
	public void EmptyfieldValidation() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		userPage.ClickonSetting();
		userPage.SelectUserMenu();
		userPage.ClickonNewUserBtn();
		userPage.ClickCreateBtn();
		List<String> ErrorsList = userPage.ValidateEmptyFields();
		for (String str:ErrorsList)
			System.out.println(str);
		Assert.assertEquals(true,ErrorsList.isEmpty(), "Above Errors did not displayed on User Pages");
	}
	

	@Test(priority=2)
	public void AddNewUser() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		userPage.ClickonSetting();
		userPage.SelectUserMenu();
		Thread.sleep(1000);
		userPage.ClickonNewUserBtn();
		userPage.EnterFirstName("first");
		userPage.EnterLastName("last");
		userPage.EnterPassword("Abcd1234@");
		userPage.EnterConfirmPassword("Abcd1234@");
		userPage.EnterEmail("abcd@gmail.com");
		userPage.SelectRole();
		userPage.SelectStatus();
	    userPage.dealership_dropdown();
		userPage.EnterPhone("9696788585");
		userPage.EnterExtension("2343");
		userPage.dep_Dropdown();
		userPage.ClickCreateBtn();
		Thread.sleep(2000);
	
//	  Verify the validation in Password is lessthen 8 character 
//		WebDriverWait wait = new WebDriverWait(driver, 10);// 1 minute 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("create-user-password-error")));
    	String actual_errorPA = userPage.VerifyPasswordAlready();
		String expected_errorPA = "Password should contain at least 8 characters";
		Assert.assertEquals(actual_errorPA, expected_errorPA);
		System.out.println(actual_errorPA);	
		
//	Assert.assertTrue(User.VerifyPasswordAlready().contains("Password should contain at least 8 characters"));
		
//	 Verify the validation in Password and ConfirmPassword is different
		String actual_errorCP = userPage.VerifyConfirmPassword();
		String expected_errorCP = "Confirm password does not match";
		Assert.assertEquals(actual_errorCP, expected_errorCP);
		System.out.println(actual_errorCP);	
		
//	 Verify the validation in email already exist
			String actual_error = userPage.VerifyEmailAlreadyExist();
			String expected_error = "Email address already exists";
			Assert.assertEquals(actual_error, expected_error);
			System.out.println(actual_error);
		
//	 verify the validation in Phone Number field
		String actual_errorPN = userPage.VerifyPhoneNoAlert();
		String expected_errorPN = "Phone number already exists";
		Assert.assertEquals(actual_errorPN, expected_errorPN);
		System.out.println(actual_errorPN);	
		}
	
	@Test(priority=3)
	public void UserEditUser() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		userPage.ClickonSetting();
		userPage.SelectUserMenu();
		Thread.sleep(1000);
		userPage.ClickEditIcon();
		userPage.EditFrName("first");
		userPage.EditLastName("last");
		Thread.sleep(1000);
		userPage.EditEmailAddres("edituser@gmail.com");
		userPage.EditPhoneNumber("5854334861");
		Thread.sleep(1000);
		userPage.EditExtension("67886");
		Thread.sleep(1000);
		userPage.EditUpdatebutton();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void DeleteUser() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		userPage.ClickonSetting();
		userPage.SelectUserMenu();
		Thread.sleep(1000);
		userPage.ClickDeleteIcon();
		Thread.sleep(1000);
     	userPage.ClickDeleteBtn();
     	userPage.ClickCancelBtn();
		Thread.sleep(1000);
	}
	

	@AfterMethod
    public void tearDown(){
		driver.quit();
}


	
	
	
	
	
	
	
	
	
	
	
	
}
