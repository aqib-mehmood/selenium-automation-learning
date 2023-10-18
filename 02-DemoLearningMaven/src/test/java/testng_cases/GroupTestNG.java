package testng_cases;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GroupTestNG {

	/*
	 * Grouping in testng: In order to make test method a group just use the param
	 * groups in @Test(groups= "regression") In order to run use the Run-> Run
	 * Configuration -> select group you want to run
	 */

	@Test(groups = "regression")
	public void method0() {
		System.out.println("This is Method 0 -  regression");
	}

	@Test(groups = "regression")
	public void method1() {
		System.out.println("Method 1 -  regression");
	}

	@Test(groups = "bvt")
	public void method2() {
		System.out.println("Method 2 - bvt");
	}

	@Test(groups = {"bvt", "regression"})
	public void method3() {
		System.out.println("Method 3 - bvt and regression");
	}
}
