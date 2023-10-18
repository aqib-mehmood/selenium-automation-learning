package com.sonarwallet.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sonarwallet.qa.base.TestBase;
import com.sonarwallet.qa.utils.JsExecutor;

public class SignupPasswordPage extends TestBase {

	public JsExecutor jsExecutor = new JsExecutor(driver);

	// Page Factory:
	@FindBy(id = "passwords-step2-input")
	WebElement passwordCreationField;

	@FindBy(id = "passwords-step3-input")
	WebElement passwordConfirmationField;

	@FindBy(id = "step4-savePassword")
	WebElement okLetsGoButton;
	//

	// Initializing the Page Objects:
	public SignupPasswordPage() {
		PageFactory.initElements(driver, this);
	}

	// getting title using JS Executor
	public void getTitleSignupPassowrdPage() {
//		jsExecutor = new JsExecutor(driver);
		String title = jsExecutor.getTitleByJS();
		System.out.println("Title of the Page: " + title);
	}

	// Actions:
	public SignupConfirmPasswordPage createSignupPassowrd() {
		passwordCreationField.sendKeys(prop.getProperty("login_password"));
		passwordCreationField.sendKeys(Keys.ENTER);

		// Uncomment below two lines to see the change color using js executor
		passwordConfirmationField.sendKeys(prop.getProperty("login_password"));
		passwordConfirmationField.sendKeys(Keys.ENTER);

		// here returning the SignupConfirmPasswordPage - because it is the next page
		// that comes after current.
		return new SignupConfirmPasswordPage();
	}

	// highlight the color of the element using JS Executor
	public void chnageColorSignupPassowrdPage() {
		jsExecutor.flash(okLetsGoButton);
	}

}
