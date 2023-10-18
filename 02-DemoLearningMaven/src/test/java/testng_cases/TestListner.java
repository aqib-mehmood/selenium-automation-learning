package testng_cases;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestNGUtils;

public class TestListner extends TestNGUtils implements ITestListener {
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is - "+result.getName());
	}
	 
	public void onTestFailure(ITestResult result) {
		Reporter.log("Failure result - "+result.getStatus());
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("Skip due to - "+result.getSkipCausedBy());
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Success Result - "+result.isSuccess());
	}

}
