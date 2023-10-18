package demo_cases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintURLs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");

		/*
		 * How to Print all Links of a Web page
		 * First find element by tag "a".
		 * Then save it in a list of web elements.
		 * Then using for loop print the value of each url.
		 */
		
		// getting all the tags
		 List<WebElement> alltags = driver.findElements(By.tagName("a"));
		 System.out.println("Total Number of anchor tags found: "+ alltags.size());
		 
		 // iterating over each tag and getting url
		 for (int i = 0; i < alltags.size(); i++) {
			// getting URL
			System.out.print("URL: "+alltags.get(i).getAttribute("href"));
			
			// getting text
			System.out.println(" ---> "+alltags.get(i).getText());
		}
		
		//
		Thread.sleep(5000);

		// quit browser
		driver.quit();

	}

}
