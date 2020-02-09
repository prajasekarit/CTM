package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import PageObjects.POs_end_to_end;
import PageObjects.POs_your_Supplier;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@SuppressWarnings("unused")
public class Steps  extends BaseClass{
	

	public WebDriver driver;
	final static Logger logger=LoggerFactory.getLogger(Steps.class);
		

	 @Given("^Initialize the (.+) browser$")
	    public void initialize_the_browser(String browser) throws Throwable {
	        
		 driver=initializeDriver(browser);
		 logger.info("******** Launching browser*********");
		 //yrSupplier.open();
		
	    }


	    @Then("^Close Browsers$")
	    public void close_browsers() throws Throwable {
	    	
	       logger.info("******** Closing the browser*********");
	       yrSupplier.closeBrowser();

	    }

	    @And("^Navigate to (.+) Site$")
	    public void navigate_to_site(String url) throws Throwable {
	    	
	    	logger.info("******** Launching the Website*********");
	    	driver.get(url);
	        
	        
	    }

	    
	    @When("^Energy Quote page is launched$")
	    public void energy_quote_page_is_launched() throws Throwable {
	   
	    	logger.info("******** Energy Quote Page is launched*********");
	    	yrSupplier=new POs_your_Supplier(driver);
	    		    	
	    }
	    
	    @Then("^Verify the Header and Page Title$")
	    public void verify_the_header_and_page_title() throws Throwable {
	    	
	    	logger.info("******** Validate the Title *********");
	    	yrSupplier.validate_URL();	 
	    	
	    	logger.info("******** Validate the Title and Header *********");
	    	yrSupplier.validate_Title();  
	    	yrSupplier.validate_Header();
	    	
	    }
	    
	    @And("^Verify the sub header is displayed$")
	    public void verify_the_sub_header_is_displayed() throws Throwable {
	    	
	    	logger.info("******** Validate the Sub_Header *********");
	    	yrSupplier.validate_Sub_Header();    	
	    	
	    }

	    
	    @Then("^Verify the been here before text$")
	    public void verify_the_been_here_before_text() throws Throwable {
	    	
	    	logger.info("******** Validate the Sub Text *********");
	    	yrSupplier.validate_Sub_text();  
	    }

	    @And("^Verify the previous energy quotes string is navigating to Sign in page$")
	    public void verify_the_previous_energy_quotes_string_is_navigating_to_sign_in_page() throws Throwable {
	    	
	    	logger.info("******** Validate the Previous Energy Quotes *********");
	    	yrSupplier.validate_prv_en_quotes();  
	    }

	    @And("^Verify the How to get Started is clikable and expanding the display portion with details$")
	    public void verify_the_how_to_get_started_is_clikable_and_expanding_the_display_portion_with_details() throws Throwable {
	    	
	    	logger.info("******** Validate the Sub_Header *********");
	    	yrSupplier.validate_howtostart_expandable();  
	    }

	    @When("^User clicks on the Find postcode button without any text$")
	    public void user_clicks_on_the_find_postcode_button_without_any_text() throws Throwable {
	    	
	    	logger.info("******** Validate Post code without Any input *********");
	    	yrSupplier.validate_without_Input();  
	    	
	    }

	    @When("^User clicks on the Find postcode button with (.+) which is Invalid$")
	    public void user_clicks_on_the_find_postcode_button_with_which_is_invalid(String invpostcode) throws Throwable {
	        
	    	logger.info("******** Send the Invalid Post code *********");
	    	yrSupplier.validate_Inv_Input(invpostcode); 
	    	
	    }

	    @When("^User clicks on the Find postcode button with (.+) which is valid$")
	    public void user_clicks_on_the_find_postcode_button_with_which_is_valid(String crctpostcode) throws Throwable {
	        
	    	logger.info("******** Send the Invalid Post code *********");
	    	yrSupplier.validate_val_Input(crctpostcode); 
	    }

	    
	    @Then("^Verify the Your current supplier text$")
	    public void verify_the_your_current_supplier_text() {
	       
	    	logger.info("******** Validate Current Supplier Text *********");
	    	yrSupplier.validate_crnt_Sup_text();
	    	
	    }

	    @Then("^Verify that Error message is not getting displayed$")
	    public void verify_that_error_message_is_not_getting_displayed() {
	        
	    	logger.info("******** Validate Error message is not displayed in Post code Area *********");
	    	yrSupplier.validate_err_not_displayed();
	    	
	    }

	    @Then("^Verify the Error message populated$")
	    public void verify_the_error_message_populated() throws Throwable {
	        
	    	logger.info("******** Validate Error message is displayed in Post code Area *********");
	    	yrSupplier.validate_err_msg_displayed();
	    	
	    }

	    @Then("^Verify that button is changed to the (.+)$")
	    public void verify_that_button_is_changed_to_the(String button) throws Throwable {
	        
	    	logger.info("******** Validate Error message is  not displayed in Post code Area and Button text is changed *********");
	    	yrSupplier.validate_post_button_displayed();
	    	
	    }

	    @And("^Verify the (.+) message is populated in the bottem of the page$")
	    public void verify_the_message_is_populated_in_the_bottem_of_the_page(String error) throws Throwable {
	    
	    	logger.info("******** Verify the Error meaage at Bottom of Page *********");
			yrSupplier.validate_error(error);
		
	    }
	    
	    
	    @And("^I clicked on the Next buton$")
	    public void i_clicked_on_the_next_buton() throws Throwable {
	     
	    	logger.info("******** Click on Next Button*********");
	    	yrSupplier.clickNext();
	    	
	    }
	    

		@Then("^Enter the (.+) Post code$")
		public void enter_the_post_code(String valid) throws Throwable {
				end_2_end = new POs_end_to_end(driver);
				logger.info("********Valid Post code passed to the Post coe field*********");
				end_2_end.valid_post_code(valid);
			}
	 
	    @And("^Select the Mandatory fields in the Your Supplier Page and click Next$")
	    public void select_the_mandatory_fields_in_the_your_supplier_page_and_click_next() throws Exception {
			    
				logger.info("********Select other values form Your Supplier Page*********");
				end_2_end.other_fields();
				
			}
	

	    
	    @Then("^Verify the Page is navigate to the Your Energy details$")
	    public void verify_the_page_is_navigate_to_the_your_energy_details() throws InterruptedException  {
	    	
	    	logger.info("*****************Click on the Next page Link***************");
	    	end_2_end.your_energy_validation();
	    }

	    
	    @Given("^Navigated to Your Energy page$")
	    public void navigated_to_your_energy_page() throws Throwable {
	    	
	    	logger.info("*****************Validate Your Energy page***************");
	    	end_2_end.val_energy();
	    	
	    }

	    @When("^I clicked on the Next button$")
	    public void i_clicked_on_the_next_button() {
	        
	    	logger.info("*****************Click on Next Button***************");
	    	end_2_end.click_next();
	    }
	    
	    @Then("^Verify the (.+) message is populated in the bottem of the page and$")
	    public void verify_the_message_is_populated_in_the_bottem_of_the_page_and(String error) throws Throwable {
	        
	    	logger.info("*****************Validate Error message***************");
	    	end_2_end.validate_error(error);
	    }
	    
	    @When("^Amount field is selected$")
	    public void amount_field_is_selected() throws Throwable {
	        
	    	logger.info("*****************Select the Amount Field in Current Electricity Usage***************");
	    	end_2_end.sel_amount_field();
	    	
	    }

	    @Then("^Verify that \"([^\"]*)\" should get displayed$")
	    public void verify_that_something_should_get_displayed(String strArg1) throws Throwable {
	    	
	    	logger.info("*****************Validate The Bill date fields get populated in Screen***************");
	    	end_2_end.val_date_on_bill(strArg1);
	    	
	    }
	    
	    @When("^Economy Meter selected as \"([^\"]*)\" and kWH is selected$")
	    public void economy_meter_selected_as_something_and_kwh_is_selected(String strArg1) throws Throwable {
	    	
	    	logger.info("*****************Select the KWH in Current Electricity Usage***************");
	    	end_2_end.sel_economy_no();
	    }

	    @Then("^Verify only one reading box should get displayed$")
	    public void verify_only_one_reading_box_should_get_displayed() throws Throwable {
	    	
	    	logger.info("*****************Validate fields get populated in Screen***************");
	    	end_2_end.val_curr_elec_usg();
	        
	    }
	    
	    @When("^Economy Meter selected as Yes and kWH is selected$")
	    public void economy_meter_selected_as_yes_and_kwh_is_selected() throws Throwable {
	        
	    	logger.info("*****************Select the KWH in Current Electricity Usage***************");
	    	end_2_end.sel_economy_yes();
	    	
	    	
	    }

	    @Then("^Verify Day time and Night time electricity usage menu should get displayed$")
	    public void verify_day_time_and_night_time_electricity_usage_menu_should_get_displayed() throws Throwable {
	    	
	    	logger.info("*****************Validate Current Electricity Usage fields displayed ***************");
	    	end_2_end.val_curr_elec_usg_yes();
	    }

	    
}

