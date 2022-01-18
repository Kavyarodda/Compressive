package reusablecomponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilities.ReadConfig;


import com.aventstack.extentreports.ExtentTest;

public class Browser_open extends ReadConfig {

	ReadConfig readconfig=new ReadConfig();
	public static ExtentTest test;
	public String baseURL=readconfig.getApplicationURL();
	public static WebDriver driver;
	public String browser=readconfig.getBrowser();
	
	public WebDriver openBrowser()
	{			
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}


}
