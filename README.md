Selenium Learning

What is Selenium:
================
--Automation tool only for web based applications. 
--Selenium is an API for automating the web based applications.
--We can also say its a setup of libraries.

Q: What is selenium API?
=======================
A: It is a set of libraries, various classes and methods inside it. Which we can import to our project, and access method functionality and libraries in our project.


Slenium benefits:
=================
--Selenium is an open source
--Selenium has multiple browser support for automation
--Selenium has Multi language support for automation

Q: In which language we can write an automation script for different language based applications?
=================================================================================================
--Selection of language for writing automation script is not dependent on the technology of applications. 
--So if the application is developed in python we can write automation script in any language.

Q: Why Selenium + Java?
=======================
--Selemium was first developed using java.
--Java support cross platforms
--80% automation engineers use java with selenium to automate
--Java has stable libraries
--Selenium + Java community has very strong


Selenium WebDriver:
=====================
- Selenium webdriver basically cross-platform testing framework ha jo k browser ko OS level sy control kr skta ha.

How Selenium WebDriver Works:
==============================
On a high-level, Selenium WebDriver works in three steps:
-- Test commands are converted into an HTTP request by the JSON wire protocol.
-- Before executing any test cases, every browser has its own driver which initializes the server.
-- The browser then starts receiving the request through its driver.


Selenium Webdriver Architecute:
===============================
-- Wedriver is an interface that contain all the common methods that will be used by the specific browser like chrome, firefox etc.
-- All browsers explicitly implement the webdriver interface and implement the methods inside it.
-- Now in our test files we can create an object of the specific browser and call the methods.


Selenium WebDriver code using Maven - POM Dependency:
=====================================================
-- Maven is a powerful project management tool that is based on POM (project object model).
-- Helping to download dependencies, which refers to the libraries or JAR files. 
-- For using this create a maven project not java.

-- While creating a maven project skip the archetype selection for creating a simple project.
-- If you want to add a archetype then select org.apache.maven.archtype - quickstart.

-- After creating the project click or open the pom.xml file present at root level.
-- Add selenium webdriver maven dependencies from the internet like below:
	<dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.6.0</version>
		</dependency>
	</dependencies>
-- Now if you want to open the chrome browser just download the chrome webdriver and add them in the code.
-- The download and configuration in maven project is cover seperately.


How to Setup Selenium WebDriver in Eclipse IDE:
================================================
-- First of all download the selenium webdriver for chrome.
-- Now as we have added the dependency before this step so there is no need to add the selenium standalone server jar file.
-- Now create a class and directly create an object of webdriver and use the chrome browser.
-- Note: If the latest browser driver is not working then use the previous one.
-- But in selenium 4.6 onward there is no need to download the browser drivers.


Web Driver Manager: https://bonigarcia.dev/webdrivermanager/
===================
-- Automated driver management and other helper features for Selenium WebDriver in Java
-- It is useful as we don't have to manage all the web driver seperately. 
-- Just add the dependency in pom.xml file and its all.
-- Now call any web driver using the WebDriverManager.chromedriver().setup(); same for other browsers.
Note: the web driver manager is now integrated by default in the selenium 4.6 as we don't have to specify the path of the webdriver and the selenium itself manage this.
-- Selenium Manager: Beta 1 of Selenium Manager will configure the drivers for Chrome, Firefox, and Edge if they are not found on the PATH. No extra configuration is needed. Future releases of Selenium Manager will eventually even download browsers if necessary.

How to Write First TestCase in Selenium:
========================================
-- Practice site = https://www.saucedemo.com
-- Just write the test case for login module.


What are Locators in Selenium WebDriver:
========================================
-- https://www.selenium.dev/documentation/webdriver/elements/locators/
-- A locator is a way to identify elements on a page.

Relative Locators: 
------------------
-- If there is a field that is not locatable then we can use relative locators that will help to find the nearby element.
-- There are number of relative locators like Above, Below, Left of, Right of, Near etc.


XPath:
======
-- The basic path Syntax is: 
xpath = //tagname[@attribute='Value']

-- Types of XPath: Absoulute and Relative Path.

Absolute XPath: 
---------------
-- It contains the complete path from root element to the desired one.
-- Absolute Xpath start with root node single forward slash (/).
-- Drawback is that any change in one element in the DOM, makes the xpath invalid.

Relative XPath: 
---------------
-- It starts from the mid of the DOM structure.
-- Uses double forward slashes (//).
-- Relative xpath is more useable.

X-Path Functions:
=================
1- Starts-with():
----------------
-- This is very helpful in finding the dynamic dom elements like the case was in material UI that the class changes on  every time.
-- We can use starts-with function to find the element by using the static part of that element.

Syntax:
-- xpath = //tagname[starts-with(@attribute, 'value')]

2- Contain():
------------
-- This is also helpful in finding the dynamic dom elements like the case was in material UI that the class changes on  every time.
-- We can use contain function to find the element by using the static part of that element.

Syntax:
-- xpath = //tagname[contains(@attribute, 'value')]

3- text():
--------
-- This method is useful in finding the element by using the text showing on the front end of that element.

Syntax:
-- xpath = //tagname[text()='original text value']


Use of "and" & "or" in selenium xpath:
=======================================
-- We can use and/or in xpath attribute when we want to find out the element using two attribute.

Syntax:
-- xpath = //tagname[@attribute='value' and @attribute='value']
-- xpath = //tagname[@attribute='value' or @attribute='value']


XPath Axes Methods | Parent, Child, Self:
==========================================
-- It is useful in finding the elments relative to the current element. 
-- Similar to relative locator.

Syntax:
-- //tagname[@attribute='value']//parent::tagname  **select the parent of the current element
-- //tagname[@attribute='value']//child::tagname **select the child of the current element
-- //tagname[@attribute='value']//self::tagname  **select the current element

Axes Method descendant, descendant-or-self:
------------------------------------------
-- https://www.youtube.com/watch?v=Qg-hW_xiVSM&list=PLL34mf651faPB-LyEP0-a7Avp_RHO0Lsm&index=21

Axes Methods | ancestor, ancestor-or-self:
------------------------------------------
-- https://www.youtube.com/watch?v=1_TGzj5X2QU&list=PLL34mf651faPB-LyEP0-a7Avp_RHO0Lsm&index=22


CSS Selector in Selenium:
=========================
-- CSS selectors are used to target the html element on a web page.
Syntax:
-- tagname[attribute='value']
-- We can also use "input#id" for id, "input.classname" for class
-- We can also use multiple selectores like input#id[type='text'][name='fieldname']

sub string:
===========
-- Sub string matches are useful in finding the dynamic html element in web pages.
-- Three important special character in sub string matching are:
- "^" sign - match prefix - tagname[attribute^='starting_value']
- "$" sign - match suffix - tagname[attribute$='ending_value']
- "*" sign - match sub-string - tagname[attribute*='matching_value']


Finding Direct Child or Sub-child Elements:
===========================================
Direct Child:
=============
-- Child combinator (>) is used to select only the direct child.
-- Example: select[id^='CompanyCountry'] > option[value*='PK']
-- This (>) symbol is used to access only the immediate or direct child not the sub-child.

Child or Sub-Child:
===================
-- Descendent combinator ( ) is used to select the child or sub-child.
-- Example: form[name^='signup_form'] input[id^='UserFirstName']
-- We can select direct child or any sub-child with the help of this combinator.

Next Sibling:
=============
-- We can find the immediate next sibling (should be child of the same parent) using the sibling combinator (+).
-- option[value='3']+option - will select the immediate next option. 


Css selector Pseudo Classes:
=============================
First-Child, Last-Child, Nth-Child, Nth-Last-Child:
---------------------------------------------------
-- Selenium Css selector Pseudo Classes.
-- We can use them with the above combinator as well.
-- first-child - Return the first element from the group of sibling elements.
-- last-child - Return the last element from the group of sibling elements.
-- nth-child() - Return the nth element from the group of sibling element, counting from first element.
-- nth-last-child() - Return the nth element from the group of sibling elements, counting from the last element.


First-of-type, Last-of-type, Nth-of-type:
-----------------------------------------
-- first-of-type - Returns the first element of its type among a group of sibling elements
-- last-of-type - Returns the last element of its type among a group of sibling elements
-- nth-of-type() - matches elements of a given type, based on their position among a group of siblings.

Basic Methods in webdriver interface:
=====================================
-- manage() - Manage method is used for basic configration of the window.
-- navigate() - driver.navigate().to("url")
-- findElements(By) - return list of all the elements of the same id, class etc.
-- getWindowHandle() - return the handle of the current window or tab and it is used to switch between tabs.


Handle DropDown in Selenium:
============================
-- There are different types of drop-down in web pages.
-- In order to select the option there are different ways to select that because of the different nature of the drop-down.
-- We can select an option from the drop-down by using the css selectors as well as selenium select class commands.
-- How to Handle Auto Suggestion Drop down: we can do this using keys.keyboard keys.


How to Print all Links of a Webpage:
====================================
-- we can get an anchor tag and then save its attribute href and text by using loop.

How to Handle Checkboxes:
=========================
-- Simply checkboxes can be selected using the click method.
-- 

Web element in focus:
=====================
-- For this purpose we can use the Action class methods.
-- Like we can scroll up/down to the element we want to focus on.

Handle Mouse Hover:
===================
-- for this use action method.


Waits in Selenium:
=================
-- In selenium three types of waits.
-- Implicitly wait - wait for the element to find and then go forward.
-- If the wait is added for 10 min, and let say the element was found in 2 min the wait will be cnnceled and move to next time. 
-- wait in selenium
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // global value


How to Handle Authentication Popup in Selenium:
===============================================
-- Just access the URL in this way:
-- https://username:password@xord.com
driver = webdriver.Firefox()
url = "http://example.com"
username = "myusername"
password = "mypassword"
driver.get(f"http://{username}:{password}@{url}")
-- We can also make the username and password dynamic by saving it in the variable and putting variable in the URL.

If the basic authentication only requires a password and not a username, you can use the following approach:

Create a WebDriver instance and navigate to the URL that requires basic authentication.

Use the "Alert()" class of the WebDriver to switch to the JavaScript alert that appears when the page is loaded.

Use the "send_keys()" method of the Alert class to enter the password in the alert window.

Use the "accept()" method of the Alert class to submit the password and proceed to the page.


Implicitly wait vs Explicitly wait:
===================================
-- An explicit wait in Selenium WebDriver with Java is used to wait for a specific condition to be met before executing the next step in the script. 
-- The "WebDriverWait" class is used to set explicit waits in Selenium.
-- The "until()" method is used to specify the condition to wait for.

-- An implicit wait in Selenium WebDriver with Java is used to set a default waiting time for the entire session.
-- driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


****************************************************************************************************************************
****************************************************************************************************************************
****************************************************************************************************************************

TestNG: alternative to JUnit  [Playlist: https://www.youtube.com/playlist?list=PLL34mf651faMJ3uO8RNEh1GM5uLVXWq2Z]
========
-- TestNG is a testing framework for Java programs, including Selenium WebDriver tests.
-- It provides several annotations to define test methods and test suites. 
-- It also allows you to specify test groups, test dependencies, and data-driven testing. 
-- It also provides the ability to generate reports, prioritize and skip test. 
-- It makes it more powerful and easy to use than JUnit.


How to Install TestNG in Eclipse:
=================================
-- There are multiple ways to install TestNG the one is to add the dependency.
-- The other is to install and add it manually in each project.
-- Last but not the least is to install it from Eclipse marketplace and it will automatically added in each project.


How to Write Test Cases Using TestNG:
=====================================
-- Create a class like logintest.
-- Then create mothods like loginuserA.
-- With that method use @Test and import the libraries related to TestNG.
-- In order to consider each method as a test just add @Test annotation.

-- You can use different annotations listed on below link.
-- https://testng.org/doc/documentation-main.html#annotations


TestNG Annotations:
====================
@BeforeSuite: The annotated method will be run before all tests in this suite have run.
@AfterSuite: The annotated method will be run after all tests in this suite have run.
@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
@BeforeMethod: The annotated method will be run before each test method. (Before each method)
@AfterMethod: The annotated method will be run after each test method. (After each method)


How to Use Assertion in Selenium TestNG:
========================================
-- TestNG library provides the Class Assert which has methods that are used to perform assertions in Selenium TestNG.
-- Reference URL: https://javadoc.io/doc/org.testng/testng/latest/org/testng/asserts/Assertion.html

Soft vs Hard Assertions:
-- Hard assertion - if the assertion failed the script won't execute further.
-- Example of hard assertion: assert.assertEqaul(actual, expected, optional-message).

-- Soft assertion - the script will execute further even if the assertion failed .
-- Soft assertion is important in selenium webdriver automation scenarios where you want to execute your script further even after failed assertions in your test script.
-- Example of soft assertion: Create an object of SoftAssert Class and use this with softassert.assertEqaul() same as hard assert.
-- At the end call the function assertAll()

How to Group Test Cases in TestNG | Grouping:
=============================================
-- TestNG Grouping helps you to categorize your tests into different groups.
-- Just write @Test(groups = "regression-testing") with each test method.
-- In order to run use the Run-> Run Configuration -> select group you want to run

How to Create Test Suite in TestNG:
==================================
-- Lets see how to execute group of test cases.
-- Right click the folder or class you want to convert to testng.
-- Then convert it to test ng.
-- This will create a .xml file as a test suite for you.
-- You can also create a suite in which you can use other suite files.
-- We can also include and exclude the test groups.
  <groups>
    <run>
      <include name="functest"/>
      <exclude name="broken"/>
    </run>
  </groups>

-- Reference: https://www.youtube.com/watch?v=LtuEYvs_Vew&list=PLL34mf651faMJ3uO8RNEh1GM5uLVXWq2Z&index=7


How to Skip Test Cases in TestNG:
==================================
-- In order to skip the test case to not include it in the test execution we can do the following things:
-- First we can use @Test(enabled=false).
-- Secondly, we can throw new skipException("Skipping this test").
-- Thirdly, we can use the boolean variable and then use the if else to see if the certain condition meet and then execute the test case or skip it on the basis of boolean result.


DataProvider in TestNG | Data Driven Testing:
=============================================
-- TestNG library provides @DataProvider annotation which is used to mark a method as supplying data for a test method.
-- We can use the dataprovider method in test method like @Test(dataprovider="MethodName") or @Test(dataprovider="providerName")
-- we can also seperate the data provider class and then use @Test(dataProvider = "datasetno2", dataProviderClass = DataProvider.class)


How to Re-Execute Failed Test Cases in Selenium:
=================================================
-- For this we can use the Listner and re try the failed testcase.
-- In selenium we can re-try a test case to again run a failed test case
-- For that purpose this is a class in which we have defined the re-try mechanism
-- Now in order to re-try any test case you can go to particular test case and use this class 
-- We can use this like @Test(retryAnalyzer=className) 
-- But this approach like to use it with each test case is not a good one.
Overcome:
-- In order to overcome this we can use the same Retry class and one RetryListner Class. Implement the following method
public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor) {				annotation.setRetryAnalyzer(RetryTestCase.class);
}
-- Now that's it. You can now use it in testng.xml. Just add the listner and the class you want to listen.
<listeners> 
	<listener class-name="./src/test/java/testng_cases/RetryListner.java"></listener>
</listeners>



TestNG Report Generation in Selenium:
=====================================
-- TestNG provides default report which is generated when ever you execute your tests using TestNG framework. 
-- TestNG has a reporter class and we can log the messages like Reporter.log("This is a message")
-- We can also use the listner for generating and customizing the report.
-- The defaul report is not a good looking report.
-- To overcome this issue we can use the plugin ReportNG in testng.

Overcome: 
-- [https://github.com/sdrss/reportNG]
-- First of all, add the testng dependency. (https://mvnrepository.com/artifact/com.github.sdrss/reportng/2.7.0)
-- After that configure the TestListner with respect to ReportNG.
-- In order to do so, just add the listner in the testng.xml file.
<listener class-name="org.uncommons.reportng.HTMLReporter"></listener>


How to Manage Dependency Between Test Cases:
============================================
-- In order to manage the dependency between test cases we can use TestNG dependencies
-- TestNG allows you to specify dependencies either with annotations or in XML. 
-- To manage dependencies with annotations, you can use the attributes dependsOnMethods or dependsOnGroups.
@Test
public void serverStartedOk() {}
 
@Test(dependsOnMethods = { "serverStartedOk" })
public void method1() {}

-- If the method serverStartedOk is failed then the method1 won't execute.
-- The above way is called hard dependency.
-- In soft dependency if the ServerSrartedOk method failed the method1 will also execute.
-- For this to happens we can do the following:
@Test
public void serverStartedOk() {}
 
@Test(dependsOnMethods = "serverStartedOk",  alwaysRun=true)
public void method1() {}


****************************************************************************************************************************
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
****************************************************************************************************************************
Log4j in Selenium:
==================
-- First of all add log4j dependency by adding the below in the pom file 

********Working*********
<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>

********Not Working*********
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.19.0</version>
</dependency>

-- After that in src/main/resources folder create a log4j.properties file and paste the below code:

#Set level
log4j.rootCategory=debug, console, file

# Appender which writes to console
log4j.appender.console=org.apache.log4j.ConsoleAppender
log4j.appender.console.layout=org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=%d{MM-dd-yyyy HH:mm:ss} %F %-5p [%t] %c{2} %L - %m%n

# Appender which writes to a file
log4j.appender.file=org.apache.log4j.RollingFileAppender
log4j.appender.file.File=application.log

# Defining maximum size of a log file
log4j.appender.file.MaxFileSize=10mb
log4j.appender.file.MaxBackupIndex=10
log4j.appender.file.layout=org.apache.log4j.PatternLayout
log4j.appender.file.layout.ConversionPattern=%d{ISO8601} %5p [%t] %c{1}:%L - %m%n
log4j.appender.file.Append=false


-- After that run any test method and see the console logs.
-- We can log our own messages by following method:
-- First use the Logger class method.
org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AssertionTestNg.class);
log.info("Logged message");


****************************************************************************************************************************
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
****************************************************************************************************************************
Apache POI - Data Driven Testing: [Poor Obfuscation Implementation]
=================================
-- POI is an API - a collection of different java libraries.
-- Used to read, write, and manipulate the data in mircorsoft documents like excel, power point and word.
-- In selenium we can use this for Data Driven Testing.
-- xlsx classes used in POI are saved in an image.

How to add POI in your Project:
================================
-- If you are using the simple Java project then you can add the JAR files by manually downloading the Apache POI from here https://poi.apache.org/download.html
-- If you are using the maven project you can simply go to this https://mvnrepository.com/ and search for the Apache POI add the dependency in pom.xml file.
-- You will have to add these two: [Apache POI Common] & [Apache POI API Based On OPC and OOXML Schemas].


<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.3</version>
</dependency>


<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.3</version>
</dependency>



How to Read Data from Excel:
=============================
-- In this we will see how to read the data from excel.
-- First of all, we need path to excel file
-- Now we need to read the file using FileInputStream
-- Now we will get the workbook in the excel file
-- Now get the sheet in workbook
-- There are two method to read data, the one is using the for loop and the other is using the Iterator method.
-- Using For Loop
-- get number of rows
-- get number of cols
-- use two for loop to get the row and col values
-- We will get the current row
-- In excel we will have different data types, so we have to specify the type using switch case
-- In case of formula in a cell, we can specify the case as FORMULA and print or get the value using the getNumericCellValue.

-- Using Iterator - two while loop
-- All the step will remain same till getting sheet


How To Write Data on Excel:
===========================
-- In this we will see how to write the data into excel.
-- First of all, we need to create a workbook
-- Inside the workbook create a sheet
-- Now the data let say we have in an object in Array List
-- using for...each loop
-- end of for loop method
-- Setting up the file path where data will be save
-- close the stream

Note: In case of formula related cell like setting or formula etc see code on github.


How To Read Data from Password Protected Excel:
===============================================
-- Use the below line only this is change
// Now we will get the workbook from the password protected excel file
XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(fis, password);


Apache POI - Data Driven Testing in Selenium:
=============================================
Note: While using data driven testing we have to seperate the excel realted code in utils file and the actual test case, this way we can re-use the code and it help in clean code writing.

-- Refer to github code for this.


****************************************************************************************************************************
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
****************************************************************************************************************************
Page Object Model (POM) Design:
===============================
-- POM is also known as Page Chaining Model as there is a chain between pages
-- Its a design pattern or architecture normally used with data driven testing.
-- Below is a good explanation of each and every thing that make its a good design pattern.
-- Remember each layer below will be in a seperate package, example name is mentioned below.

Page Layer - 1: (Package = com.qa.pages in src/main/java)
---------------
-- Also known as Page Libraries, and Object Repositories as these contains collections of page objects only.
-- Contains the Objects or Web Elements of all the pages in a seperate class of each page.
-- Each class should only contains the actions or features etc in the form of methods on that specific page.
-- For Example: clickRegisterButton(), clickFooterLink() etc.



Test Layer - 2: (Package = com.qa.tests in src/test/java)
---------------
-- Each class should only contains the Test Scripts for each page object class seperately.
-- Test class contains the TestNG annotations.



Base Class/ Parent Class - 3: (Package = com.qa.base in src/main/java)
-----------------------------
-- There should be a base class or parent class that should only contains the common methods for example:
-- Properties files, chrome driver initilizations, maximizeWindows, pageLoadTime, implicitWait, deleteAllCookies, get(url) etc.
-- This base class should be inherit by the Page Layer 1 and Test Layer 2.


 
Environment Varibles - Layer 4: (Package = com.qa.configs in src/main/java)
------------------------------
-- This class should contains the config.properites file.
-- Inside that file we can add URL, username, password, browsers, others.



Test Data - Layer 5: (Package = com.qa.testdata in src/main/java)
---------------------
-- There will be a layer where we will store or read data from files like excel.
-- This will contains the data files.



Test Utils - Layer 6: (Package = com.qa.utils in src/main/java)
---------------------
-- This will contians the utilities functions like read, write data or other actions from excel file.
-- Take screenshot, sendmail, commonutils etc.



Test Report - Layer 7: (Package = com.qa.output/reports - it will be created by default)
----------------------
-- This will contains the test report (like HTML, TestNG, XML, ExtentReport etc) related stuff.

***************************************************************************************************************************
Web Driver Fire Events: [Deprecated] 
======================= 
-- This is to generate the selenium action logs.
-- This class implements the WebDriverEventListener, which is included under events.
-- The purpose of implementing this interface is to override all the methods and define certain useful  Log statements 
 which would be displayed/logged as the application under test is being run.
-- Do not call any of these methods, instead these methods will be invoked automatically as an when the action done (click, findBy etc). 



***************************************************************************************************************************
How to create Runnable JAR File from Selenium Project || Executable JAR file:
==============================================================================
-- This will be a standalone JAR file and you can run all the test classes in it with just a one class by just running this file.
-- First of all create a class in a Test Package namely TestRunnner or give any name to it. 
-- Add the test classes using TestNG as shown below.
public class TestRunner {

	static TestNG testNg;
	public static void main(String[] args) {
		
		// creating testng object
		testNg = new TestNG();
		
		// now call the test classes
		testNg.setTestClasses(new Class[] {SecurityDisclaimerTest.class, SignupPasswordTest.class});
		
		// run testng classes
		testNg.run();
	}
}

-- Export Project -> Select Java -> Runnable JAR file -> Select Launch configuration as TestRunner class -> Finish.

Problem:
- The problem here is FileInputStream is not working in this case.

***************************************************************************************************************************
Highlight elements using JavaScriptExecutor - Selenium WebDriver:
=================================================================
-- Javascript executor is used to highlight the element during testing.
-- In selenium, its not built in feature but we can use our own library for this.
-- Below is a list of functions we can use with javascript executor:
1. Highlight an Element
2. DrawBorder around an Element
3. Generate custom Alert during Test Execution
4. Click on an Element by using JavaScript
5. Refresh browser by using JavaScript
6. Get Title by using JavaScript
7. Get InnerText of page by using JavaScript
8. Scroll Into View and Scroll Page Down


*************************************************************************************************************************
***************************************************************************************************************************
Dependencies we need in maven project:
======================================
-1- Selenium java
-2- TestNG
-3- Log4J
-4- Apache POI
-5- ReportNG

		<!-- Selenium Java Dependency -->	
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.6.0</version>
		</dependency>

		<!-- TestNG Dependency - Install it from Eclipse marketplace and will added in each project. -->
		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
    			<groupId>org.testng</groupId>
    			<artifactId>testng</artifactId>
    			<version>7.7.1</version>
    			<scope>test</scope>
		</dependency>

		<!-- ReportNG Dependency -->	
		<!-- https://mvnrepository.com/artifact/com.github.sdrss/reportng -->
		<dependency>
			<groupId>com.github.sdrss</groupId>
			<artifactId>reportng</artifactId>
			<version>2.7.0</version>
		</dependency>
		
		<!-- Log4j Dependency - Working -->
		<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.17</version>
		</dependency>

		<!-- APACHE POI Dependency -->
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
			<version>5.2.3</version>
		</dependency>

		<!-- APACHE POI Dependency -->
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>5.2.3</version>
		</dependency>

****************************************************************************************************************************
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
****************************************************************************************************************************



References:
===========
-- https://www.browserstack.com/guide/selenium-webdriver-tutorial
-- https://www.guru99.com/introduction-webdriver-comparison-selenium-rc.html
-- https://bonigarcia.dev/webdrivermanager/
-- https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html