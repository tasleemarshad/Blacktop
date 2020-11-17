package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class Department extends TestBase{

	@FindBy(id = "btn-navbar-settings")
	WebElement Setting ;
	
	@FindBy(id = "btn-navbar-departments")
	WebElement DepartmentLink;
	
	@FindBy(name = "name")
	WebElement DepName;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div/div[1]/div[1]/div/div/a")
	WebElement AddNewDep;

	@FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/div/div/form/div/div[2]/div/div/div[1]/div[1]")
	List <WebElement> Dealershipdp;
	
	@FindBy(id = "btn-create-department-create")
	WebElement CreateBtn;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/div/div/form/div/div[3]/a")
	WebElement CancelBtn;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/div/div/form/div/div[1]/span")
	WebElement DepExist;
	
//	________________________________________________________________________________________________________________________________
	
//	EDIT DEPARTMENT 

	@FindBy(id = "action-btn-department-edit-47")
	WebElement Editicon;
	
	@FindBy(name ="name")
	WebElement EditName;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/div/div/form/div/div[2]/div/div/div[1]")
	List <WebElement> EditDep;
	
	@FindBy(id = "btn-update-department-submit")
	WebElement UpdateBtn;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/div/div/form/div/div[3]/a")
	WebElement EditCancelBtn;

	@FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/div/div/form/div/div[1]/span")
	WebElement EditDepExist;
	
//	________________________________________________________________________________________________________

//	DELETE DEPARTMENT 
	
	@FindBy(id = "action-btn-department-delete-46")
	WebElement DeleteIcon;
	
	@FindBy(id = "dialog-btn-departmart-delete")
	WebElement DepDeleteBtn;

	@FindBy(id = "dialog-btn-departmart-cancel")
	WebElement DepCancelBtn;
//	____________________________________________________________________________________________________________________________
	

	//Initializing the Page Objects:
	public Department(){
		PageFactory.initElements(driver, this);
	}

//  ______________________________________________________________________________________________________________________________
	
//	 ADD NEW DEPARTMENT
	public void ClickonSettingicon(){
		Setting.click();
	}
	
	public void ClickonDepartmentLink(){
		DepartmentLink.click();
	}
	
	public void AddNewDepartmentBtn(){
		AddNewDep.click();
	}
	
	public void DepartmentName(String Name){
		DepName.sendKeys(Name);
	}
	
	public void Dealership_Dropdown(){
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/div/div/div[2]/div/div/form/div/div[2]/div/div/div[1]/div[1]"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='app']/div/div/div/div[2]/div/div/form/div/div[2]/div/div/div[1]/div[1]")));
				for (WebElement dealership_dropdown : Dealershipdp)
				    if(dealership_dropdown.getText().contains("Martin Chevrolet Buick GMC"))
				    	dealership_dropdown.click();
			}
	
	public void ClickonCreateBtn(){
		CreateBtn.click();
	}
	
	public void ClickonCancelBtn(){
		CancelBtn.click();
	}
	

	public String DepartmentAlreadyExists(){
		return DepExist.getText();
	}
//  ______________________________________________________________________________________________________________________________
	
//	EDIT DEPARTMENT
	
	public void ClickonEditIcon(){
		Editicon.click();
	}
	
	public void EnterEditName(String EN){
		EditName.clear();
		EditName.sendKeys(EN);
	}
	
	
	public void updATEDealership_Dropdown(){
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/div/div/div[2]/div/div/form/div/div[2]/div/div/div[1]"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='app']/div/div/div/div[2]/div/div/form/div/div[2]/div/div/div[1]")));
			for (WebElement dealership_dropdown : EditDep)
			    if(dealership_dropdown.getText().contains("Blacktop"))
			    	dealership_dropdown.click();
		}
	
	public void UpdateDepartment(){
		UpdateBtn.click();
	}
	
	
	public String EditDepartmentAlreadyExists(){
		return EditDepExist.getText();
	}
	
	public void ClickDepDeleteicon(){
		DeleteIcon.click();
	}
	
	public void DepDeleteButton(){
		DepDeleteBtn.click();
	}
	
	public void DepCancelButton(){
		DepCancelBtn.click();
	}
	
}
