package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class Dealership extends TestBase{
	
	@FindBy(id = "btn-navbar-settings")
	WebElement Setting ;
	
	@FindBy(id = "btn-navbar-dealerships")
	WebElement DealershipLink;
	
	@FindBy(xpath  = "//*[@id='app']/div/div[2]/div/div[1]/div[1]/div/div/a")
	WebElement NewDealershipBtn;
	
	@FindBy(name  = "name")
	WebElement DepName;
	
	@FindBy(name  = "emailAddress")
	WebElement DepED;
	
	@FindBy(name  = "street")
	WebElement DepStrt;
	
	@FindBy(name  = "city")
	WebElement DepCty;
	
	@FindBy(name  = "state")
	WebElement Depstat;
	
	@FindBy(name  = "phoneNumber")
	WebElement DepPN;
	
	@FindBy(name  = "extension")
	WebElement DepExtension;
	
	@FindBy(name  = "zipCode")
	WebElement DepZipcd;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[1]/div/div/div/div[1]/div[1]")
	List <WebElement> DepFranchise;
//	WebElement DepFranchise;

	@FindBy(xpath  = "//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[2]/div/div/div/div[1]")
	WebElement DepDMS;
	
	@FindBy(name  = "cmaAccount")
	WebElement DepCMA;
	
	@FindBy(name  = "billingName")
	WebElement DepBilName;
	
	@FindBy(name  = "billingEmail")
	WebElement DepBilEml;
	
	@FindBy(name  = "billingPhone")
	WebElement DepBilPhn;
	
	@FindBy(name  = "billingExtension")
	WebElement DepBilExtn;
	
	@FindBy(name  = "technologyName")
	WebElement DepTechNme;
	
	@FindBy(name  = "technologyEmail")
	WebElement DepTechEml;
	
	@FindBy(name  = "technologyPhone")
	WebElement DepTechPhn;
	
	@FindBy(name  = "technologyExtension")
	WebElement DepTechExtn;
	
	@FindBy(id  = "createBtn")
	WebElement CreateBtn;
	
//	____________________________________________________________________________________________________________________________
	

	//Initializing the Page Objects:
	public Dealership(){
		PageFactory.initElements(driver, this);
	}

//  ______________________________________________________________________________________________________________________________
	
	public void ClickonSettingicon(){
		Setting.click();
	}
	
	public void ClickonDepartmentLink(){
		DealershipLink.click();
	}

	public void ClickonDepartmentBtn(){
		NewDealershipBtn.click();
	}
	
	public void DepName(String DN){
		DepName.sendKeys(DN);
	}
	
	public void DepEmailID(String ED){
		DepED.sendKeys(ED);
	}
	
	public void DepStreet(String DS){
		DepStrt.sendKeys(DS);
	}
	
	public void DepCity(String DC){
		DepCty.sendKeys(DC);
	}

	public void DepState(String DS){
		Depstat.sendKeys(DS);
	}
	public void DepPhoneNUM(String DPN){
		DepPN.sendKeys(DPN);
	}
	
	public void DepExtension(String DE){
		DepExtension.sendKeys(DE);
	}
	
	public void DepZipCode(String DZC){
		DepZipcd.sendKeys(DZC);
	}
	
	public void DepFranchiseDropdown(String DD) {
    	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[1]/div/div/div/div[1]/div[1]"))).click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[1]/div/div/div/div[1]/div[1")));
		for (WebElement DepFranchiseDropdown : DepFranchise)
		    if(DepFranchiseDropdown.getText().contains("BMW"))
		    	DepFranchiseDropdown.click();
//		DepFranchise.click();
//		DepFranchise.sendKeys(DD);
	}
	
	public void SelectDMS(){
		Select Fran =new Select(DepDMS);
		Fran.selectByVisibleText("Autosoft");
		}
	
	public void DepCMAN(String CM){
		DepCMA.sendKeys(CM);
	}
	
	public void EnterDepBillName(String BN){
		DepBilName.sendKeys(BN);
	}
	
	public void EnterDepBilEmailid(String BE){
		DepBilEml.sendKeys(BE);
	}
	
	public void EnterDepBilPhoneNum(String BP){
		DepBilPhn.sendKeys(BP);
	}
	
	public void EnterDepBilExten(String BE){
		DepBilExtn.sendKeys(BE);
	}
	
	public void EnterDepTechName(String TN){
		DepTechNme.sendKeys(TN);
	}
	
	public void EnterDepTechEmailid(String ED){
		DepTechEml.sendKeys(ED);
	}
	
	public void EnterDepTechPhneNum(String PN){
		DepTechPhn.sendKeys(PN);
	}
	
	public void EnterDepTechExtn(String TE){
		DepTechExtn.sendKeys(TE);
	}
	
	public void ClickCreateBtn(){
		CreateBtn.click();
	}
	
//	_________________________________________________________________________________________________________________________

	
	
	
}
