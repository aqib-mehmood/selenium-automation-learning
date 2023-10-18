package demo_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	public static String expected_url = "https://www.saucedemo.com/inventory.html";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// visiting the site
		driver.get("https://www.saucedemo.com/");

		// entering the user name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// entering the password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// clicking the login button
		driver.findElement(By.id("login-button")).click();

		// waiting
        // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		Thread.sleep(50000);
        
		// comparing result
		String current_url = driver.getCurrentUrl();
		System.out.println("Current URL: " + current_url);
		System.out.println("Expected URL: " + expected_url);

		if (current_url.equals(expected_url)) {
			System.out.println("Logged in Successfully");
		} else {
			System.out.println("Logged in Failed...Try again!");
		}

		// close the browser
		driver.quit();
	}

}
