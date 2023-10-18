package testng_cases;

import org.testng.annotations.Test;

public class DataProvider {

	/*
	 * Data Provider in TestNG: TestNG library provides @DataProvider annotation
	 * which is used to mark a method as supplying data for a test method. We can
	 * use the dataprovider method in test method
	 * like @Test(dataprovider="MethodName") or @Test(dataprovider="providerName")
	 */

	// First we can use @DataProvider in the form of array

	@org.testng.annotations.DataProvider
	public Object[][] dataSet1() {
		// we need to use the object array for providing data set
		Object[][] dataset = new Object[2][2];

		// now assign value to each array index

		// first row
		dataset[0][0] = "username0";
		dataset[0][1] = "password0";

		// second row
		dataset[1][0] = "username1";
		dataset[1][1] = "password1";

		// return the object
		return dataset;
	}

	// We can also use @DataProvider in the form of object

	@org.testng.annotations.DataProvider(name = "datasetno2")
	public Object[][] dataSet2() {
		// we need to use the object for providing data set
		return new Object[][] { { "username3", "password" }, { "username4", "pasword3" } };

	}

	// Secondly, we can use/call the data set in any method like below

	@Test(dataProvider = "dataSet1")
	public void testMethod1(String username, String password) {

		System.out.println("Username = " + username + "Pass= " + password);
	}

	// we can also call the data provider by the below method
	@Test(dataProvider = "datasetno2")
	public void testMethod2(String username, String password) {
		System.out.println("Username = " + username + "Pass= " + password);
	}

	/*
	 * we can also seperate the data provider class and then use @Test(dataProvider
	 * = "datasetno2", dataProviderClass = DataProvider.class)
	 */

}
