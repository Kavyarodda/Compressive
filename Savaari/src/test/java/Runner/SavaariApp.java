package Runner;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

import pageobjects.Airport;
import pageobjects.Local_car;
import pageobjects.Car_one_way;
import pageobjects.Cab_book;
import pageobjects.Car_select;
import pageobjects.Contact_Us;
import pageobjects.DownloadApp;
import pageobjects.Round_trip_price;
import pageobjects.Sign_up;
import pageobjects.Title_validate;
import reusablecomponents.Browser_open;
import utilities.ExtentReporterNG;
import utilities.ReadConfig;
import utilities.Screenshot;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;

import org.apache.log4j.Logger;
public class SavaariApp extends Browser_open {
	static Logger log = Logger.getLogger(SavaariApp.class);
	//public static WebDriver driver = null;
	ReadConfig config = new ReadConfig();
	Contact_Us c ;
//	public static ExtentReporterNG extent = new ExtentReporterNG();
//	public static ExtentTest test;
	static ExtentReports extent = ExtentReporterNG.extentReportGenerator();
	

	@BeforeMethod
	public void opendriver()
	{
//		Browser_open b = new Browser_open();
		openBrowser();
		log.info("Chrome Browser opened");
		driver.get(config.getApplicationURL());
		log.info("Savaari Url is running");
	}
	
	@AfterMethod
	public void closedriver()
	{
		driver.close();
		log.info("Chrome Browser closed successfully");
		//extent.endTest();
	}
	@AfterSuite()
	public void flush() {
		extent.flush();
	}
	
	@Test(priority=1)
	public void Title_validating(Method method) throws Exception {
		//test= extent.startTest(method.getName());
		test = extent.createTest(method.getName());
		test.log(Status.PASS, "TestCase Execution Started");
		log.info("Test case1 is running");
		Title_validate t = new Title_validate(driver);
		String actual = driver.getTitle();
		System.out.println(actual);
		Thread.sleep(2000);
		if(actual.equals(t.expectedtitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		log.info("Title verified successfully");
		test.log(Status.PASS, " Title verified Successfully");
		Screenshot scr = new Screenshot();
		scr.takeSnapShot(driver,method.getName());
		
	}
	
	@Test(priority=2)
	public void Contact_us(Method method) throws Exception
	{
		//test= extent.startTest(method.getName());
		test = extent.createTest(method.getName());
		test.log(Status.PASS, "TestCase Execution Started");
		Thread.sleep(5000);
		log.info("Test case2 is running");
		Thread.sleep(5000);
		c = new Contact_Us(driver);
		WebElement element = c.Contacting();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
//		c.Contacting().click();
		log.info("Contact us page opened");
		Thread.sleep(5000);
		Set<String> handles =  driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(handles);
		driver.switchTo().window(tabs.get(1));
		System.out.println(c.Number());
		if(c.Number().equals(c.expectednum))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}		
		log.info("Contact details verified successfully");
		test.log(Status.PASS, " Contact details verified Successfully");
		Screenshot scr = new Screenshot();
		scr.takeSnapShot(driver,method.getName());
	}
	
	@Test(priority=3)
	public void Downloadapp(Method method) throws Exception
	{
		test = extent.createTest(method.getName());
		test.log(Status.PASS, "TestCase Execution Started");
		log.info("Test case6 is running");
		DownloadApp d = new DownloadApp(driver);
		Thread.sleep(5000);
		WebElement element2 = d.Download();
		log.info("Clicked on the Download App");
		test.log(Status.PASS, " Testcase Ran Successfully");
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", element2);
//		d.Download().click();
		Thread.sleep(5000);
		Set<String> handles =  driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(handles);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(10000);
		d.Wishlist().click();
		log.info("Successfully added to wishlist");
		test.log(Status.PASS, "Successfully added to wishlist");
		Screenshot scr = new Screenshot();
		scr.takeSnapShot(driver,method.getName());
		
	}
	
	
	
	
	@Test(priority=4)
	public void Car_selecting(Method method) throws Exception {
		test = extent.createTest(method.getName());
		test.log(Status.PASS, "TestCase Execution Started");
		log.info("Test case4 is running");
		Car_select sc = new Car_select(driver);
		sc.Fromcity().sendKeys("Bangalore, Karnataka");
		sc.Fromcity().sendKeys(Keys.ENTER);
		log.info("Entered from city details");
		sc.Tocity().sendKeys("Mysore, Karnataka");
		Thread.sleep(5000);
		sc.Tocity().sendKeys(Keys.ENTER);
		log.info("Entered to city details");
		Thread.sleep(5000);
		sc.Select().click();
		log.info("Navigated to car select page successfully");
		test.log(Status.PASS, " Navigated to car select page Successfully");
		Screenshot scr = new Screenshot();
		scr.takeSnapShot(driver,method.getName());
		
	}
	
	
	@Test(priority=5)
	public void Cab_book(Method method) throws Exception
	{
		test = extent.createTest(method.getName());
		test.log(Status.PASS, "TestCase Execution Started");
		log.info("Test case5 is running");
		Cab_book c = new Cab_book(driver);
		Thread.sleep(5000);
		WebElement element1 = c.Cab_text();
		log.info("Clicked on Cab book page");
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		//Cab_text().click();
		Thread.sleep(5000);
		Set<String> handles =  driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(handles);
		driver.switchTo().window(tabs.get(1));
		log.info("Navigated to the Cab Book page");
		String expected = "Download Taxi Booking App - Outstation, Local, Airport Cabs";
		if(c.Heading().equals(expected))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		log.info("Heading verified successfully");
		test.log(Status.PASS, " Heading verified Successfully");
		Screenshot scr = new Screenshot();
		scr.takeSnapShot(driver,method.getName());
		
	}
	
	@Test(priority=6)
	public void Signup(Method method) throws Exception
	{
		test = extent.createTest(method.getName());
		test.log(Status.PASS, "TestCase Execution Started");
		log.info("Test case3 is running");
		Sign_up s = new Sign_up(driver);
		s.Signup().click();
		log.info("Signin box opened");
		Thread.sleep(5000);
		s.Email().sendKeys("Text1@gmail.com");
		s.Password().sendKeys("Text11");
		log.info("Entered Email and password");
		Thread.sleep(5000);
		s.Login().click();
		log.info("Signed in successfully");
		test.log(Status.PASS, "Signed in Successfully");
		Screenshot scr = new Screenshot();
		scr.takeSnapShot(driver,method.getName());
	}
	
	
	
	
	@Test(priority=7)
	public void Car_one_way(Method method) throws Exception{
		test = extent.createTest(method.getName());
		test.log(Status.PASS, "TestCase Execution Started");
		log.info("Test case7 is running");
		Car_one_way car = new Car_one_way(driver);
		log.info("Entered the From city details");
		car.FromCity().sendKeys("Bangalore, Karnataka");
		car.FromCity().sendKeys(Keys.ENTER);
		car.ToCity().sendKeys("Mysore, Karnataka");
		Thread.sleep(5000);
		car.ToCity().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		log.info("Entered To city details");
		car.Selectcar().click();
		log.info("Navigated to car select page");
		Thread.sleep(5000);
		car.Select().click();
		log.info("Selected the First car ");
		Thread.sleep(5000);
		String expectedcar = "Toyota Etios or Equivalent";
		System.out.println(car.Cartype());
		if(car.Cartype().equals(expectedcar))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}	
		log.info("Verified the first car successfully");
		test.log(Status.PASS, "Verified the first car successfully");
		Screenshot scr = new Screenshot();
		scr.takeSnapShot(driver,method.getName());
	}
	

	@Test(priority=8)
	public void Roundtrip(Method method) throws Exception{
		test = extent.createTest(method.getName());
		test.log(Status.PASS, "TestCase Execution Started");
		log.info("Test case8 is running");
		Round_trip_price p = new Round_trip_price(driver);
		WebElement element3 = p.Roundtrip();
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", element3);
//		p.Roundtrip().click();
		Thread.sleep(5000);
		p.FromCity().sendKeys("Bangalore, Karnataka");
		p.FromCity().sendKeys(Keys.ENTER);
		log.info("Entered the From city details");
		Thread.sleep(5000);
		p.ToCity().sendKeys("Mysore, Karnataka");
		Thread.sleep(5000);
		p.ToCity().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		log.info("Entered The To city details");
		p.Selectcar().click();
		Thread.sleep(5000);
		log.info("Navigated to car select page");
		p.Select().click();
		Thread.sleep(5000);
		log.info("Selected the first car");
		String expectedprice= "3365";	
		System.out.println(p.Price());
		if(p.Price().contains(expectedprice))
		{
			Assert.assertTrue(true);
			test.log(Status.PASS, "Verified the car price successfully");
		}
		else
		{
			Assert.assertTrue(false);
			test.log(Status.FAIL, "Car price verification is unsuccessfull");
			
		}		
		log.info("Verified the car price successfully");
		test.log(Status.FAIL, "Car price verification is unsuccessfull");
		
		Screenshot scr = new Screenshot();
		scr.takeSnapShot(driver,method.getName());
	}
	
	@Test(priority=9)
	public void Local_car(Method method) throws Exception{
		test = extent.createTest(method.getName());
		test.log(Status.PASS, "TestCase Execution Started");
		log.info("Test case9 is running");
		Local_car l = new Local_car(driver);
		WebElement element4 =l.Local();
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", element4);
		Thread.sleep(5000);
		l.Selectcity().sendKeys("Bangalore, Karnataka");
		l.Selectcity().sendKeys(Keys.ENTER);
		log.info("Selected the city");
		Thread.sleep(5000);
		l.Selectcar().click();
		log.info("Navigated to car select page");
		Thread.sleep(5000);
		l.Select().click();
		log.info("Selected the car");
		Thread.sleep(8000);
		String expectedcar = "Toyota Etios or Equivalent";
		System.out.println(l.Cartype());
		if(l.Cartype().equals(expectedcar))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}		
		log.info("Verified The car type successfully");
		test.log(Status.PASS, "Verified the car  type successfully");
		Screenshot scr = new Screenshot();
		scr.takeSnapShot(driver,method.getName());
	
	}
	
	
	@Test(priority=10)
	public void Airport(Method method) throws Exception{
		test = extent.createTest(method.getName());
		test.log(Status.PASS, "TestCase Execution Started");

		log.info("Test case10 is running");
		Airport a = new Airport(driver);
		WebElement element5 = a.Airport_select();
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", element5);
		log.info("Selected the Airport");

		Thread.sleep(5000);
		a.FromCity().sendKeys("Bangalore, Karnataka");
		Thread.sleep(5000);
		a.FromCity().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		log.info("Entered the city details");
		
		Select s = new Select(a.Trip());
		s.selectByValue("drop_airport");
		WebElement element6= a.Trip();
		JavascriptExecutor executor6= (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", element6);
		log.info("Selected the Trip Type ");

		
		Thread.sleep(5000);
		a.Pickup().sendKeys("Mysuru");
		Thread.sleep(5000);
		log.info("Entered the Location");
		a.Pickup().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		a.Selectcar().click();
		log.info("Navigated to car select page");
		Thread.sleep(6000);
		a.Select().click();
		log.info("Selected the car");
		Thread.sleep(5000);
		String expectedprice= "931";	
		System.out.println(a.Price());
		if(a.Price().contains(expectedprice))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}	
		log.info("verified the car price successfully");
		test.log(Status.PASS, "Verified the car price successfully");
		Screenshot scr = new Screenshot();
		scr.takeSnapShot(driver,method.getName());
	
		
	}
	
	
}
