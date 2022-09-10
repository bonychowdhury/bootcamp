package Stepdefinitionss;

import com.bootcamp.Action.contactAction;
import com.bootcamp.Action.homeAction;
import com.bootcamp.Utility.testBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contact extends testBase {
	homeAction HomeAction = new homeAction();
	contactAction ContactAction = new contactAction();
	
	@When("^Click on Contact link$")
	public void click_on_Contact_link() throws Throwable {
		HomeAction.ContactLinkClick();	    
	}

	@Then("^Verify User can visit Contact page after clicking Contact link$")
	public void verify_User_can_visit_Contact_page_after_clicking_Contact_link() throws Throwable {
		ContactAction.verifyusercanvisitcontactpage(); 
	}

	@Then("^Verify User can see Contact Email field in Contact Page$")
	public void verify_User_can_see_Contact_Email_field_in_Contact_Page() throws Throwable {
		ContactAction.verifyemailfielddisplay(); 
	}

	@Then("^Verify User can see Contact Name field in Contact Page$")
	public void verify_User_can_see_Contact_Name_field_in_Contact_Page() throws Throwable {
		ContactAction.verifynamefielddisplay(); 
	}

	@Then("^Verify User can see Message field in Contact Page$")
	public void verify_User_can_see_Message_field_in_Contact_Page() throws Throwable {
		ContactAction.verifymessagefielddisplay();   
	}

	@When("^Click on Send Message button$")
	public void click_on_Send_Message_button() throws Throwable {
		ContactAction.clicksendmessagebutton();  
	}

	@Then("^Verify pop up text is displayed after clicking Send Message button$")
	public void verify_pop_up_text_is_displayed_after_clicking_Send_Message_button() throws Throwable {
		ContactAction.verifyusercansendmessageafterclickingsendmessagebutton();    
	}

	@When("^Enter Contact fields credentials$")
	public void enter_Contact_fields_credentials() throws Throwable {
		ContactAction.entercontactfield(prop.getProperty("ContactEmail"), prop.getProperty("Contactname"), prop.getProperty("Message"));    
	}

	@Then("^Verify user can send message after once click Send message button$")
	public void verify_user_can_send_message_after_once_click_Send_message_button() throws Throwable {
		ContactAction.verifyusercansendmessageafterclickingsendmessagebutton();    
	}
	@Then("^Verify user cannot send message with empty contact fiels credentials$")
	public void verify_user_cannot_send_message_with_empty_contact_fiels_credentials() throws Throwable {
		ContactAction.verifyusercannotsendmessagewithwmptyfield();
	}
}
