package demo_cases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Iterators;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		// using manage() methods, maximize the browser window
		driver.manage().window().maximize();

		// go to the specific url
		driver.navigate().to("https://www.ebay.com/");
		
		// How to handle mouse hover
		WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		
		// call the action methods and always call the perform method
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		// 
		Thread.sleep(3000);

		// quit browser
		driver.quit();

	}

}
