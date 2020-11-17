package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ChangePassword extends TestBase{
	
	@FindBy(id = "btn-navbar-settings")
	WebElement Setting ;
	
	@FindBy(xpath = "//*[@id='myToggleNav']/ul[3]/li/div/a[2]")
	WebElement UpdatePasswordLink;

	@FindBy(name  = "passwordOld")
	WebElement CurrentPassword;
	
	@FindBy(name  = "passwordNew")
	WebElement NewPassword;

	@FindBy(name  = "passwordConfirm")
	WebElement ConfirmPassword;
	
	@FindBy(id = "btn-update-password-update")
	WebElement UpdatePassword;
	
//	_________________________________________________________________________________________
	
//	Alerts 
	
	@FindBy(xpath= "//*[@id='app']/span/div/strong/div")
	WebElement AlertCurrentPassword;
	
//	______________________________________________________________________________________________
	
	//Initializing the Page Objects:
	public ChangePassword(){
		PageFactory.initElements(driver, this);
	}

	
	public void ClickonSettingicon(){
		Setting.click();
	}
	
	public void ClickonChangePasswordLink(){
		UpdatePasswordLink.click();
	}
	
	public void EnterOldPassword(String PW){
		CurrentPassword.sendKeys(PW);
	}
	
	public void EnterNewPassword(String PW){
		NewPassword.sendKeys(PW);
	}
	
	public void EnterConfirmPassword(String PW){
		ConfirmPassword.sendKeys(PW);
	}
	
	public void ClickUpdateBtn(){
		UpdatePassword.click();
	}
	
//	______________________________________________________________________
	
//	Alerts 
	
	public String AlertCurrentPasswordnotmATCH(){
		return AlertCurrentPassword.getText();
	}
	
}
