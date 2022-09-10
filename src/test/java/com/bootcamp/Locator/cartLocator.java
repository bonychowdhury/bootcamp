package com.bootcamp.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bootcamp.Utility.testBase;

public class cartLocator extends testBase {
		public cartLocator () {
			
			PageFactory.initElements(driver, this);
		}
		@FindBy(how=How.XPATH, using="//h2[text()='Products']")
		public WebElement CartProduct;
}
