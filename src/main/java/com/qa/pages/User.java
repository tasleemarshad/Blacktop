package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class User extends TestBase {
	
	@FindBy(id = "btn-navbar-settings")
	WebElement Setting ;

	@FindBy(id= "btn-navbar-users")
	WebElement ClickUser;
	
	@FindBy(linkText= "New User")
	WebElement NewUser;
	
	@FindBy(name = "firstName")
	WebElement FrName;
	
	@FindBy(name = "lastName")
	WebElement LstName;
	
	@FindBy(name = "password")
	WebElement Usrpasword;
	
	@FindBy(name = "confirmPassword")
	WebElement UsrConfirmPasword;
	
	@FindBy(name = "emailAddress")
	WebElement UsrEmail;
	
	@FindBy(name = "role")
	WebElement UsrRole;
	
	@FindBy(name = "status")
	WebElement UsrStatus;
	
	@FindBy(xpath = "/html/body/div/div/div/div/div[2]/form/div/div[4]/div[3]/div/div/div/div/div[1]/div[1]")
	List <WebElement> usrDealership;
	
	@FindBy(name = "phoneNumber")
	WebElement UsrPhoneNum;

//	@FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/form/div/div[5]/div[3]/div/div/div/div/div[1]/div[1]")
//	List <WebElement>  UsrDepartment;
	
	@FindBy(name = "extension")
	WebElement UsrExtension;
	
	@FindBy(id = "btn-create")
	WebElement createBtn;
//	------------------------------------------------------------------------------------------
//	 Alerts error 

	@FindBy(xpath = "//*[@id='create-user-password-error']")
	 WebElement PasswordAlert;
	
	@FindBy(id = "create-user-confirmPassword-error")
	WebElement ConfirmPasswordAlert;
	
	@FindBy(xpath = "//*[@id='create-user-emailAddress-error']")
	WebElement EmailaAlert;
	
	@FindBy(id = "create-user-phoneNumber-error")
	WebElement PhoneNumAlert;

//  ______________________________________________________________________________________________________________	
	
//	EDIT USER 
	//*[@id="app"]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[19]/td[10]/div/a[2]/i
	@FindBy(id= "action-btn-user-edit-9")
	WebElement EditIcon;
	

	@FindBy(name = "firstName")
	WebElement EditFrName;
	
	@FindBy(name = "lastName")
	WebElement EditLTName;
	
	@FindBy(name = "emailAddress")
	WebElement EditEmailId;
	
	@FindBy(name = "role")
	WebElement EditRole;
	
	@FindBy(name = "status")
	WebElement EditStatus;
	
	@FindBy(name = "phoneNumber")
	WebElement EditPHNumber;
	
	@FindBy(name = "extension")
	WebElement EditExtension;
	
	@FindBy(id = "btn-update-user-submit")
	WebElement EditUpdateBtn;
	
	@FindBy(id = "btn-update-user-cancel")
	WebElement EditCancelBtn;
	
//	____________________________________________________________________________________________________________________
	
//	DELETE USER 
	//*[@id="app"]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[21]/td[10]/div/a[2]
	@FindBy(id = "action-btn-user-delete-9")
	WebElement Deleteicon;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/div[2]/button[2]")
	WebElement DeleteBtn;
	
	@FindBy(id = "dialog-btn-cancel")
	WebElement DeleteCancelBtn;
	
//	___________________________________________________________________________________________________________
	//Initializing the Page Objects:
	public User(){
		PageFactory.initElements(driver, this);
	}

//  ___________________________________________________________________________________________________________
	
	public void ClickonSetting(){
		Setting.click();
	}
	
	public void SelectUserMenu(){
		ClickUser.click();
	}
	
	public void ClickonNewUserBtn(){
		NewUser.click();
	}
	
	public void EnterFirstName(String fn){
		FrName.sendKeys(fn);
	}
	
	public void EnterLastName(String LsN){
		LstName.sendKeys(LsN);
	}
	
	public void EnterPassword(String PS ){
		Usrpasword.sendKeys(PS);
	}
	
	public void EnterConfirmPassword(String CP){
		UsrConfirmPasword.sendKeys(CP);
	}
	
	public void EnterEmail(String EI){
		UsrEmail.sendKeys(EI);
	}
	
	public void SelectRole(){
		Select Rolee =new Select(UsrRole);
		Rolee.selectByVisibleText("Admin");
	}
	
	public void SelectStatus(){
		Select Rolee =new Select(UsrStatus);
		Rolee.selectByVisibleText("Active");
	}
	
	public void dealership_dropdown(){
	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div/div[2]/form/div/div[4]/div[3]/div/div/div/div/div[1]/div[1]"))).click();
	new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div/div/div/div/div[2]/form/div/div[4]/div[3]/div/div/div/div/div[1]/div[1]")));
		for (WebElement dealership_dropdown : usrDealership)
		    if(dealership_dropdown.getText().contains("Martin Chevrolet Buick GMC"))
		    	dealership_dropdown.click();
	}
	
	public void EnterPhone(String PN){
		UsrPhoneNum.sendKeys(PN);
	}
	
	public void EnterExtension(String Ex){
		UsrExtension.sendKeys(Ex);
	}
	
	public void dep_Dropdown(){                                                            
	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[5]/div[3]/div/div/div/div/div[1]/div[1]"))).click();
	List <WebElement>  UsrDepartment = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='app']/div/div/div/div[2]/form/div/div[5]/div[3]/div/div/div/div")));
	for (WebElement dep_Dropdown : UsrDepartment)
	    if(dep_Dropdown.getText().contains("Service"))
	    	dep_Dropdown.click();
}
	
	public void ClickCreateBtn(){
	createBtn.submit();
	}
	
//	-------------------------------------------------------------------------------------
//	ALERTS ON ADD CASE
	
	public String VerifyEmailAlreadyExist(){
		return EmailaAlert.getText();
		}
	
	public String VerifyPasswordAlready(){
		return PasswordAlert.getText();
		}

	public String VerifyConfirmPassword(){
		return ConfirmPasswordAlert.getText();
		}

	public String VerifyPhoneNoAlert(){
		return PhoneNumAlert.getText();
		}
	
//	___________________________________________________________________________________________________
	
//	EDIT USER
	
	public void ClickEditIcon(){
		EditIcon.click();
	}
	
	public void EditFrName(String FN){
		EditFrName.clear();
		EditFrName.sendKeys(FN);
	}
	
	public void EditLastName(String FN){
		EditLTName.clear();
		EditLTName.sendKeys(FN);
	}
	
	public void EditEmailAddres(String EI){
		EditEmailId.clear();
		EditEmailId.sendKeys(EI);
	}
	
	public void EditStatus(){
		EditStatus.sendKeys();
	}
	
	public void EditPhoneNumber(String EPN){
		EditPHNumber.clear();
		EditPHNumber.sendKeys(EPN);
	}
	
	
	public void EditExtension(String EE){
		EditExtension.clear();
		EditExtension.sendKeys(EE);
	}
	
	public void EditUpdatebutton(){
		EditUpdateBtn.click();
	}
	
	public void EditCancelbutton(){
		EditCancelBtn.sendKeys();
	}
	
//	______________________________________________________________________________________________________________________________
	
//	DELETE USER 
	
	public void ClickDeleteIcon(){
		Deleteicon.click();
	}
	
	public void ClickDeleteBtn(){
	DeleteBtn.click();
	}
	
	public void ClickCancelBtn(){
		DeleteCancelBtn.click();
	}
	
//	___________________________________________________________________________________________
	
	@FindBy(id = "create-user-firstName-error")
	WebElement firstalert;
	
	@FindBy(id = "create-user-lastName-error")
	WebElement lastalert;
	
	@FindBy(id = "create-user-password-error")
	WebElement paswordalert;
	
	@FindBy(id = "create-user-confirmPassword-error")
	WebElement confirmpaswordalert;
	
	@FindBy(id = "create-user-emailAddress-error")
	WebElement emailalert;
	
	@FindBy(id = "create-user-role-error")
	WebElement rolealert;
	
	@FindBy(id = "create-user-status-error")
	WebElement statusalert;
	
	@FindBy(id = "create-user-dealershipId-error")
	WebElement dealershipalert;
	
	@FindBy(id = "create-user-phoneNumber-error")
	WebElement phonealert;
	
     public List<String> ValidateEmptyFields()
{
    	 createBtn.click();

	List<String> issuesList = new ArrayList<String>();

	int timeInSeconds = 5 * 1000;
	try {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(firstalert, "Firs is required"));
	}
	catch (Exception e)
	{
		issuesList.add("First Name Error is not displayed");
		System.out.println(e.getMessage());
	}
	try {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(lastalert, "Last name is required"));
	}
	catch (Exception e)
	{
		issuesList.add("Last Name Error is not displayed");
		System.out.println(e.getMessage());
	}
	try {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(paswordalert, "Password is required"));
	}
	catch (Exception e)
	{
		issuesList.add("passworad Error is not displayed");
		System.out.println(e.getMessage());
	}
	try {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(confirmpaswordalert, "Confirm password is required"));
	}
	catch (Exception e)
	{
		issuesList.add("Confirmpassworad Error is not displayed");
		System.out.println(e.getMessage());
	}
	try {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(emailalert, "Email address is required"));
	}
	catch (Exception e)
	{
		issuesList.add("Emailaddress Error is not displayed");
		System.out.println(e.getMessage());
	}
	try {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(rolealert, "Role is required"));
	}
	catch (Exception e)
	{
		issuesList.add("Role Error is not displayed");
		System.out.println(e.getMessage());
	}
	try {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(rolealert, "Status is required"));
	}
	catch (Exception e)
	{
		issuesList.add("Status Error is not displayed");
		System.out.println(e.getMessage());
	}
	try {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(dealershipalert, "Select a dealership"));
	}
	catch (Exception e)
	{
		issuesList.add("Dealership Error is not displayed");
		System.out.println(e.getMessage());
	}
	try {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(phonealert, "Phone number is required"));
	}
	catch (Exception e)
	{
		issuesList.add("Phone Error is not displayed");
		System.out.println(e.getMessage());
	}
	
	return issuesList;
	
}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}