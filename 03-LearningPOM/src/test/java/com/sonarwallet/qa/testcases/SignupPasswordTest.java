package com.sonarwallet.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sonarwallet.qa.base.TestBase;
import com.sonarwallet.qa.pages.SecurityDisclaimerPage;
import com.sonarwallet.qa.pages.SignupConfirmPasswordPage;
import com.sonarwallet.qa.pages.SignupPasswordPage;

public class SignupPasswordTest extends TestBase {

	SignupPasswordPage signupPasswordPage;
	SignupConfirmPasswordPage signupConfirmPassPage;
	SecurityDisclaimerPage securityDisclaimerPage;
	SecurityDisclaimerTest securityDisclaimerTest;

	// calling super class methods, attributes
	public SignupPasswordTest() {
		super();
	}

	@BeforeMethod // run before each method
	public void setUp() {
		// calling the initilization method from Super Class
		initialization();

		// create object of the previous page classes required before executing this class method
		securityDisclaimerPage = new SecurityDisclaimerPage();
		signupPasswordPage = securityDisclaimerPage.acceptSecurityDisclaimer();

		// creating object of the relevant page class to call the methods for testing
		signupPasswordPage = new SignupPasswordPage();
	}

	@Test
	public void createPasswordTest() throws InterruptedException {
		// as this method is returning the Confirm password page so saving it to
		// varibale of that return type
		signupConfirmPassPage = signupPasswordPage.createSignupPassowrd();
		
		// using JS Executor to get title and change color
		// signupPasswordPage.getTitleSignupPassowrdPage();
		// signupPasswordPage.chnageColorSignupPassowrdPage();
		
		// wait method
		TestBase.waitAfterAction();
	}

	@AfterMethod // run after each method
	public void tearDown() {
		driver.quit();
	}

}
