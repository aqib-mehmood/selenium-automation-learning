package demo_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		//
		Thread.sleep(2000);
		/*
		 * How to handle Frames in selenium:
		 * we can use switchto() method for switching between iframes.
		 */
		
		driver.switchTo().frame("iframeResult");
		String heading_text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(heading_text);
		System.out.println(driver.getTitle());
		
		// switch to another iframe 
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		//
		Thread.sleep(3000);

		// quit browser
		driver.quit();

	}

}
