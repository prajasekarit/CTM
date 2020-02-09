package stepDefinitions;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	public WebDriver driver;
	
	@Before
	public void log_Config() throws IOException
	{
		//Logger to write the Logs in log file
		logger=Logger.getLogger("CTM SDET test");
		PropertyConfigurator.configure("Log4j.properties");
	}
		
}
