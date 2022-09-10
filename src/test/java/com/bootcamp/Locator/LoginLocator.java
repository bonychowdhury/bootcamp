package com.bootcamp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bootcamp.Utility.testBase;

public class LoginLocator extends testBase {

public LoginLocator () {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="loginusername")
	public WebElement Usernamelink;
	
	@FindBy(how=How.ID, using="logInModalLabel")
	public WebElement logintext;
	
	
	@FindBy(how=How.ID, using="loginpassword")
	public WebElement Passwordlink;
	
	@FindBy(how=How.XPATH, using="//button[text()='Log in']")
	public WebElement LoginButton;
	
	@FindBy(how=How.ID, using="nameofuser")
	public WebElement VerifyLogin;
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div[3]/button[1]")
	public WebElement CloseButton;
	
	@FindBy(how=How.ID, using="logout2")
	public WebElement logoutButton;
	
	
}

	

