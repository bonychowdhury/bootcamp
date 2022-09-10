package com.bootcamp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bootcamp.Utility.testBase;

public class SignupLocator extends testBase {

	public SignupLocator () {

	PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="sign-username")
	public WebElement username;
	@FindBy(how=How.ID, using="sign-password")
	public WebElement password;
	@FindBy(how=How.XPATH, using="//button[text()='Sign up']")
	public WebElement signupbutton;
}

