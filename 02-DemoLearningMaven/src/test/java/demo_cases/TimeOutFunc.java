package demo_cases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Iterators;

public class TimeOutFunc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.unipilot.io/");

		/*
		 * Explicit wait - in Selenium WebDriver with Java is used to wait for a
		 * specific condition to be met before executing the next step in the script.
		 * The "WebDriverWait" class is used to set explicit waits in Selenium.
		 */

		/*
		 * An implicit wait in Selenium WebDriver with Java is used to set a default
		 * waiting time for the entire session.
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 */

		// deprecated
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

		// Example Implicit wait in selenium - working fine
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // global
		String text = driver.findElement(By.xpath("//*[contains(text(), 'USDC/ETH')]")).getText();
		System.out.println(text);

		/*
		 * Example Explicit wait in selenium - working fine
		 */

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'USDC/ETH')]")));

		// using manage() methods, maximize the browser window
		driver.manage().window().maximize();

		// wait
		Thread.sleep(3000);

		// quit browser
		driver.quit();

	}

}
