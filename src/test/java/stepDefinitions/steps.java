package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import net.thucydides.core.annotations.Steps;


public class steps  extends BaseClass{
	
//	@Steps
	public WebDriver driver;
	
	    
	@Before
	public void log_Config() throws IOException
	{
		//Log
		logger=Logger.getLogger("nopComemrce");
		PropertyConfigurator.configure("Log4j.properties");
		
	//Reading properties
	configProp=new Properties();
	FileInputStream configPropfile=new FileInputStream("config.properties");
	configProp.load(configPropfile);
	//String br=configProp.getProperty("browser");
	}
	
	//@After
	public void close_Driver(){
		driver.quit();
	}
	
	
	 @Given("^Initialize the (.+) browser$")
	    public void initialize_the_browser(String browser) throws Throwable {
	        
		 driver=initializeDriver(browser);
		 logger.info("******** Launching browser*********");
		
	    }

	    @When("^Google.com is launched send the literal (.+) in Google text box and Enter the search button$")
	    public void googlecom_is_launched_send_the_literal_in_google_text_box_and_enter_the_search_button(String searchterm) throws Throwable {
	        
	    	lp=new LoginPage(driver);
	    	logger.info("******** Enter the Text in Google Search*********");
	    	lp.Searchterm(searchterm);
	    }

	    @Then("^Verify the links with the Literal (.+) and confirm the number of links displayed is more than one$")
	    public void verify_the_links_with_the_literal_and_confirm_the_number_of_links_displayed_is_more_than_one(String searchgumtree) throws Throwable {
	    	
	    	logger.info("********Validate the Number of Links with Search Term Literal*********");
	    	lp.elementsSize();
	    	
	    }

	    @Then("^Close Browsers$")
	    public void close_browsers() throws Throwable {
	    	
	       logger.info("******** Closing the browser*********");
	       lp.closeBrowser();

	    }

	    @And("^Navigate to (.+) Site$")
	    public void navigate_to_site(String url) throws Throwable {
	    	
	    	logger.info("******** Launching Google.com*********");
	    	driver.get(url);
	        
	        
	    }

	    @And("^verify that the title is getting is displayed$")
	    public void verify_that_the_title_is_getting_is_displayed() throws Throwable {
	    	
	    	logger.info("******** Validate the Title is Displayed as Expected*********");
	    	lp.validateTitle();   
	    }
	
	
}
