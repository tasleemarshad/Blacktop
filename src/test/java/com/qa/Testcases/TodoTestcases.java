package com.qa.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Dashboard;
import com.qa.pages.Login;
import com.qa.pages.NewActionPlan;
import com.qa.pages.Todo;

public class TodoTestcases extends TestBase {
	
	Login lginPge;
	Dashboard dshBrd;
	NewActionPlan actionplan ;
	Todo todo;
	
	public TodoTestcases(){
		super();
		}
	 
	@BeforeMethod
	public void setUp(){
		initialization();
		lginPge = new Login();
		dshBrd = new Dashboard();
		actionplan = new NewActionPlan ();
		todo = new Todo();
	}
	
	@Test(priority=1)
	public void AddTodo() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		todo.ClickActionPlan();
		todo.ClicktheLink();
		todo.ClickNewTodoBtn();
		todo.EnterName("Test");
		todo.Enterbody("test the qa ");
		todo.SelectType();
		todo.EnterdueDate("12122020");
		todo.ClickCreateTodoBtn();
		Thread.sleep(1000);
	}	

	@Test(priority=2)
	public void EDitTodo() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		todo.ClickActionPlan();
		todo.ClicktheLink();
		todo.EditTodoicon();
		todo.EnterEditName("UpdateTodo");
		todo.EnterEditbody("uuuuuuuuuuuuuppppppppppppdddddddaaaaatttttttttttteeeedddd");
		todo.EDitSelectType();
		todo.EnterEditdueDate("12/02/2020");
		todo.ClickUpdateTodoBtn();
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void VerifyCompletionTodo() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		todo.ClickActionPlan();
		todo.ClicktheLink();
		todo.SelectCheckbox();
		todo.EnterCompletionNotes("compelet the todo by automation");
		todo.ClickCompelteBtn();
	}
	
	@Test(priority=4)
	public void VerifyCancellationTodo() throws Exception{
		dshBrd = lginPge.login(prop.getProperty("EmailAddress"), prop.getProperty("passwordBtn"));
		Thread.sleep(1000);
		todo.ClickActionPlan();
		todo.ClicktheLink();
		todo.ClickCancelIcon();
		todo.EnterCancelNotes("Cancel the Todo with Cancel icon");
		todo.ClickCancelBtn();
	}
	
	
}
