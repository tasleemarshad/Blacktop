package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath="//*[@id='app']/div/div/div/div[2]/form/div[2]/div/div/span")
	WebElement EmailValidation;
	
	@FindBy(xpath="//*[@id='app']/div/div/div/div[2]/form/div[3]/div[1]/div/span")
	WebElement PasswordValidation;
	
	@FindBy(xpath="//*[@id='app']/div/div/div/div[2]/form/div[3]/div[2]/div/span")
	WebElement ConfirmPasswordValidation;
	
	@FindBy(xpath="//*[@id='app']/div/div/div/div[2]/form/div[2]/div/div/span")
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
	
}
;