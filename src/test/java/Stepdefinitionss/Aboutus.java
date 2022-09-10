package Stepdefinitionss;

import com.bootcamp.Action.aboutusAction;
import com.bootcamp.Action.homeAction;
import com.bootcamp.Utility.screenshot;
import com.bootcamp.Utility.testBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Aboutus extends testBase{
	homeAction HomeAction= new homeAction();
	aboutusAction AboutusAction = new aboutusAction ();

@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	   getURL(URL);
	}

@When("^Click on About us Link$")
	public void click_on_About_us_Link() throws Throwable {
		HomeAction.AboutusLink();
	}

@Then("^Verify About us text is displayed in About us page$")
	public void verify_About_us_text_is_displayed_in_About_us_page() throws Throwable {
		AboutusAction.VerifyAboutUstext();
	}
	
 @When("^Click play video button$")
public void click_play_video_button() throws Throwable {
	AboutusAction.Aboutusplay();
}

 @Then("^Verify User is able to watch  About us  video$")
 public void verify_User_is_able_to_watch_About_us_video() throws Throwable {
AboutusAction.Verifyaboutusvideoplayed();
screenshot.takescreenshot(driver, "About us video Played");

}
 @Then("^Verify About us video is displayed in About us page$")
 public void verify_About_us_video_is_displayed_in_About_us_page() throws Throwable {
	 AboutusAction.verifyaboutusvideodisplayed();	 
 }

 @When("^Click close button$")
 public void click_close_button() throws Throwable {
	 AboutusAction.closeaboutusvideo();   
 }

 @Then("^Verify user can click close button to close video$")
 public void verify_user_can_click_close_button_to_close_video() throws Throwable {
	AboutusAction.verifyclosevdo();
 }

 @When("^Click x button$")
 public void click_x_button() throws Throwable {
	 AboutusAction.xaboutusvideo();     
 }

 @Then("^Verify user can click x button to close video$")
 public void verify_user_can_click_x_button_to_close_video() throws Throwable {
	 AboutusAction.verifyclosevdo();
	 screenshot.takescreenshot(driver, "close button action");
 }

 @When("^Click Fullscreen button$")
 public void click_Fullscreen_button() throws Throwable {
	 AboutusAction.maximizevideo();   
 }

 @Then("^Verify user can maximize about us video$")
 public void verify_user_can_maximize_about_us_video() throws Throwable {
	 AboutusAction.verifyfullscreenbuttonaction(); 
	 screenshot.takescreenshot(driver, "FullScreen button action");
 }

 @When("^Click picture-in-picture button$")
 public void click_picture_in_picture_button() throws Throwable {
	 AboutusAction.picinpicvideo();
 }

 @Then("^Verify user can watch picture in seperate window$")
 public void verify_user_can_watch_picture_in_seperate_window() throws Throwable {
	 AboutusAction.verifypicinbuttonaction();
	 screenshot.takescreenshot(driver, "picture-in-picture button action");
 }

 @When("^Click mute button$")
 public void click_mute_button() throws Throwable {
	 AboutusAction.mutevideo();
    
 }

 @Then("^Verify user can mute the audio$")
 public void verify_user_can_mute_the_audio() throws Throwable {
	 AboutusAction.verifymutebuttonactoins();
	 screenshot.takescreenshot(driver, "mute button action");
 }

}
