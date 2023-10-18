package testng_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.opentelemetry.api.logs.Logger;

public class AssertionTestNg {

	@Test
	public void AssertDemo() {
		// logger using log4j
		org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AssertionTestNg.class);
		log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++ Just started the Loggin +++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		WebDriver driver = new ChromeDriver();

		/*
		 * Assertions in TestNG: Hard assertion - if the assertion failed the script
		 * won't execute further. Soft assertion - the script will execute further even
		 * if the assertion failed.
		 * 
		 */

		driver.get("https://testng.org/doc/documentation-main.html");

		String expectedValue = "TestNG x";
		String actualValue = driver.getTitle();

		// Example of Hard Assertions
		// Assert.assertEquals(actualValue, expectedValue, "This messgae will show on
		// failed assertion");
		// System.out.println("Test Executed");

		// Example of Soft Assertions
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualValue, expectedValue, "This messgae will show on failed assertion");
		
		System.out.println("Test Executed");

		driver.close();
		
		softassert.assertAll(); // use this for correct failed result. try to put this at the end.
	}
}
