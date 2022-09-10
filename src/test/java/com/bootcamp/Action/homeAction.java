package com.bootcamp.Action;


import com.bootcamp.Locator.homeLocator;
import com.bootcamp.Utility.testBase;


public class homeAction extends testBase{
	homeLocator HomeLocator = new homeLocator();
	
	public void AboutusLink() throws Exception {
		HomeLocator.Aboutuslink.click();
		
}
	public void SignupLinkClick() throws Exception  {
	HomeLocator.Signuplink.click();
	
	}
	public void LoginLinkClick() throws Exception  {
	HomeLocator.LoginLink.click();
	
}
	public void CartLinkClick() throws Exception  {
	HomeLocator.CartLink.click();
}
	public void ContactLinkClick() {
	HomeLocator.Contactlink.click();	
	}
	
	
}
