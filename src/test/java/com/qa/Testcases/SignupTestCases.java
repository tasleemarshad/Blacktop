package com.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import com.qa.base.TestBase;
import com.qa.pages.Signup;

public class SignupTestCases<expected_error> extends TestBase {
	
	Signup signupPage;
	
	
	public SignupTestCases(){
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
	public void VerfiySignupForm() throws Exception{
		signupPage.ClicktheSignupLink();
		signupPage.EnterfirstName("blacktop");
		signupPage.EnterLastName("user");
		signupPage.EnterEmail("blacktopuser@gmail.com");
		signupPage.EnterPassword("tesT@1234");
		Thread.sleep(1000);
		signupPage.EnterConfirmPassword("tesT@1234");
		Thread.sleep(1000);
        signupPage.ClickSignupBtn();
        Thread.sleep(2000);
        
//     Verify the Validation in Email
      String actual_error =signupPage.VerifyEmailValidation();
		String expected_error = "Please enter a valid email address";
		Assert.assertEquals(actual_error, expected_error);
		System.out.println(actual_error);
     
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

	