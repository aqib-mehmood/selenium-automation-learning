package demo;

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("Welcome to Java Learning");

		// Comments in Java
		// this is a single line comment
		/*
		 * This is a multi-line comments
		 */

		// Ternary operator
		// String result = (5 > 4) ? "Five is greater than 4" : "Hello";
		// System.out.println(result);

		// While loop - use this when you don't know the number of iteration

		// for loop - use this when you know the number of iteration

		// static method - the advantage of static method is that you don't have to
		// create an object of the class, you can called them directly.

		// Access modifier for class are only public, abstract and final

		// Inheritance: Class inherit another class and interface inherit interface use
		// extends keyword
		// Class inherit interface use keyword implements

		// Abstract method - without body or implementation, needs to be implemented by
		// the child class.

		// Interface have all the abstract methods by default so don't have to specify
		// the abstract keyword
		// You cannot create an instance or object of the abstract and interface because
		// they don't have concrete methods.

		// Constructor in Java - we can define constructor explicity and if there is no
		// constructor then java can define a constructor without any argument on its
		// own

		// Super keyword - is used to access the variable and methods of the parent
		// class
		// This is a reference variable and used to refer the immediate parent
		// object. This means if you have access to the parent class object you can
		// access variables and methods and all other things etc.

		// This keyword - is a reference variable and used to refer the current class
		// object
		// Let say we have two variables are of same name and one of them is a property
		// of the class and the other is defined in the specific method. So if you want
		// to change call the property of the class you have to use this keyword to
		// access that variable.

		// Final keyword - restrict the user to re-assign or change the value of the
		// variable.
		// For the method to be final - the final method cannot be override.
		// For the class to be final - any other class cannot inherit the final class.

		// try - catch - finally
		// put the executable code in try and catch the error in catch block by using
		// the Throwable object and then put the code that you want to execute further
		// in the final block. The final block will always execute either the exception
		// occurs or not.

		// How to read data from property files?
		// First - you have to create a file like testdata.properties
		// Add the test data in a key value pair format in a file.
		// Secondly - create an object of the FileReader class where you want to read
		// the data. Alternatively you can also create an object of the FileInputStream
		// class and rest of the procedure will be the same.
		// from the above step.
		// Thirdly - create an object of properties class
		// Fourth - load the file using properties object
		// Fifth - use getproperty method to get the properties of the file that was
		// created in the first step.

		// How to write in Java property files?
		// First - you have to create a file like testdata.properties
		// Add the test data in a key value pair format in a file.
		// Secondly - create an object of the FileWriter class from where you want to
		// write
		// the data. Alternatively you can also create an object of the FileOutputStream
		// class and rest of the procedure will be the same.
		// from the above step.
		// Thirdly - create an object of properties class
		// Fourth - use setproperty method to set the properties of the file
		// Fifth - call the store method

		// Selenium Webdriver Architecute:
		// Wedriver is an interface that contain all the common methods that will be
		// used by the specific browser like chrome, firefox etc.
		// All browsers explicitly implement the webdriver interface and implement the
		// methods inside it.
		// Now in our test files we can create an object of the specific browser and
		// call the methods.

	}

}
