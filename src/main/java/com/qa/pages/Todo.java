package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class Todo extends TestBase {
	
	@FindBy(xpath="//*[@id=\'myToggleNav\']/ul[1]/li[3]/a")
	WebElement ActionPlan;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[1]/div[2]/table/tbody/tr[10]/td[1]/a")
	WebElement ClickLink;
	
	@FindBy(id="action-btn-todo-add")
	WebElement NewTodo;
	
	@FindBy(name="name")
	WebElement Name;
	
	@FindBy(name="body")
	WebElement Body;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/select")
	WebElement Todotype;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[4]/div/input")
	WebElement dueDate;
	
	@FindBy(id="createBtn")
	WebElement createTodo;
//	_________________________________________________________________________________________________
	
//	EDIT TODO 
	
	@FindBy(id="action-btn-todo-edit-0")
	WebElement EditTodo;
	
	@FindBy(name="name")
	WebElement EditName;
	
	@FindBy(name="body")
	WebElement EditBody;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/select")
	WebElement EditTodotype;
	
	@FindBy(name="dueDate")
	WebElement EditdueDate;
	
	@FindBy(id="createBtn")
	WebElement update;
//	_____________________________________________________________________________________________________
	
//	COMPETION NOTES
	
	@FindBy(id="action-btn-todo-complete-1")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"completeDialog\"]/div/div/form/div[1]/div/div/div/textarea")
	WebElement CompleteNote;

	@FindBy(id="dialog-btn-todo-complete")
	WebElement completeBtn;
//	__________________________________________________________________________________________________
	
//	CANCELATION NOTES
	
	@FindBy(id="action-btn-todo-delete-3")
	WebElement CancelIcon;
	
	@FindBy(xpath="//*[@id=\"cancelDialog\"]/div/div/form/div[1]/div/div/div/textarea")
	WebElement CancelNote;

	@FindBy(id="dialog-btn-todo-cancel")
	WebElement CancelTodoBtn;

//	-----------------------------------------------------------------------------------------------------
	//Initializing the Page Objects:
		public Todo(){
			PageFactory.initElements(driver, this);
		}
		
//	--------------------------------------------------------------------------------------------	
		public void ClickActionPlan(){
			ActionPlan.click();
		}
		
		public void ClicktheLink(){
			ClickLink.click();
		}
		
		public void ClickNewTodoBtn(){
			NewTodo.click();
		}

		public void EnterName(String name){
			Name.sendKeys(name);
		}
		
		public void Enterbody(String body){
			Body.sendKeys(body);
		}
		
		public void SelectType( ){
			Select typeDp = new Select(Todotype);
			typeDp.selectByVisibleText("KickOff");		
		}
		
		public void EnterdueDate(String date){
			dueDate.sendKeys(date);
		}
		
		public void ClickCreateTodoBtn(){
			createTodo.click();
		}
		
//		___________________________________________________________________________________________________
		
//		EDIT TODO 
		
		public void EditTodoicon(){
			NewTodo.click();
		}

		public void EnterEditName(String name){
			EditName.sendKeys(name);
		}
		
		public void EnterEditbody(String body){
			EditBody.sendKeys(body);
		}
		
		public void EDitSelectType( ){
			Select EtypeDp = new Select(EditTodotype);
			EtypeDp.selectByVisibleText("KickOff");		
		}
		
		public void EnterEditdueDate(String date){
			EditdueDate.sendKeys(date);
		}
		
		public void ClickUpdateTodoBtn(){
			update.click();
		}
//		__________________________________________________________________________________
		
//		COmpletion Notes
		
		public void SelectCheckbox(){
			checkbox.click();
		}
		
		public void EnterCompletionNotes(String note){
			CompleteNote.sendKeys(note);
		}
		
		public void ClickCompelteBtn(){
			completeBtn.click();
		}
		
//		_____________________________________________________________________________________________
		
//		CANCELLATION NOTES
		
		public void ClickCancelIcon(){
			CancelIcon.click();
		}
		
		public void EnterCancelNotes(String text){
			CancelNote.sendKeys(text);
		}
		
		public void ClickCancelBtn(){
			CancelTodoBtn.click();
		}
}
