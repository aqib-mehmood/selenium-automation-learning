package com.sonarwallet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sonarwallet.qa.base.TestBase;

public class SecurityDisclaimerPage extends TestBase {
	
	// Page Factory:
	@FindBy(xpath = "//div[contains(text(), 'I’ve read and understand the risks')]")
	WebElement securityDisclaimerButton;


	// Initializing the Page Objects:
	public SecurityDisclaimerPage(){
			PageFactory.initElements(driver, this);
		}

	// Actions:
	public SignupPasswordPage acceptSecurityDisclaimer() {		
		securityDisclaimerButton.click();
		
		// here returning the SignupPasswordPage - because the page become next to this is signup password
		return new SignupPasswordPage();
		
	}

}
