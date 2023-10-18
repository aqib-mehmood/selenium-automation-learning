package demo_cases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterators;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		// using manage() methods, maximize the browser window
		driver.manage().window().maximize();

		// go to the specific url
		driver.navigate().to("https://www.salesforce.com/eu/form/signup/freetrial-sales-pe/");

		// return list of all the elements of the same id, class etc.
//		List<WebElement> webelements = driver.findElements(By.cssSelector("select[id^='CompanyEmp']>option"));
//		System.out.println(webelements);

		// getWindowHandle() - return the handle of the current window or tab and it is
		// used to switch between tabs.
//		String parent_window_handle = driver.getWindowHandle();
//		System.out.println("Parent Window Handle: "+ parent_window_handle);

		//
//		Thread.sleep(1000);

		// getWindowHandles() - return the handle of all the tabs & used to switch
		// between tabs.
		driver.findElement(By.cssSelector("img[alt^='Trus']")).click();
		
		// now we have two window handles
		Set<String> window_handles = driver.getWindowHandles();
		System.out.println("All window handles: "+window_handles);
		
		String parent_window_handle = driver.getWindowHandle();
		
		// Now change focus to the new open window/tab
		Iterator<String> iterator = window_handles.iterator();
		String parent_window = iterator.next();
		String child_window = iterator.next();
		
		driver.switchTo().window(child_window);
		System.out.println("Title of Child Page: "+ driver.getTitle());
		
		// switch back to parent window
		driver.switchTo().window(parent_window);
		System.out.println("Title of Parent Page: "+ driver.getTitle());
		
		
		// 
		Thread.sleep(3000);

		// quit browser
		driver.quit();

	}

}
