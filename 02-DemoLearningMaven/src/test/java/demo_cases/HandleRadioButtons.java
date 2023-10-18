package demo_cases;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jobs.lever.co/sugarcrm/0296e111-be08-4153-8586-1450971d9439/apply");
		driver.manage().window().maximize();
		//
		Thread.sleep(2000);
		/*
		 * How to handle radio buttons in selenium: It very simple just select the radio
		 * button and perform a click function.
		 * 
		 */

		// selecting the radio button by using css selector chain method
		driver.findElement(By.cssSelector("input[name$='[field0]'][value='Yes']")).click();
		//
		Thread.sleep(2000);

		// selecting the radio button by using css selector chain method
		driver.findElement(By.cssSelector("input[name$='[field2]'][value='No']")).click();

		//
		Thread.sleep(3000);

		// quit browser
		driver.quit();

	}

}
