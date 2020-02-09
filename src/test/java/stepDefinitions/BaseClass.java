package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.POs_end_to_end;
import PageObjects.POs_your_Supplier;
import Utilities.TestUtil;


public class BaseClass extends TestUtil{

	public WebDriver driver;
	public static Logger logger;
	public Properties configProp;
	public TestUtil testutil;
	public POs_your_Supplier yrSupplier;
	public POs_end_to_end   end_2_end;
	
	public WebDriver initializeDriver(String browser) throws IOException {
		
		String browserName = browser;
		logger.info("===Browser to be Selected =====");
		
		
		if (browserName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/Drivers//chromedriver.exe");
			
			
			ChromeOptions options = new ChromeOptions();
			
			//Code to Check the Chrome browser requested to run in Headless mode or Not
			if (browserName.contains("headless")) 
			{
				options.addArguments("--headless");
			}

			driver = new ChromeDriver(options);

		} 
		else if (browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/Drivers//geckodriver.exe");
			driver = new FirefoxDriver();

		} 
		
        driver.manage().window().maximize();
		return driver;

	}
		
}
