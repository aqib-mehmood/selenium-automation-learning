package testng_cases;

import org.testng.annotations.Test;

public class DemoTestNg {

	@Test
	public void TestNgDemo() {
		System.out.println("TestNG Demo");
	}
	
	@Test(priority = 1, description = "This is a demo TestNg")
	public void Method2() {
		System.out.println("TestNG Demo");
	}
}
