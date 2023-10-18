package demo_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElementHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// visiting the site
		driver.get("http://watir.com/examples/shadow_dom.html");

		/*
		 * // handling simple shadow element // the below line is used to get the shadow
		 * host element SearchContext shadowElement =
		 * driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot();
		 * 
		 * // this will get the content of the shadow element WebElement shadowContent =
		 * shadowElement.findElement(By.cssSelector("#shadow_content"));
		 * 
		 * // System.out.println("Shadow Element: " + shadowContent.getText());
		 */

		// handling nested shadow element
		// the below line is used to get the shadow host element
		SearchContext nestedShadowElement = driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot()
											.findElement(By.cssSelector("#nested_shadow_host")).getShadowRoot();
											

		// this will get the content of the nested shadow element
		WebElement nestedShadowContent = nestedShadowElement.findElement(By.cssSelector("#nested_shadow_content"));

		//
		System.out.println("Nested Shadow Element Content: " + nestedShadowContent.getText());

		// waiting
		Thread.sleep(5000);

		// close the browser
		driver.quit();
	}

}
