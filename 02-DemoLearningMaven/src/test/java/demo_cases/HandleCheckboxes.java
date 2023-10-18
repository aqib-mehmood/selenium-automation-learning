package demo_cases;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		//
		Thread.sleep(2000);
		/*
		 * How to handle check boxes: Simply check boxes can be selected using the click
		 * method
		 */
		
		
		// Scrolling down to focus the check box on screen.
		WebElement button_focus  = driver.findElement(By.xpath("//input[@value='Request a Demo']"));
		Actions action = new Actions(driver);
		action.moveToElement(button_focus);
		Thread.sleep(2000);
		
		
		// checking the check box by using id
		driver.findElement(By.id("doi0")).click();
		//
		Thread.sleep(2000);
		
		// unchecking the check box by using id
		driver.findElement(By.id("doi0")).click();

		//
		Thread.sleep(3000);

		// quit browser
		driver.quit();

	}

}
