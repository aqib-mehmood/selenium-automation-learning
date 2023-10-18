package demo_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//
		Thread.sleep(2000);
		/*
		 * How to handle Alerts in selenium: we can use switchto() method for switching
		 * between the parent window and alerts.
		 */
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

		// clicking the cancel button
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();

		// clicking the confirm button
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(1000);

		//
		Thread.sleep(3000);

		// quit browser
		driver.quit();

	}

}
