package com.bootcamp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bootcamp.Utility.testBase;

public class contactLocator extends testBase {

	public contactLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="recipient-email")
	public WebElement contactemail;
	
	@FindBy(how=How.ID, using="recipient-name")
	public WebElement contactname;
	
	@FindBy(how=How.ID, using="message-text")
	public WebElement message;
	
	@FindBy(how=How.XPATH, using="//button[text()='Send message']")
	public WebElement sendmessagebutton;
	
	@FindBy(how=How.ID, using="exampleModalLabel")
	public WebElement newmessage;
	
}
