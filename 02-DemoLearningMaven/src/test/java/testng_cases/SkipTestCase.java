package testng_cases;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SkipTestCase {

	/*
	 * Skip Test Case: In order to skip the test case to not include it in the test
	 * execution we can do the following things: -- 
	 */

	// First we can use @Test(enabled=false).
	@Test(enabled = false)
	public void method0() {
		System.out.println("Skipping this test case 1");
	}

	// Secondly, we can throw new skipException("Skipping this test").

	@Test
	public void method1() {
		System.out.println("Skipping the test case 2");
		throw new SkipException("Skipping this test case");
	}

//	Thirdly, we can use the boolean variable and then use the if else to see if the certain condition meet and t0hen execute the test case or skip it on the basis of boolean result.

	@Test
	public void method2() {
		System.out.println("Skipping the test case using if-else");

	}

}
