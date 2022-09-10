package Stepdefinitionss;

import com.bootcamp.Action.LoginAction;
import com.bootcamp.Action.homeAction;
import com.bootcamp.Utility.testBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPageCreation extends testBase{
	
	homeAction HomeAction= new homeAction();
	LoginAction LoginAction1= new LoginAction();
	
	@Given("^Launch the \"([^\"]*)\"$")
	public void launch_the(String URL) throws Throwable {
		getURL(URL);		
	}

	@When("^Click on login link$")
	public void click_on_login_link() throws Throwable {
	  HomeAction.LoginLinkClick();
	}

    @Then("^Verify log in text is displayed in the Log In page$")
    public void verify_log_in_text_is_displayed_in_the_Log_In_page() throws Throwable {
	LoginAction1.verifylogintextisdisplayed(); 
	
}
	
	@When("^Enter username and password$")
	public void enter_username_and_password() throws Throwable {
	 LoginAction1.enterusercredential(prop.getProperty("Username"), prop.getProperty("Password"));
	}

	@When("^Click on login button in login page$")
	public void click_on_login_button_in_login_page() throws Throwable {
	LoginAction1.clickloginbutton();
	}

	
	@Then("^Verify user can login using valid credentials$")
	public void verify_user_can_login_using_valid_credentials() throws Throwable {
	 LoginAction1.Verifylogin();
	
	}
	@When("^Enter username and invalid password$")
	public void enter_username_and_invalid_password() throws Throwable {
	LoginAction1.enterusercredential(prop.getProperty("Username"), prop.getProperty("InvalidPassword"));
		
	}

	@Then("^Verify user cannot login using invalid credentials$")
	public void verify_user_cannot_login_using_invalid_credentials() throws Throwable  {
	LoginAction1.verifyusercannotlogin();
	}
	
	@When("^Enter invalid username and valid password$")
	public void enter_invalid_username_and_valid_password() throws Throwable {
	LoginAction1.enterusercredential(prop.getProperty("InvalidUsername"), prop.getProperty("Password"));    
	}
	@When("^Enter invalid username and invalid password$")
	public void enter_invalid_username_and_invalid_password() throws Throwable {
	LoginAction1.enterusercredential(prop.getProperty("InvalidUsername"), prop.getProperty("InvalidPassword"));   
	}
	@When("^Enter empty username and invalid password$")
	public void enter_empty_username_and_invalid_password() throws Throwable {
		LoginAction1.enterusercredential(prop.getProperty("EmptyUsername"), prop.getProperty("InvalidPassword"));  
	}
	@When("^Enter valid username and empty password$")
	public void enter_valid_username_and_empty_password() throws Throwable {
		LoginAction1.enterusercredential(prop.getProperty("Username"), prop.getProperty("EmptyPassword"));    
	}


}
