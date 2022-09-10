package com.bootcamp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bootcamp.Utility.testBase;

public class homeLocator extends testBase {
	public homeLocator () {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT, using="About us")
	public WebElement Aboutuslink;
	
	@FindBy(how=How.LINK_TEXT, using="Sign up")
	public WebElement Signuplink;
	
	@FindBy(how=How.LINK_TEXT, using="Log in")
	public WebElement LoginLink;
	@FindBy(how=How.LINK_TEXT, using="Home")
	public WebElement homeLink;	
	
	@FindBy(how=How.ID, using="cartur")
	public WebElement CartLink;	
	
	@FindBy(how=How.LINK_TEXT, using="Contact")
	public WebElement Contactlink;
	
}

