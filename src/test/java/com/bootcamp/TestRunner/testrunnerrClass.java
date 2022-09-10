package com.bootcamp.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.bootcamp.Utility.testBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = {"scr/test/resources/Feature"},
plugin = {"json:target/cucumber.json"},
glue = "Stepdefinitionss",tags= {"@Log"})

public class testrunnerrClass extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void startURL() {
	testBase test = new testBase();
	test.initBrowser();
	
	}
	
	@AfterTest
	public void closeURL() {
	testBase test = new testBase();
	test.driver.quit();
	}	

}
