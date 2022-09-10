package com.bootcamp.Action;

import org.testng.Assert;

import com.bootcamp.Locator.cartLocator;
import com.bootcamp.Locator.homeLocator;
import com.bootcamp.Utility.screenshot;
import com.bootcamp.Utility.testBase;

public class cartAction extends testBase {

	cartLocator cartLocator1 = new cartLocator();
	public void CartPLink() throws Exception {
		boolean verycart= cartLocator1.CartProduct.isDisplayed();
		Assert.assertTrue(verycart);
		screenshot.takescreenshot(driver, "Cart Link displayed");
}
	
}
