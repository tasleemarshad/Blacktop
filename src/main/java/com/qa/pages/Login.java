package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Login extends TestBase{
	
	@FindBy(name ="emailAddress")  
	WebElement EmailAddress;
	
	@FindBy(xpath ="//*[@id='app']/div/div/div[2]/div/div[2]/form/div[2]/div/input")  
	WebElement passwordBtn;
	
	@FindBy(xpath ="/html/body/div/div/div/div[2]/div/div[2]/form/div[3]/button")  
	WebElement LoginButton;
	
	
	
	
	//Initializing the Page Objects:
	public Login(){
		PageFactory.initElements(driver, this);
	}
	
	public Dashboard login(String un, String pwd){
		EmailAddress.sendKeys(un);
		passwordBtn.sendKeys(pwd);
		LoginButton.click();
		
		return new Dashboard();
	}

}
