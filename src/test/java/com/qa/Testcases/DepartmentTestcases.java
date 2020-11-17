package com.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.Dashboard;
import com.qa.pages.Dealership;
import com.qa.pages.Department;
import com.qa.pages.Login;
import com.qa.pages.User;

public class DepartmentTestcases extends TestBase{
	
	Login lginPge;
	Dashboard dshBrd;
	User userPage;
	Dealership dealershipPage ; 
	Department departmentPage;
	
	public DepartmentTestcases(){
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
	}
	
	
	@Test(priority=1)
	public void AddNewDepartment() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		departmentPage.ClickonSettingicon();
		departmentPage.ClickonDepartmentLink();
		departmentPage.AddNewDepartmentBtn();
		Thread.sleep(1000);
		departmentPage.DepartmentName("QaAuto");
		Thread.sleep(1000);
		departmentPage.Dealership_Dropdown();
		Thread.sleep(1000);
		departmentPage.ClickonCreateBtn();
		Thread.sleep(2000);
		
//		Alert message already exists.	
	String actual_error =departmentPage.DepartmentAlreadyExists();
	String expected_error = "Department already exists";
	Assert.assertEquals(actual_error, expected_error);
	System.out.println(actual_error);
	}
	
	@Test(priority=2)
	public void EditDepartment() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		departmentPage.ClickonSettingicon();
		departmentPage.ClickonDepartmentLink();
		departmentPage.ClickonEditIcon();
		departmentPage.EnterEditName("UpdatedDep");
		departmentPage.updATEDealership_Dropdown();
		Thread.sleep(1000);
		departmentPage.UpdateDepartment();
		Thread.sleep(2000);
		
//		EditAlert message already exists.
	String actual_error =departmentPage.EditDepartmentAlreadyExists();
	String expected_error = "Department already exists";
	Assert.assertEquals(actual_error, expected_error);
	System.out.println(actual_error);
	}
	
	@Test(priority=3)
	public void DeleteDepartment() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		departmentPage.ClickonSettingicon();
		departmentPage.ClickonDepartmentLink();
		departmentPage.ClickDepDeleteicon();
		Thread.sleep(1000);
		departmentPage.DepDeleteButton();
	
	}
	
	@AfterMethod
    public void tearDown(){
		driver.quit();
}

	

}
