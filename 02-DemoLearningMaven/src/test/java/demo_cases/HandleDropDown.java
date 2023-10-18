package demo_cases;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		// This will show different ways to handle different types of drop down.
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/eu/form/signup/freetrial-sales-pe/");

		/*
		 * In order to select the option there are different ways to select that because
		 * of the different nature of the drop-down. We can select an option from the
		 * drop-down by using the css selectors as well as selenium select class
		 * commands.
		 */

		/*
		 * Lets use the select class First select the drop down and then use the options
		 * to select one.
		 */
		WebElement emp_dropdown = driver.findElement(By.name("CompanyEmployees"));
		Select select = new Select(emp_dropdown);

		// In order to know the default selected option
		WebElement firstSelected = select.getFirstSelectedOption();
		System.out.println("First Selected Option: " + firstSelected.getText());

		// select the option by value attribute
		select.selectByValue("15");

		//
		Thread.sleep(1000);
		select.selectByIndex(8);

		//
		Thread.sleep(1000);
		select.selectByVisibleText("1,000 - 1,999 employees");

		/*
		 * Now lets see how to handle: multi select list option
		 */
		// List<WebElement> listed_items = select.getAllSelectedOptions();
		// System.out.println(listed_items);

		
		
		/*
		 * How to Handle Auto Suggestion Drop down
		 */
		driver.navigate().to("https://www.tripadvisor.com/Hotels-g293959-Pakistan-Hotels.html");
		driver.findElement(By.xpath("//input[@type='search' and @name='q']")).sendKeys("Karachi");
		//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='search' and @name='q']")).sendKeys(Keys.ARROW_DOWN);
		//
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='search' and @name='q']")).sendKeys(Keys.ENTER);
		
		
		//
		Thread.sleep(5000);

		// quit browser
		driver.quit();

	}

}
