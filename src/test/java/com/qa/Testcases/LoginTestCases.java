package com.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Dashboard;
import com.qa.pages.Login;
import com.qa.pages.Signup;



@Test
public class LoginTestCases extends TestBase {
	
	Signup signupPage;
	Login lginPge;
	Dashboard dshBrd;
	
	public LoginTestCases(){
		super();
	}
	 
	@BeforeMethod
	public void setUp(){
		initialization();
		signupPage = new Signup();
		lginPge = new Login();	
		
	}
	
	@Test(priority=1)
	public void VerifyLoginSuccessfull() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);

	}
	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
}

}
