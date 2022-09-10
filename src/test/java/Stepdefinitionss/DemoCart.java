package Stepdefinitionss;

import com.bootcamp.Action.LoginAction;
import com.bootcamp.Action.aboutusAction;
import com.bootcamp.Action.cartAction;
import com.bootcamp.Action.homeAction;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCart {
	
	homeAction HomeAction= new homeAction();
	aboutusAction AboutusAction = new aboutusAction ();
	LoginAction LoginAction1= new LoginAction();
	cartAction cartAction1=new cartAction();
	
	@When("^Click on cart link$")
	public void click_on_cart_link() throws Throwable {
	    HomeAction.CartLinkClick();
	}

	@Then("^Verify user can visit cart page$")
	public void verify_user_can_visit_cart_page() throws Throwable {
	    cartAction1.CartPLink();
	}
}
