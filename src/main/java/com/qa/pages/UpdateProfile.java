package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class UpdateProfile extends TestBase {
	
	@FindBy(id = "btn-navbar-settings")
	WebElement Setting ;
	
	@FindBy(xpath = "//*[@id='myToggleNav']/ul[3]/li/div/a[1]")
	WebElement ProfileUpdateLink;

	@FindBy(name = "firstName")
	WebElement UpdateFirstName;
	
	@FindBy(name = "lastName")
	WebElement UpdateLastName;
	
	@FindBy(name = "emailAddress")
	WebElement UpdateemailAddress;
	
	@FindBy(id = "btn-update-profile-update")
	WebElement UpdateBtn;
	
	@FindBy( id= "")
	WebElement Cancelupdate;
	
	@FindBy(xpath="//*[@id='app']/span/div/strong")
	WebElement ProfileUpdate;
	
	
//	____________________________________________________________________________________________________
	

	//Initializing the Page Objects:
	public UpdateProfile(){
		PageFactory.initElements(driver, this);
	}

//  ______________________________________________________________________________________________________________________________
	
	public void ClickonSettingicon(){
		Setting.click();
	}
	
	public void ClickonUpdateProfileLink(){
		ProfileUpdateLink.click();
	}
	
	public void updateFirstname(String name){
		UpdateFirstName.clear();
		UpdateFirstName.sendKeys(name);
	}
	
	public void updateLastname(String lname){
		UpdateLastName.clear();
		UpdateLastName.sendKeys(lname);
	}
	
	public void updateEmailAdress(String email){
		UpdateemailAddress.sendKeys(email);
	}
	
	public void ClickUpdatebutn(){
	UpdateBtn.click();
	}
	
	public String VerifyProfileUpdated(){
		return ProfileUpdate.getText();
		}
}
