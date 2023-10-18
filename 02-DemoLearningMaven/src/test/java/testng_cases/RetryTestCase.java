package testng_cases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestCase implements IRetryAnalyzer {

	// In selenium we can re-try a test case to again run a failed test case
	
	// For that purpose this is a class in which we have defined the re-try mechanism

	
	private int retryCount = 0;
	private static final int maxRetryCount = 3; // max num of retry

	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
	
	// Now in order to re-try any test case you can go to particular test case and use this class 
	// @Test(retryAnalyzer=className)
	

}
