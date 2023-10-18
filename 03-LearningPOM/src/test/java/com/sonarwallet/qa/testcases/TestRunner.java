package com.sonarwallet.qa.testcases;

import org.testng.TestNG;

public class TestRunner {

	static TestNG testNg;
	public static void main(String[] args) {
		
		// creating testng object
		testNg = new TestNG();
		
		// now call the test classes
		testNg.setTestClasses(new Class[] {SecurityDisclaimerTest.class, SignupPasswordTest.class});
		
		// run testng classes
		testNg.run();
		
		
		
		

	}

}
