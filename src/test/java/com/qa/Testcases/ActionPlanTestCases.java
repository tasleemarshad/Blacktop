package com.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.Dashboard;
import com.qa.pages.Login;
import com.qa.pages.NewActionPlan;


public class ActionPlanTestCases extends TestBase{
	
	Login lginPge;
	Dashboard dshBrd;
	NewActionPlan actionplan ;
	
	public ActionPlanTestCases(){
		super();
		}
	 

	@BeforeMethod
	public void setUp(){
		initialization();
		lginPge = new Login();
		dshBrd = new Dashboard();
		actionplan = new NewActionPlan();
	}
	
	
	@Test(priority=1)
	public void AddNewActionPlan() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		actionplan.ClickActionPlan();
		actionplan.ClickNewActionPlan();
		Thread.sleep(1000);
		actionplan.EnterName("Test");
		actionplan.Metric_Dropdown("LIFO Reserve");
		Thread.sleep(1000);
		actionplan.Dep_Dropdown();
		Thread.sleep(1000);
		actionplan.EnterDueDate("12-01-2020");
		actionplan.EnterBaseline("4");
		actionplan.GoalType_Dropdown();
		actionplan.EnterCustomgoal("3");
		Thread.sleep(1000);
		actionplan.EnterCreateBtn();
		Thread.sleep(2000);
		
//		Verify the Metric_Dropdown
		String actual_errorMD =	actionplan.ValidationMetric();
		String expected_errorMD ="Select a metric";
		Assert.assertEquals(actual_errorMD, expected_errorMD);
		System.out.println(actual_errorMD);

//	Verify the Department_Dropdown
	String actual_errorDD =	actionplan.ValidationDepartment();
	String expected_errorDD ="Please select a Department";
	Assert.assertEquals(actual_errorDD, expected_errorDD);
	System.out.println(actual_errorDD);
	
//	Verify the GoalType_Dropdown
	String actual_errorGT =	actionplan.ValidationGoalType();
	String expected_errorGT ="Select a goal type";
	Assert.assertEquals(actual_errorGT, expected_errorGT);
	System.out.println(actual_errorGT);
}
	
//	@Test(priority=2)
//	public void EditActionPlan() throws Exception{
//		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
//		Thread.sleep(1000);
//		actionplan.ClickActionPlan();
//		actionplan.ClickNewActionPlan();
//		actionplan.EnterName("Test");
//		actionplan.Metric_Dropdown();
//		actionplan.Dep_Dropdown();
//		actionplan.EnterDueDate("12-01-2020");
//		actionplan.EnterBaseline("4");
//		actionplan.GoalType_Dropdown();
//		actionplan.EnterCustomgoal("3");
//		actionplan.EnterCreateBtn();
//	}
	
//	@Test(priority=3)
//	public void DeleteActionPlan() throws Exception{
//		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
//		Thread.sleep(1000);
//		actionplan.ClickActionPlan();
//	}
	
	@AfterMethod
    public void tearDown(){
		driver.quit();
}


}
