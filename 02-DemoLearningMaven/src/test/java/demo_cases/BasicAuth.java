package demo_cases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Iterators;

public class BasicAuth {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// Handle basic authentication
		// handle both username & password field
		// driver.navigate().to("https://username:password@app.de-mi.io/");
		
		// handle only password field alert
		driver.get("https://app.de-mi.io/");
		driver.switchTo().alert().sendKeys("bullionfxstaking");
		driver.switchTo().alert().accept();
		
		// using manage() methods, maximize the browser window
		driver.manage().window().maximize();

		// timeout
		Thread.sleep(3000);

		// quit browser
		driver.quit();

	}

}
