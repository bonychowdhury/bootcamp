package com.bootcamp.Action;


import org.openqa.selenium.Alert;
import org.testng.Assert;

import com.bootcamp.Locator.SignupLocator;
import com.bootcamp.Utility.screenshot;
import com.bootcamp.Utility.testBase;

public class SignupAction extends testBase {

	SignupLocator signupLocator =  new SignupLocator();
		
	public void Filloutvalidsignupcredentials1 () {
	signupLocator.username.sendKeys("Bony.C");
	signupLocator.password.sendKeys("1234");
	}
	
public void Filloutvalidsignupcredentials2 (String u, String p) {
	signupLocator.username.sendKeys(u);	
	signupLocator.password.sendKeys(p);	
	}

public void clicksignupbutton() throws Exception {
	signupLocator.signupbutton.click();
	Thread.sleep(1000);
}
 public void verifysignupsucessfull() throws Exception {
	 
	boolean verifysignupsucessfull = driver.switchTo().alert().getText().contains("Sign up successful.");
	Assert.assertTrue(verifysignupsucessfull);
	driver.switchTo().alert().accept(); 
	Thread.sleep(1000);
	
}

public void verifyunsucessfullsignup1() throws Exception {
boolean verifynegativesignup = driver.switchTo().alert().getText().contains("This user already exist.");
Assert.assertTrue(verifynegativesignup);
driver.switchTo().alert().accept();
 Thread.sleep(1000);
 }
}
