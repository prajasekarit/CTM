package PageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.TestUtil;
import stepDefinitions.BaseClass;


public class LoginPage extends BaseClass{

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		testutil=new TestUtil();
	}
	
	
	@FindBy(how = How.CSS, using = "input.gLFyf.gsfi")
	WebElement SearchBox;

	@FindBy(how = How.CSS, using = "input.gNO89b")
	private WebElement SearchBox_Enter;

	@FindBy(xpath = "//*[contains(text(),'gumtree')]")
	private WebElement GUM_TREE;

	@FindBy(xpath = "//h3[contains(text(),'Used Cars for Sale in London | Great Local Deals |')]")
	public List<WebElement> elementItems;
	

	public void Searchterm(String searchterm) throws InterruptedException {
		Thread.sleep(4000);
		System.out.println(searchterm);
		SearchBox.sendKeys(searchterm);
		SearchBox_Enter.click();
		
	}

	public void elementsSize() {
		
		int itemCount = elementItems.size();
    	logger.info("Number of times the GUM TREE Text displayed in First page is : " + itemCount);
    	System.out.println("Number of times the GUM TREE Text displayed in First page is : " + itemCount);
	    Assert.assertTrue(itemCount>0);
		
	}

	public void closeBrowser() {
		
		logger.info("Closing the Browser");
		ldriver.close();
		ldriver=null;
		
	}

	public void validateTitle() {
		
		String gSearch = ldriver.getCurrentUrl();
		
		logger.info("Gum tree elements:"+ elementItems.size());
		System.out.println("Gum tree elements:"+ elementItems.size());
	
		for (int i = 0; i < elementItems.size(); i++) 
		{
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			WebElement link = elementItems.get(i);
			
			Actions newTab = new Actions(ldriver);
			
			newTab.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).build().perform();
			//newTab.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
				
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
			
			 ArrayList<String> tabs = new ArrayList<String>(ldriver.getWindowHandles());
			
			 //below code will switch to new tab
			ldriver.switchTo().window(tabs.get(1));
						
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println(testutil.pageTitle(ldriver));
			
			System.out.println(" : Actual Header Getting Displayed: "+ ldriver.getTitle());
			logger.info("Actual Header Getting Displayed: "+ ldriver.getTitle());
		    
			//softAssertion.assertEquals("Used Cars for Sale in London | Great Local Deals | Gumtree", ldriver.getTitle());
			
			//perform whatever actions you want in new tab then close it
			ldriver.close();
			
			//Switch back to your original tab
			ldriver.switchTo().window(tabs.get(0));
			
			  
		}
		
	}

}
