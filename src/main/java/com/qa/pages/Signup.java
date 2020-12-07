package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class Signup extends TestBase{
	
//	Page Factory
	
	@FindBy(linkText ="Register Now")
	WebElement SignupLink;
	
	@FindBy(xpath="//*[@id='app']/div/div/div[2]/div/div[1]/a/img")
	WebElement CompanyLogo ;
	
	@FindBy(name="firstName")
	WebElement Firstname;
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(name="emailAddress")
	WebElement EmailId;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement ConfirmPassword;

	@FindBy(id ="btn-create-account")
	WebElement SignupClick;
	
//	-----------------------------------------------------------------------------------------------

	//	 ALERTS VALIDATION 
	//*[@id="app"]/div/div/div/div[2]/form/div[2]/div/div/span
	@FindBy(xpath="//*[@id='app']/div/div/div/div[2]/form/div[2]/div/div/span")
	WebElement EmailValidation;
	
	@FindBy(xpath="//*[@id='app']/div/div/div/div[2]/form/div[3]/div[1]/div/span")
	WebElement PasswordValidation;
	
	@FindBy(xpath="//*[@id='app']/div/div/div/div[2]/form/div[3]/div[2]/div/span")
	WebElement ConfirmPasswordValidation;
	//*[@id="app"]/div/div/div/div[2]/form/div[2]/div/div/div
	@FindBy(xpath="//*[@id='app']/div/div/div/div[2]/form/div[2]/div/div/div")
	WebElement EmailExistValidation;
	
//      -------------------------------------------------------------------------------------------------
	
	//Initializing the Page Objects:
	public Signup(){
		PageFactory.initElements(driver, this);
	}

	
	public void ClicktheSignupLink(){
		SignupLink.click();
	}
	
	public void VerifyCompanyLogo(){
		CompanyLogo.click();
	}
	
	public void EnterfirstName(String frname){
		Firstname.sendKeys(frname);
	}
	
	public void EnterLastName(String lstname){
		lastName.sendKeys(lstname);
	}
	
	public void EnterEmail(String email){
		EmailId.sendKeys(email);
	}

	public void EnterPassword(String pswrd){
		password.sendKeys(pswrd);
	}
	
	public void EnterConfirmPassword(String cnfmpswrd){
		ConfirmPassword.sendKeys(cnfmpswrd);
	}
	
	public Login ClickSignupBtn(){
		SignupClick.click();
		return new Login();
	}

//	--------------------------------------------------------------------------------------------------
	
	public String VerifyEmailValidation(){
		return EmailValidation.getText();
		}
	
	public String VerifyPasswordValidation(){
		return PasswordValidation.getText();
		}
	
	public String VerifyConfirmPasswordValidation(){
		return ConfirmPasswordValidation.getText();
		}
	
	public String VerifyEmailAlreadyExist(){
		return EmailExistValidation.getText();
		}
	
//	____________________________________________________________________________________________________________________

	public void GotoRegistrationPage() throws Exception{
		driver.findElement(By.id("btn-register")).click();
		Thread.sleep(1000);
	}
	
	public List<String> ValidateEmptyFields()
	{
		driver.findElement(By.id("btn-create-account")).click();

		List<String> issuesList = new ArrayList<String>();

		int timeInSeconds = 1 * 1000;
		try {
			WebElement firstNameError = driver.findElement(By.id("register-firstName-error"));
			WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
			wait.until(ExpectedConditions.textToBePresentInElement(firstNameError, "Please enter your first  name"));
		}
		catch (Exception e)
		{
			issuesList.add("First Name Error is not displayed");
			System.out.println(e.getMessage());
		}
		try {
			WebElement LastNameError = driver.findElement(By.id("register-lastName-error"));
			WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
			wait.until(ExpectedConditions.textToBePresentInElement(LastNameError, "Please enter your last name"));
		}
		catch (Exception e)
		{
			issuesList.add("Last Name Error is not displayed");
			System.out.println(e.getMessage());
		}
		try {
			WebElement eMailError = driver.findElement(By.id("register-emailAddress-error"));
			WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
			wait.until(ExpectedConditions.textToBePresentInElement(eMailError, "Please enter your email"));
		}
		catch (Exception e)
		{
			issuesList.add("Email Address Error is not displayed");
			System.out.println(e.getMessage());
		}

		try {
			WebElement passwordError = driver.findElement(By.id("register-password-error"));
			WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
			wait.until(ExpectedConditions.textToBePresentInElement(passwordError, "Please enter your password"));
		}
		catch (Exception e)
		{
			issuesList.add("Password Error is not displayed");
			System.out.println(e.getMessage());
		}
		try {
			WebElement confirmPaswdError = driver.findElement(By.id("register-confirmPassword-error"));
			WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
			wait.until(ExpectedConditions.textToBePresentInElement(confirmPaswdError, "Please enter your confirm password"));
		}
		catch (Exception e)
		{
			issuesList.add("Confirm Password Error is not displayed");
			System.out.println(e.getMessage());
		}

		return issuesList;
	}
// __________________________________________________________________________________________________________
	
	@FindBy(id="register-password-error")
	WebElement passwordValid;
	
	
	
	
//	public void valdiatePasswordfield () {
//		List<String> issuesList = new ArrayList<String>();
//
//		int timeInSeconds = 1 * 1000;
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
//			wait.until(ExpectedConditions.textToBePresentInElement(PasswordValidation, "Password should contain at least 8 characters"));
//		}
//	}


}








