package Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

public class TestUtil  {
	

	// Screenshot
	public static String getScreenShot(WebDriver driver, String screenshotName) throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + "_"
				+ dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	public static void Logcls(String logMsg, String className) {
		/*
		 * className = className+".class"; Logger log =
		 * Logger.getLogger(className);
		 * 
		 * String log4jConfigFile = System.getProperty("user.dir") +
		 * "/logs/log4j.properties";
		 * 
		 * PropertyConfigurator.configure(log4jConfigFile); log.info(logMsg);
		 */
	}

	// Select Class methods
	public static String selectVisibleText(WebElement select_Element, String visibleText) throws Exception {
		Select sc = new Select(select_Element);
		sc.selectByVisibleText(visibleText);
		Thread.sleep(2000);
		return sc.getFirstSelectedOption().getText();
	}
	public static int selectGetLastIndex(WebElement select_Element) {
		Select sc = new Select(select_Element);
		int selectOptions = sc.getOptions().size();
		return selectOptions;
	}
	public static int selectCountOfValues(WebElement select_Element) {
		Select sc = new Select(select_Element);
		List<WebElement> elementsList = sc.getOptions();
		return elementsList.size();
	}
	public static List<WebElement> selectAllValues(WebElement select_Element) {
		Select sc = new Select(select_Element);
		List<WebElement> elementsList = sc.getOptions();
		return elementsList;
	}
	public static void selectByValues(WebElement select_Element, String val) {
		Select sc = new Select(select_Element);
		try {
			sc.selectByValue(val);
		} catch (NoSuchElementException e) {
			System.out.println("Selected " + val + " is not in Dropdown");
		}
	}
	public static String selectFirstSelectedOption(WebElement select_Element)
	{
		Select sc = new Select(select_Element);
		return sc.getFirstSelectedOption().getText();
	}

	// Verifying Page Title
	public static String pageTitle(WebDriver page_Title) {
		String title = page_Title.getTitle();
		return title;
	}

	// Alert Actions
	public static boolean alertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch
	}
	public static void alertAccept(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		if(alertPresent(driver) == true)
		{
			alert.accept();
			driver.switchTo().defaultContent();
		}
		else
		{
			System.out.println("Alert Not Present On Page");
		}
	}
	public static void alertDismiss(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public static String alertMessage(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		return txt;
	}
	
	// WIndow Handles
	public static WebDriver windowHandle(WebDriver driver)
	{
		Set<String> allWindowHandles = driver.getWindowHandles();
		 System.out.println(allWindowHandles.size());
		 for(String handle : allWindowHandles)
		 {		 
		 driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
		
		 }
		 return driver;
	}
	
	//Mouse Hover
	public static String mouseHover(WebDriver driver, WebElement hoverOnElement) throws Exception {
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.moveToElement(hoverOnElement).build().perform();
		return hoverOnElement.getText();
	}
	public static String mouseHoverAndClick(WebDriver driver, WebElement hoverOnClick) {
		Actions ac = new Actions(driver);
		ac.moveToElement(hoverOnClick).click().build().perform();
		return hoverOnClick.getText();
	}

	
	
	//Frame
	public static WebDriver switchToFrame(WebDriver driver, String frameId) {
		driver.switchTo().frame(frameId);
		return driver;
	}
	public static WebDriver getOutFromFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
		return driver;
	}

	public static boolean elementPresent(WebElement element) {
		if (element != null) {
			return true;
		} else
			return false;
	}

	public static boolean elementDisplayed(WebElement element) {
		if (element.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public static boolean elementEnable(WebElement element) {
		if (element.isEnabled()) {
			return true;
		} else
			return false;
	}

	public static boolean textPresent(WebDriver driver, String text) {
		try {
			boolean b = driver.getPageSource().contains(text);
			return b;
		} catch (Exception e) {
			return false;
		}
	}

	public static void clearTextBox(WebElement element) {
		element.clear();
	}

	public static String getTextOfElement(WebElement element) {
		return element.getText();
	}

	//Explicit Wait
	public static void waitTillElementDisplayLocater(WebDriver driver, String locater) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locater)));
	}
	public static void waitTillElementDisplayWebElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void isButtonEnabled(WebDriver driver) {

	}

	public static void clickAnElement(WebDriver driver) {

	}
	
	//Date Month Year
	public static int getCurrentMonth() {
		//Date today = new Date();
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		return month;
	}

	public static int getCurrentYear() {
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		int year = cal.get(Calendar.YEAR);
		return year;
	}

}
