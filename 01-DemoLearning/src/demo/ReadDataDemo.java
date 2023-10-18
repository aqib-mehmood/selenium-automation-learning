package demo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// How to read data from Java property files?
		// First - you have to create a file like testdata.properties	
		// Add the test data in a key value pair format in a file.
		
		// Secondly - create an object of the FileReader class where you want to read
		// the data. Alternatively you can also create an object of the FileInputStream
		// class and rest of the procedure will be the same.
		// from the above step.
		
		//FileReader fr = new FileReader("D:\\XORD\\Eclipse\\DemoLearning\\src\\demo\\testdata-demo.properties"); // you can specify the complete path of the file
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\demo\\testdata-demo.properties"); // you can use the system get property method as well.
		// System.out.println(System.getProperty("user.dir"));
		
		// we can use file input stream for reading the file data
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\demo\\testdata-demo.properties");
		
		// Thirdly - create an object of properties class
		Properties pr = new Properties();
		
		// Fourth - load the file using properties object
		pr.load(fis);
		
		// Fifth - use getproperty method to get the properties of the file that was
		// created in the first step.
		System.out.println(pr.getProperty("company", "Not Found"));
		 
	}

}
