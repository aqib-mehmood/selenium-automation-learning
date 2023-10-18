package demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// How to write in Java property files?
		// First - you have to create a file like testdata.properties
		// Add the test data in a key value pair format in a file.
		// Secondly - create an object of the FileWriter class from where you want to
		// write
		// the data. Alternatively you can also create an object of the FileOutputStream
		// class and rest of the procedure will be the same.
		// from the above step.

		// you can specify the complete path of the file
		// FileWriter fr = new
		// FileWriter("D:\\XORD\\Eclipse\\DemoLearning\\src\\demo\\testdata-demo.properties");

		// inorder to append the data to the existing file use "true"
		// FileWriter fr = new FileWriter(System.getProperty("user.dir") + "\\src\\demo\\testdata-demo.properties", true);
		// System.out.println(System.getProperty("user.dir"));

		// we can use file output stream for reading the file data
		FileOutputStream fos = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\demo\\testdata-demo1.properties", true);

		// Thirdly - create an object of properties class
		Properties pr = new Properties();

		// Fourth - use setproperty method to set the properties of the file
		pr.setProperty("Qualification", "Software Graduate");

		// Fifth - call the store method
		pr.store(fos, "File Created");
	}

}
