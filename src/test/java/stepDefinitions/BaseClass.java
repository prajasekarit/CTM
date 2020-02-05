package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.LoginPage;
import Utilities.TestUtil;


public class BaseClass extends TestUtil{

	public WebDriver driver;
	public LoginPage lp;
	public static Logger logger;
	public Properties configProp;
	public TestUtil testutil;
	
	public WebDriver initializeDriver(String browser) throws IOException {
		
		String browserName = browser;
		logger.info("===Browser to be Selected =====");
		
		
		if (browserName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/Drivers//chromedriver.exe");
			System.out.println(System.getProperty("user.dir"));
			System.out.println(browserName);
			
			ChromeOptions options = new ChromeOptions();
			
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

		} else if (browserName.equals("IE"))
		{

			//System.setProperty("webdriver.ie.driver", "C://chromedriver.exe");
		}
        driver.manage().window().maximize();
		return driver;

	}
	
	
	
	//Created for generating random string for Unique email
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	
	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/target/" + result + "screenshot.png"));

	}
	
}
