package testng_cases;

import java.lang.reflect.Constructor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListner implements IAnnotationTransformer {

	// In order to overcome this we can use the same Retry class and one
	// RetryListner Class.

	// Implement the following method
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor) {
		annotation.setRetryAnalyzer(RetryTestCase.class);
	}

	// Now that's it. You can now use it in testng.xml. Just add the listner and the class you want to listen.
	/* 
	 * <listeners> <listener
	 * class-name="./src/test/java/testng_cases/RetryListner.java"></listener>
	 * </listeners>
	 */

}
