package com.bootcamp.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bootcamp.Locator.LoginLocator;
import com.bootcamp.Locator.homeLocator;
import com.bootcamp.Utility.screenshot;
import com.bootcamp.Utility.testBase;

public class LoginAction extends testBase{
	homeLocator HomeLocator = new homeLocator();
	LoginLocator LoginLocator1= new LoginLocator ();

	
	public void verifylogintextisdisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, 20); // command for explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(LoginLocator1.logintext));
		boolean loginlink = LoginLocator1.logintext.isDisplayed();
		Assert.assertTrue(loginlink);
		screenshot.takescreenshot(driver, "Login text displayed");
	}
	
	public void enterusercredential(String u, String p) {
		LoginLocator1.Usernamelink.sendKeys(u);
		LoginLocator1.Passwordlink.sendKeys(p);
	}
	
	public void clickloginbutton() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(LoginLocator1.LoginButton));
		LoginLocator1.LoginButton.click();
		Thread.sleep(1000);
}
	
	public void Verifylogin() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20); // command for explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(LoginLocator1.logoutButton));
		boolean veryL = LoginLocator1.VerifyLogin.isDisplayed();
		Assert.assertTrue(veryL);
		screenshot.takescreenshot(driver, "Sucessfull Login");
		LoginLocator1.logoutButton.click();		
}
	
	public void verifyusercannotlogin() throws Exception {	
	driver.switchTo().alert().accept();
	screenshot.takescreenshot(driver, "Unsucessfull Login");
	LoginLocator1.CloseButton.click();
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(HomeLocator.LoginLink));
	
	boolean verifynegativelogin = HomeLocator.LoginLink.isDisplayed();
	Assert.assertTrue(verifynegativelogin);
	Thread.sleep(1000);

	
//boolean veryL = LoginLocator1.VerifyLogin.isDisplayed();
//Assert.assertFalse(veryL);
//boolean verifynegativelogin = driver.switchTo().alert().getText().contains("Wrong password.");
//Assert.assertTrue(verifynegativelogin);
}
}
