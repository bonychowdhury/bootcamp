package com.bootcamp.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bootcamp.Locator.contactLocator;
import com.bootcamp.Utility.screenshot;
import com.bootcamp.Utility.testBase;

public class contactAction extends testBase {
	
	contactLocator ContactLocator = new contactLocator();
	
	public void verifyusercanvisitcontactpage() {
	boolean verifycontactpage =	ContactLocator.sendmessagebutton.isEnabled();
	Assert.assertTrue(verifycontactpage);
	}
	
public void verifyemailfielddisplay() {
	WebDriverWait wait = new WebDriverWait(driver, 20); // command for explicit wait
	wait.until(ExpectedConditions.elementToBeClickable(ContactLocator.contactemail));
boolean verifyemail =ContactLocator.contactemail.isDisplayed();
Assert.assertTrue(verifyemail);
	 }
 public void verifynamefielddisplay() {
		WebDriverWait wait = new WebDriverWait(driver, 20); // command for explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(ContactLocator.contactname));
	 boolean verifyname =ContactLocator.contactname.isDisplayed();
	 Assert.assertTrue(verifyname);
	 }
 public void verifymessagefielddisplay() {
	 WebDriverWait wait = new WebDriverWait(driver, 20); 
		wait.until(ExpectedConditions.elementToBeClickable(ContactLocator.message));
	 boolean verifymessage = ContactLocator.message.isDisplayed();
	 Assert.assertTrue(verifymessage); 
 }
 public void entercontactfield(String ce, String cn, String cm) {
	 ContactLocator.contactemail.sendKeys(ce);
	 ContactLocator.contactname.sendKeys(cn);
	 ContactLocator.message.sendKeys(cm);
	 
 }
 public void clicksendmessagebutton() throws Exception {
	 WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable( ContactLocator.sendmessagebutton));
	 ContactLocator.sendmessagebutton.click();
	 //Thread.sleep(1000);
 }
 
 public void verifyusercansendmessageafterclickingsendmessagebutton() throws Exception {
	 Alert alert = driver.switchTo().alert();
	boolean verifysendmessage= alert.getText().contains("Thanks for the message!!");
	Assert.assertTrue(verifysendmessage);
	alert.accept();
	Thread.sleep(1000);
	screenshot.takescreenshot(driver, "send sucessfull message");
	 
 }
 public void verifyusercannotsendmessagewithwmptyfield() throws Exception {
	 Alert alert = driver.switchTo().alert();
		boolean verifysendmessage= alert.getText().contains("Thanks for the message!!");
		Assert.assertFalse(verifysendmessage);
		alert.accept();
		Thread.sleep(1000);
		screenshot.takescreenshot(driver, "Bug 1 send message without with empty fields");
		
 }
}
