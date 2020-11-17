package com.qa.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	
	@FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[1]/div/div/div")
	List <WebElement> DepFranchise;
	//*[@id="app"]/div/div/div/div[2]/form/div/div[4]/div[2]/div/div
	
	@FindBy(xpath  = "//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[2]/div/div/div")
	List <WebElement> DepDMS;
	
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
	
	@FindBy(xpath  = "//*[@id='createBtn']")
	WebElement CreateBtn;
//	______________________________________________________________________________________________________________________________
	
//	ALERT MESSAGE
	
	@FindBy(xpath  = "//*[@id='app']/div/div/div/div[2]/form/div/div[1]/div[1]/div/span")
	WebElement NameExist;
	
	@FindBy(xpath  = "//*[@id='app']/div/div/div/div[2]/form/div/div[1]/div[2]/span")
	WebElement EmailExist;
	
	@FindBy(xpath  = "//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[3]/span")
	WebElement CMAExist;
	
	@FindBy(xpath  = "//*[@id='app']/div/div/div/div[2]/form/div/div[3]/div[3]/div/div/span")
	WebElement ZipcodeExist;
	
	@FindBy(xpath  = "//*[@id='app']/div/div/div/div[2]/form/div/div[3]/div[1]/div/span")
	WebElement PhonenumberExist;
//	____________________________________________________________________________________________________________________________
	
//	EDIT DEALERSHIP
	
	@FindBy(xpath  = "//*[@id='app']/div/div[2]/div/div[1]/div[2]/table/tbody/tr[9]/td[10]/div/a/i")
	WebElement EditIcon;
	
	@FindBy(name  = "name")
	WebElement EditDepName;
	
	@FindBy(name  = "emailAddress")
	WebElement EditDepED;
	
	@FindBy(name  = "street")
	WebElement EditDepStrt;
	
	@FindBy(name  = "city")
	WebElement EditDepCty;
	
	@FindBy(name  = "state")
	WebElement EditDepstat;
	
	@FindBy(name  = "phoneNumber")
	WebElement EditDepPN;
	
	@FindBy(name  = "extension")
	WebElement EditDepExtension;
	
	@FindBy(name  = "zipCode")
	WebElement EditDepZipcd;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[1]/div/div/div")
	List <WebElement> EditDepFranchise;

	@FindBy(xpath  = "//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[2]/div/div")
	List <WebElement> EditDepDMS;
	
	@FindBy(name  = "cmaAccount")
	WebElement EditDepCMA;
	
	@FindBy(name  = "billingName")
	WebElement EDitDepBilName;
	
	@FindBy(name  = "billingEmail")
	WebElement EditDepBilEml;
	
	@FindBy(name  = "billingPhone")
	WebElement EditDepBilPhn;
	
	@FindBy(name  = "billingExtension")
	WebElement EditDepBilExtn;
	
	@FindBy(name  = "technologyName")
	WebElement EditDepTechNme;
	
	@FindBy(name  = "technologyEmail")
	WebElement EditDepTechEml;
	
	@FindBy(name  = "technologyPhone")
	WebElement EditDepTechPhn;
	
	@FindBy(name  = "technologyExtension")
	WebElement EditDepTechExtn;
	
	@FindBy(xpath  = "//*[@id='createBtn']")
	WebElement UpdateBtn;
	

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
	
	public void DepFranchiseDropdown() {
    	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[1]/div/div/div"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[1]/div/div/div")));
		for (WebElement DepFranchiseDropdown : DepFranchise)
		    if(DepFranchiseDropdown.getText().contains("BMW"))
		    	DepFranchiseDropdown.click();
	}
	//*[@id="app"]/div/div/div/div[2]/form/div/div[4]/div[2]/div/div/div/div[1]/div[1]
	//*[@id="app"]/div/div/div/div[2]/form/div/div[4]/div[2]/div/div/div
	public void SelectDMS(){
		new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[2]/div/div/div"))).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[2]/div/div/div")));
		for (WebElement DepDMSDropdown : DepDMS)
		    if(DepDMSDropdown.getText().contains("Autosoft"))
		    	DepDMSDropdown.click();
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

//	 DEALERSHIP ALERTS 
	public String NameAlreadyExists(){
		return NameExist.getText();
	}
	
	public String EmailAlreadyExists(){
		return EmailExist.getText();
	}
	
	public String CMAAlreadyExists(){
		return CMAExist.getText();
	}
	
	public String ZipcodeAlreadyExists(){
		return ZipcodeExist.getText();
	}
	
	public String PhonenumerAlreadyExists(){
		return PhonenumberExist.getText();
	}
	
//	_________________________________________________________________________________________________________________________________
	
//	EDIT DEALERSHIP
	
	public void ClickonEditbtn(){
		EditIcon.click();
	}
	
	public void EditName(String DN){
		EditDepName.clear();
		EditDepName.sendKeys(DN);
	}
	
	public void EditEmailID(String ED){
		EditDepED.clear();
		EditDepED.sendKeys(ED);
	}
	
	public void EditStreet(String DS){
		EditDepStrt.clear();
		EditDepStrt.sendKeys(DS);
	}
	
	public void EditCity(String DC){
		EditDepCty.clear();
		EditDepCty.sendKeys(DC);
	}

	public void EditState(String DS){
		EditDepstat.clear();
		EditDepstat.sendKeys(DS);
	}
	public void EditPhoneNUM(String DPN){
		EditDepPN.clear();
		EditDepPN.sendKeys(DPN);
	}
	
	public void EditExtension(String DE){
		EditDepExtension.sendKeys(DE);
	}
	
	public void EditZipCode(String DZC){
		EditDepZipcd.sendKeys(DZC);
	}
	
	public void EditFranchiseDropdown() {
    	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[1]/div/div/div"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[1]/div/div/div")));
		for (WebElement DepFranchiseDropdown : DepFranchise)
		    if(DepFranchiseDropdown.getText().contains("BMW"))
		    	DepFranchiseDropdown.click();
	}
	
	public void EditSelectDMS(){
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[2]/div/div"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[4]/div[2]/div/div")));
		for (WebElement DepDMSDropdown : DepDMS)
		    if(DepDMSDropdown.getText().contains("CDK"))
		    	DepDMSDropdown.click();
		}
	
	public void EditCMAN(String CM){
		EditDepCMA.sendKeys(CM);
	}
	
	public void EditBillName(String BN){
		EDitDepBilName.sendKeys(BN);
	}
	
	public void EditBilEmailid(String BE){
		EditDepBilEml.sendKeys(BE);
	}
	
	public void EditBilPhoneNum(String BP){
		EditDepBilPhn.clear();
		EditDepBilPhn.sendKeys(BP);
	}
	
	public void EditBilExten(String BE){
		EditDepBilExtn.sendKeys(BE);
	}
	
	public void EditTechName(String TN){
		EditDepTechNme.sendKeys(TN);
	}
	
	public void EditTechEmailid(String ED){
		EditDepTechEml.sendKeys(ED);
	}
	
	public void EditTechPhneNum(String PN){
		EditDepTechPhn.sendKeys(PN);
	}
	
	public void EditTechExtn(String TE){
		EditDepTechExtn.sendKeys(TE);
	}
	
	public void ClickUpdateBtn(){
		UpdateBtn.click();
	}
	
}
