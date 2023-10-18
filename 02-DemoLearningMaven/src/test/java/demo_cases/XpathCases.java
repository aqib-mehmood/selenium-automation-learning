package demo_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCases {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/eu/form/signup/freetrial-sales-pe/");

		// using relative xpath for finding elements
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Relative Xpath");
		// using full xpath for finding elements
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/input"))
				.sendKeys("Full xpath");

//		Thread.sleep(20000);

		/*
		 * X-Path Function start-with This is very helpful in finding the dynamic dom
		 * elements like the case was in material UI that the class changes on every
		 * time. Syntax: xpath = //tagname[starts-with(@attribute, 'value')]
		 */
		driver.findElement(By.xpath("//input[starts-with(@name, 'UserFirstName')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name, 'UserFirstName')]")).sendKeys("Start With");
		Thread.sleep(3000);
		/*
		 * X-Path Function Contain(): This is also helpful in finding the dynamic dom
		 * elements like the case was in material UI that the class changes on every
		 * time. Syntax: xpath = //tagname[contains(@attribute, 'value')]
		 */
		driver.findElement(By.xpath("//input[contains(@name, 'UserFirst')]")).clear();

		/*
		 * X-Path Function text(): This method is useful in finding the element by using
		 * the text showing on the front end of that element. Syntax: xpath =
		 * //tagname[text()='original text value']
		 */
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Start my free trial']")).click();

		/*
		 * We can use and/or in xpath attribute when we want to find out the element
		 * using two attribute. Syntax: xpath = //tagname[@attribute='value'
		 * and @attribute='value'] xpath = //tagname[@attribute='value'
		 * or @attribute='value']
		 */
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email' and @required='true']")).sendKeys("combine@double.com");
		
		
		// wait
		Thread.sleep(5000);
		
		// quit browser
		driver.quit();

	}

}
