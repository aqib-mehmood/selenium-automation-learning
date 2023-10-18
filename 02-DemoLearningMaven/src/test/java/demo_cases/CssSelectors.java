package demo_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) throws InterruptedException {
		// CSS selectors - are used to target the html element on a web page

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/eu/form/signup/freetrial-sales-pe/");

		// using css selector
		driver.findElement(By.cssSelector("input[name='UserPhone']")).sendKeys("0123456789");
		// we can also use "input#id" for id, "input.classname" for class

		// We can also use multiple selectores like
		// input#id[type='text'][name='fieldname']
		driver.findElement(By.cssSelector("input[type='text'][name='CompanyName']")).sendKeys("Xord");

		/*
		 * Sub string matches - Sub string matches are useful in finding the dynamic
		 * html element in web pages. Three important special character in sub string
		 * matching are: "^" sign - match prefix - tagname[attribute^='starting_value']
		 * "$" sign - match suffix - tagname[attribute$='ending_value'] "*" sign - match
		 * sub-string - tagname[attribute^='matching_value']
		 */
		// "^" sign - match prefix
		driver.findElement(By.cssSelector("input[id^='CompanyName']")).clear();
		driver.findElement(By.cssSelector("input[id^='CompanyName']")).sendKeys("StartWith");

		// "$" sign - match suffix
		driver.findElement(By.cssSelector("input[name$='Title']")).clear();
		driver.findElement(By.cssSelector("input[name$='Title']")).sendKeys("EndWith");

		// "*" sign - match sub-string
		driver.findElement(By.cssSelector("input[id*='CompanyNa']")).clear();
		driver.findElement(By.cssSelector("input[id*='CompanyNa']")).sendKeys("MatchingString");

		/*
		 * Direct Child Selection like handling drop down Child combinator (>) is used
		 * to select the direct child. select[id^='CompanyCountry'] >
		 * option[value*='AF'] This (>) symbol is used to access only the immediate or
		 * direct child not the sub-child.
		 */
		driver.findElement(By.cssSelector("select[id^='CompanyCountry'] > option[value*='AF']")).click();

		/*
		 * Descendent combinator ( ) is used to select the child or sub-child.
		 * form[name^='signup_form'] input[id^='UserFirstName'] We can select direct
		 * child or any sub-child with the help of this combinator.
		 */
		driver.findElement(By.cssSelector("form[name^='signup_form'] input[id^='UserFirstName']")).sendKeys("test");

		/*
		 * Next Sibling: We can find the immediate next sibling (should be child of the
		 * same parent) using the sibling combinator (+). option[value='3']+option -
		 * will select the immediate next option
		 */
		driver.findElement(By.cssSelector("option[value='3']+option")).click();

		/*
		 * Selenium Css selector Pseudo Classes.-- first-child - Return the first
		 * element from the group of sibling elements. -- last-child - Return the last
		 * element from the group of sibling elements. -- nth-child() - Return the nth
		 * element from the group of sibling element, counting from first element. --
		 * nth-last-child() - Return the nth element from the group of sibling elements,
		 * counting from the last element.
		 * 
		 */
		// first-child
		driver.findElement(By.cssSelector("select[id^='CompanyEmp'] :first-child")).click();
		Thread.sleep(2000);

		// last-child
		driver.findElement(By.cssSelector("select[id^='CompanyEmp'] :last-child")).click();
		Thread.sleep(2000);

		// nth-child(4)
		driver.findElement(By.cssSelector("select[id^='CompanyEmp']>:nth-child(4)")).click();
		Thread.sleep(2000);

		// nth-last-child(3)
		driver.findElement(By.cssSelector("select[id^='CompanyEmp']>:nth-last-child(3)")).click();

		//
		Thread.sleep(5000);

		// quit browser
		driver.quit();

	}

}
