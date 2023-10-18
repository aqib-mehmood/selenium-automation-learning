package testng_cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest     	// run before any test method
	public void Method0() {
		System.out.println("Before Test Method");
	}

	@AfterTest 			// run after test methods
	public void afterTest() {
		System.out.println("After Test Method");
	}
	
	
	@Test
	public void Method1() {
		System.out.println("Method 1");
	}
	
	@Test(priority = 1, description = "This is a demo TestNg")  // run before priority 2 method
	public void Method2() {
		System.out.println("Method 2");
	}
	
	@Test(priority = 2)
	public void Method3() {
		System.out.println("Method 3");
	}
	
	@BeforeMethod
	public void beforeEach() {
		System.out.println("Before each Test Method");
	}
	
	@AfterMethod
	public void afterEach() {
		System.out.println("After each Test Method");
	}
}
