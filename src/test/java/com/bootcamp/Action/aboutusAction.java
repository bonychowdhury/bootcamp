package com.bootcamp.Action;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bootcamp.Locator.aboutusLocator;
import com.bootcamp.Locator.homeLocator;
import com.bootcamp.Utility.screenshot;
import com.bootcamp.Utility.testBase;

public class aboutusAction extends testBase{
	aboutusLocator AboutusLocator = new aboutusLocator ();
	homeLocator HomeLocator = new homeLocator();
	
	public void VerifyAboutUstext() {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(AboutusLocator.AboutusText));		
		boolean verifyAboutustext = AboutusLocator.AboutusText.isDisplayed();
		Assert.assertTrue(verifyAboutustext);
	}
	
	public void Aboutusplay() throws Exception {
		AboutusLocator.Aboutusplay.click();
		Thread.sleep(1000);	
	}
	public void Verifyaboutusvideoplayed() {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(AboutusLocator.VeryAboutusvdo));	
	boolean verifyvdo =  AboutusLocator.VeryAboutusvdo.isEnabled();
	Assert.assertTrue(verifyvdo);
	screenshot.takescreenshot(driver, "Verify Video Played");
	}
	public void verifyaboutusvideodisplayed() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(AboutusLocator.aboutusvdodisplayed));	
	    boolean vdo = AboutusLocator.aboutusvdodisplayed.isDisplayed();
	    Assert.assertTrue(vdo);
	   
	    } 
	    public void closeaboutusvideo() throws Exception {
	    AboutusLocator.closebutton.click();
	    } 
	    public void verifyclosevdo() {
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.elementToBeClickable(HomeLocator.Aboutuslink));	
	    boolean closeaboutsvideo = HomeLocator.Aboutuslink.isEnabled();
	    Assert.assertTrue(closeaboutsvideo);
	    }
	    public void xaboutusvideo() throws Exception {
	    AboutusLocator.xbutton.click();
	        }
	   
	    public void maximizevideo() throws Exception {
	    AboutusLocator.maximize.click();
	    
	    }
	    public void verifyfullscreenbuttonaction() throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	 	wait.until(ExpectedConditions.elementToBeClickable(AboutusLocator.minimize));		
	    boolean mini = AboutusLocator.minimize.isDisplayed();
	    Assert.assertTrue(mini);
	    }
	    
	    public void picinpicvideo() throws Exception {
	    AboutusLocator.picinpicbutton.click();
	   
	    }
	    
	    public void verifypicinbuttonaction() throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(AboutusLocator.exitpicinpicbutton));	
	    boolean picinpic = AboutusLocator.exitpicinpicbutton.isDisplayed();
	    Assert.assertTrue(picinpic);
	    }
	    
	    public void mutevideo() throws Exception {
	    AboutusLocator.mute.click();
	    }
	    public void verifymutebuttonactoins() throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.elementToBeClickable(AboutusLocator.unmute));	
	    boolean unmute = AboutusLocator.unmute.isDisplayed();
	    Assert.assertTrue(unmute);  
	    }
}
