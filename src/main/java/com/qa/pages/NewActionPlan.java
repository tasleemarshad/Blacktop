package com.qa.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class NewActionPlan extends TestBase {
//	Page Factory
	
	@FindBy(xpath="//*[@id=\'myToggleNav\']/ul[1]/li[3]/a")
	WebElement ActionPlan;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[1]/div[1]/div/a")
	WebElement NewActionPlan;
	
	@FindBy(name="name")
	WebElement Name;
	
	@FindBy(id="actionplan-metricName")
//   List< WebElement> Metric;
	WebElement Metric;
	
//	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div/div/div[1]/div[1]")	
//	List <WebElement> Department;
	
	@FindBy(id ="actionplan-departments") 
//	WebElement DeparAction;
	List<WebElement> DepAction;
	
	@FindBy(name="dueDate")
	WebElement DueDate;

	@FindBy(name="baseline")
	WebElement Baseline;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/div/div/div[1]/div[1]")
	List <WebElement> GoalType;
	
	@FindBy(name="customGoal")
	WebElement CustomGoal;
	
	@FindBy(id="createBtn")
	WebElement CreateButton;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[4]/a")
	WebElement CancelButton;
	
//	______________________________________________________________________________________________
	
	@FindBy(id="new-actionplan-metricName-error")
	WebElement Metricalert ;
	
	@FindBy(id="new-actionplan-departments-error")
	WebElement Departmentalert ;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/span")
	WebElement GoalTypealert ;
	
//	__________________________________________________________________________________________________
//	EDIT ACTION PLAN
	
	@FindBy(name="name")
	WebElement EditName;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[1]/div[2]/div/div/div/div/div[1]")
	List <WebElement>  EdiMetric;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div/div/div[1]/div[1]")
	List <WebElement> EditDepartment;
	
	@FindBy(name="dueDate")
	WebElement EditDueDate;

	@FindBy(name="baseline")
	WebElement EditBaseline;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/div/div/div[1]/div[1]")
	List <WebElement> EditGoalType;
	
	@FindBy(name="customGoal")
	WebElement EditCustomGoal;
	
	@FindBy(id="createBtn")
	WebElement EditCreateButton;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[4]/a")
	WebElement EditCancelButton;
//	___________________________________________________________________________________________________
	
	
	//Initializing the Page Objects:
	public NewActionPlan(){
		PageFactory.initElements(driver, this);
	}
	
//	________________________________________________________________________________________________
	
// METHODS
	public void ClickActionPlan(){
		ActionPlan.click();
	}
	
	public void ClickNewActionPlan(){
		NewActionPlan.click();
	}
	
	public void EnterName(String name){
		Name.sendKeys(name);
	}

	public void Metric_Dropdown(String dp){
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"actionplan-metricName\"]/div"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"actionplan-metricName\"]/div/div[1]/div[1]")));
//		for (WebElement metric_dropdown : Metric )
//		    if(metric_dropdown.getText().contains("LIFO Reserve")) 
//	    	metric_dropdown.click();
		  Metric.getText().contains(dp);
		  Metric.click();
		 
	}
	
	public void Dep_Dropdown(){
//		Select Depdp= new Select(Department);
//		Depdp.selectByValue("Fleet");
		
	  new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("actionplan-departments"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"actionplan-departments\"]/div[2]/div/div[3]")));
		for (WebElement dep_dropdown : DepAction )
		    if(dep_dropdown.getText().contains("Used Vehicles"))
	    	dep_dropdown.click();
	}
	
	public void EnterDueDate(String date){
		DueDate.sendKeys(date);
	}
	
	public void EnterBaseline(String bsline){
		Baseline.sendKeys(bsline);
	}
	
	public void GoalType_Dropdown(){
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/div/div"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/div/div")));
			for (WebElement goaltype_dropdown : GoalType )
			    if(goaltype_dropdown.getText().contains("# decrease by"))
			    	goaltype_dropdown.click();
		}
	
	public void EnterCustomgoal(String goal){
		CustomGoal.sendKeys(goal);
	}
	
	public void EnterCreateBtn(){
		CreateButton.click();
	}
	
//	____________________________________________________________________________________________
	
//	ALERTS 
	
	public String ValidationMetric(){
		return Metricalert.getText();
		}
	
	public String ValidationDepartment(){
		return Metricalert.getText();
		}
	
	public String ValidationGoalType(){
		return GoalTypealert.getText();
		}
	
//	________________________________________________________________________________________________
	
	// EDIT METHODS
		
		public void EditnterName(String name){
			Name.sendKeys(name);
		}

//		public void EditMetric_Dropdown(){
//			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[1]/div[2]/div/div/div/div/div[1]"))).click();
//			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[1]/div[2]/div/div/div/div/div[1]")));
//				for (WebElement metric_dropdown : Metric )
//				    if(metric_dropdown.getText().contains("Totals Cost"))
//				    	metric_dropdown.click();
//			}
//		
		public void EditDep_Dropdown(){
//			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div/div/div[1]/div[1]"))).click();
//			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div/div/div[1]/div[1]")));
//				for (WebElement dep_dropdown : Department )
//				    if(dep_dropdown.getText().contains("Parts"))
//				    	dep_dropdown.click();
			}
		
		public void EditEnterDueDate(String date){
			DueDate.sendKeys(date);
		}
		
		public void EditEnterBaseline(String bsline){
			Baseline.sendKeys(bsline);
		}
		
		public void EditGoalType_Dropdown(){
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/div/div"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/div/div")));
				for (WebElement goaltype_dropdown : GoalType )
				    if(goaltype_dropdown.getText().contains("# decrease by"))
				    	goaltype_dropdown.click();
			}
		
		public void EditEnterCustomgoal(String goal){
			CustomGoal.sendKeys(goal);
		}
		
		public void clickUpdateBtn(){
			CreateButton.click();
		}
		
}
