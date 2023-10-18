package com.sonarwallet.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.sonarwallet.qa.utils.TestUtils;
import com.sonarwallet.qa.utils.WebEventListner;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	@SuppressWarnings("deprecation")
	public static EventFiringWebDriver e_driver;
	public static WebEventListner eventListener;

	public TestBase() {
		try {

			// initilization of properties class
			prop = new Properties();

			// using fip to open the file
			FileInputStream fip = new FileInputStream("./src/main/java/com/sonarwallet/qa/configs/config.properties");
			prop.load(fip);
			
			// using the below code to read file in JAR file - not working don't know why.
//			prop = new Properties();
//			InputStream fip = TestBase.class.getClassLoader().getResourceAsStream("./src/main/java/com/sonarwallet/qa/configs/config.properties");
//			prop.load(fip);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// this is an initilization method
	@SuppressWarnings("deprecation")
	public static void initialization() {
		// checking the browser name set in property file
		String browserName = prop.getProperty("browser");

		// conditioning on browser name
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("FireFox")) {
			// System.setProperty("webdriver.gecko.driver",
			// "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");
			driver = new FirefoxDriver();
		}

		
		// Web event listener deprecated - but still can use it
		// This will use for logging purpose on each action
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with
		// EventFiringWebDriver
		eventListener = new WebEventListner();
		e_driver.register(eventListener);
		driver = e_driver;

		
		
		
		// maximizing the window
		driver.manage().window().maximize();

		// deleting all cookies on each time browser opens
		driver.manage().deleteAllCookies();

		// adding the implict wait for page loading
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.PAGE_LOAD_TIMEOUT)); // global

		// adding the implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtils.IMPLICIT_WAIT)); // global

		// getting the URL from config.propert file
		driver.get(prop.getProperty("url"));

		// handle basic auth - only password field alert
		driver.switchTo().alert().sendKeys(prop.getProperty("auth_password"));
		driver.switchTo().alert().accept();

	}

	// call this method for waiting for sometime after action
	public static void waitAfterAction() {
		try {
			Thread.sleep(TestUtils.WAIT_AFTER_ACTION);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
