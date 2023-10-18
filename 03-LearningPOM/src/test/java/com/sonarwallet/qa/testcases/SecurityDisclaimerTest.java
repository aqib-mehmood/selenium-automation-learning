package com.sonarwallet.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sonarwallet.qa.base.TestBase;
import com.sonarwallet.qa.pages.SecurityDisclaimerPage;
import com.sonarwallet.qa.pages.SignupPasswordPage;

public class SecurityDisclaimerTest extends TestBase {

	SecurityDisclaimerPage disclaimerScreenPage;
	SignupPasswordPage signupPasswordPage;

	// calling super class methods, attributes
	public SecurityDisclaimerTest() {
		super();
	}

	@BeforeMethod // run before each method
	public void setUp() {
		// calling the initilization method from Super Class
		initialization();

		// creating object of the relevant page class to call the methods for testing
		disclaimerScreenPage = new SecurityDisclaimerPage();

	}

	@Test
	public void acceptSecurityDisclaimerTest() throws InterruptedException {
		signupPasswordPage = disclaimerScreenPage.acceptSecurityDisclaimer(); // as the disclaimer method is returning the Signup password
															// page so saving it to varibale of that return type
		
		// wait method
		TestBase.waitAfterAction();
		
	}

	@AfterMethod // run after each method
	public void tearDown() {
		driver.quit();
	}

}
