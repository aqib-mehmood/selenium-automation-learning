package demo_cases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoMaven {

	public static void main(String[] args) throws InterruptedException {
		// chrome webdriver related code
//		System.setProperty("webdriver.chrome.driver", "D:\\XORD\\Eclipse\\00-BrowserDriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		// firefox/gecko webdriver related code
//		System.setProperty("webdriver.gecko.driver", "D:\\XORD\\Eclipse\\00-BrowserDriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		// Edge webdriver related code
//		System.setProperty("webdriver.edge.driver");
		
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
				
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
