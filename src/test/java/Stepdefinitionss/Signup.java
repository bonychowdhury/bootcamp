package Stepdefinitionss;

import com.bootcamp.Action.SignupAction;
import com.bootcamp.Action.homeAction;
import com.bootcamp.Utility.screenshot;
import com.bootcamp.Utility.testBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signup extends testBase {
homeAction HomeAction= new homeAction();
SignupAction signupAction = new SignupAction();

	@When("^Click on Sign up Link$")
	public void click_on_Sign_up_Link() throws Throwable {
	HomeAction.SignupLinkClick();   
	}

	@When("^New user enter Unique Username and Password$")
	public void new_user_enter_Unique_Username_and_Password() throws Throwable {
		signupAction.Filloutvalidsignupcredentials2 (prop.getProperty("NewUsername"), prop.getProperty("Password"));	    
	}

	@When("^User click on Sign up button$")
	public void user_click_on_Sign_up_button() throws Throwable {
	signupAction.clicksignupbutton();
	
	
	}

	@Then("^Verify User able to register sucessfully$")
	public void verify_User_able_to_register_sucessfully() throws Throwable {
			
	signupAction.verifysignupsucessfull();
	screenshot.takescreenshot(driver, "verify sucessfull signup");
	}
	@When("^New user enter existing Username and Password$")
	public void new_user_enter_existing_Username_and_Password() throws Throwable {
		signupAction.Filloutvalidsignupcredentials2(prop.getProperty("Username"), prop.getProperty("Password"));	 
	}

	@Then("^Verify User not able to register sucessfully$")
	public void verify_User_not_able_to_register_sucessfully() throws Throwable {
		
		signupAction.verifyunsucessfullsignup1();
		
		screenshot.takescreenshot(driver, "verify negativesignup");
	}
}
