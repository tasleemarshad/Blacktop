package com.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.testng.Assert;
import com.qa.base.TestBase;
import com.qa.pages.Signup;

public class SignupTestcases extends TestBase {
	
	Signup signupPage;
	
	
	public SignupTestcases(){
		super();
	}
	 
	
	@BeforeMethod
	public void setUp(){
		initialization();
		signupPage = new Signup();	
	}
	

	@Test(priority=1)
	public void verfiyTheCompanyLogoAndAlertMessage() throws Exception{
		signupPage.ClicktheSignupLink();
		Thread.sleep(1000);
		String logo = driver.getTitle(); 
		System.out.println("CompanyLogo :" +logo );
		Assert.assertEquals( logo, logo);
			} 
	
	
	@Test(priority=2)
	public void Test_ValidateAllErrorsSignupForm() throws Exception
	{
		signupPage.GotoRegistrationPage();
		List<String> ErrorsList = signupPage.ValidateEmptyFields();
		for (String str:ErrorsList)
			System.out.println(str);
		Assert.assertEquals(true,ErrorsList.isEmpty(), "Above Errors did not displayed on Signup Pages");
	}
	
	
	@Test(priority=3)
	public void VerfiySignupForm() throws Exception{
		signupPage.ClicktheSignupLink();
		signupPage.EnterfirstName("blacktop");
		signupPage.EnterLastName("user");
		signupPage.EnterEmail("blacktopuser@gmail.com");
		signupPage.EnterPassword("tesT4");
		Thread.sleep(1000);
		signupPage.EnterConfirmPassword("tesT@1234");
		Thread.sleep(1000);
        signupPage.ClickSignupBtn();
        Thread.sleep(2000);
     
	//   Verify the Password validation
		String actual_errorPV =	signupPage.VerifyConfirmPasswordValidation();
		String expected_errorPV ="Password should contain at least 8 characters";
		Assert.assertEquals(actual_errorPV, expected_errorPV);
		System.out.println(actual_errorPV);
				
	//   Verify the ConfirmPassword Validation
		String actual_errorCPV=	signupPage.VerifyConfirmPasswordValidation();
		String expected_errorCPV="Confirm password does not match";
		Assert.assertEquals(actual_errorCPV,expected_errorCPV);
		System.out.println(actual_errorCPV);
		
	//   Verify the EmailAlreadtExistValidation
		String actual_errorEEV=	signupPage.VerifyEmailAlreadyExist();
		String expected_errorEEV="User already exist";
		Assert.assertEquals(actual_errorEEV,expected_errorEEV);
		System.out.println(actual_errorEEV);         
	}
	
		

		@AfterMethod
	    public void tearDown(){
			driver.quit();
	}
		

		
}

	
