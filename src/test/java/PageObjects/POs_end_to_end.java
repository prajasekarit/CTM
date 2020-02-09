package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import Utilities.TestUtil;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@SuppressWarnings("unused")
//@DefaultUrl("https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT")
public class POs_end_to_end extends PageObject{
	
	WebDriver ldriver;
	
	final static Logger logger = LoggerFactory.getLogger(POs_end_to_end.class);
	
	/*public POs_end_to_end(WebDriver driver)
	{
		super(driver);
		driver.manage().window().maximize();
	}*/
	
	
	public POs_end_to_end(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(xpath="//input[@id='your-postcode']")
	private WebElement POST_CODE_TEXT_BOXA;
	
	
	@FindBy(xpath="//button[@id='find-postcode']")
	private WebElement FIND_POST_CODEA;
	
	@FindBy(xpath="//span[contains(text(),'Yes, I have my bill')]")
	private WebElement YES_I_HAV_BILL_BUTTON;
	
	@FindBy(xpath="//span[contains(text(),'t have my bill')]")
	private WebElement DONT_HV_BILL_BUTTON;
	
	@FindBy(xpath="//label[@id='compare-both-label']//span[@class='radio-button-text']")
	private WebElement GAS_AND_ELEC_BUTTON;
	
	@FindBy(xpath="//p[contains(text(),'Is your gas and electricity from the same supplier')]")
	private WebElement SAM_SUPP_CNFRM;
	
	@FindBy(xpath="//div[@class='answer radio-buttons radio-buttons-small']//span[@class='radio-button-text'][contains(text(),'Yes')]")
	private WebElement YES_BUTTON;
	
	@FindBy(xpath="//select[@id='sel']")
	private WebElement SELECT_SUPPLIER;
	
	@FindBy(xpath="//button[@id='goto-your-supplier-details']")
	private WebElement NEXT_YOUR_SUPP;
	
	//Your Energy page objects
	@FindBy(xpath="//h2[@class='main-heading']")
	private WebElement MAIN_HEADING_YOUR_ENERGY;
	
	@FindBy(xpath="//select[@id='electricity-tariff-additional-info']")
	private WebElement SELECT_ELEC_TARIF;
	
	@FindBy(xpath="//fieldset[@id='economy-7-question']//span[@class='radio-button-text'][contains(text(),'Yes')]")
	private WebElement ECONOMY7_METER_YES;
	
	@FindBy(xpath="//fieldset[@id='economy-7-question']//span[@class='radio-button-text'][contains(text(),'No')]")
	private WebElement ECONOMY7_METER_NO;
	
	@FindBy(xpath="//input[@id='electricity-usage']")
	private WebElement ELEC_SRC_KWH_TEXT1;	
	
	@FindBy(xpath="//div[@class='spend-period']//select[@id='usage-dropdown']")
	private WebElement ELEC_SRC_KWH_SELECT;	
	
	@FindBy(xpath="//fieldset[@id='electricity-usage-question']//select[@id='usage-dropdown']")
	private WebElement ELEC_SRC_NO_PERIOD;	
	
	@FindBy(xpath="//select[@id='electricity-payment-method-dropdown-link']")
	private WebElement SELECT_PAY_ELEC;
	
	@FindBy(xpath="//label[@class='checked']//span[@class='radio-button-text'][contains(text(),'Yes')]")
	private WebElement ELEC_SRC_OF_HEAT_YES;
	
		
	@FindBy(xpath="//fieldset[@id='electricity-usage-question']//span[@class='radio-button-text'][contains(text(),'£')]")
	private WebElement ELEC_SRC_POUND;	
	
	@FindBy(xpath="//label[@class='checked']//span[@class='radio-button-text'][contains(text(),'kWh')]")
	private WebElement ELEC_SRC_KWH;
	
	@FindBy(xpath="//div[@id='electricity-bill-date-field']//label[@class='question'][contains(text(),'What is the date on your bill?')]")
	private WebElement ELEC_SRC_CAL_TEXT;
	
	@FindBy(xpath="//button[@id='go-back']")
	private WebElement ELEC_SRC_BACK;	
	
	@FindBy(xpath="//button[@id='goto-your-energy']")
	private WebElement ELEC_SRC_NEXT;
	
	@FindBy(xpath="//p[@class='ng-binding']")
	private WebElement ELEC_SRC_ERROR;
	
	@FindBy(xpath="//label[contains(text(),'Daytime electricity used (Economy 7) in kWh')]")
	private WebElement ELEC_SRC_DAY_TIME_TXT;
	
	@FindBy(xpath="//label[contains(text(),'Night-time electricity used (Economy 7) in Kwh')]]")
	private WebElement ELEC_SRC_NIG_TIME_TXT;
	
	@Step
	public void valid_post_code(String valid) {
		
		logger.info("Post code Provided to Enter is : "+ valid);
		Assert.assertTrue(POST_CODE_TEXT_BOXA.isEnabled());
		POST_CODE_TEXT_BOXA.sendKeys(valid);
		FIND_POST_CODEA.click();
		
	}

	@Step
	public void other_fields() throws Exception {
		
		logger.info("Select other Fields in the Your Supplier Page");
		
		Assert.assertTrue(YES_I_HAV_BILL_BUTTON.isDisplayed());
		YES_I_HAV_BILL_BUTTON.click();
		
		Assert.assertTrue(GAS_AND_ELEC_BUTTON.isDisplayed());
		GAS_AND_ELEC_BUTTON.click();
		
		Assert.assertTrue(SAM_SUPP_CNFRM.isDisplayed());
		String same_supp=SAM_SUPP_CNFRM.getText();
		Assert.assertTrue(same_supp.contains("Is your gas and electricity from the same supplier?"));
		
		Assert.assertTrue(YES_BUTTON.isDisplayed());
		YES_BUTTON.click();
		
		TestUtil.selectVisibleText(SELECT_SUPPLIER, "Bristol Energy Limited");
		//TestUtil.selectByValues(SELECT_SUPPLIER, "Bristol Energy Limited");
		
		
	}

	@Step
	public void your_energy_validation() throws InterruptedException {
		
		logger.info("Click on the Next page Link and Validate Link is working fine");
		Assert.assertTrue(NEXT_YOUR_SUPP.isEnabled());
		Assert.assertTrue((NEXT_YOUR_SUPP.getText()).contains("Next"));
		NEXT_YOUR_SUPP.click();
		Thread.sleep(3000);
		System.out.println(ldriver.getCurrentUrl());
		Assert.assertEquals(ldriver.getCurrentUrl(), "https://energy.comparethemarket.com/energy/v2/yourEnergy");
		
	}
    
	@Step
	public void val_energy() {
		
		System.out.println("With in Validate Para");
	}
	
	@Step
	public void validate_energy() {
		
		System.out.println("With in Validate Para");
		Assert.assertEquals(ldriver.getCurrentUrl(), "https://energy.comparethemarket.com/energy/v2/yourEnergy");
		System.out.println("With in Validate Para1");
		String main_head=MAIN_HEADING_YOUR_ENERGY.getText();
		System.out.println("With in Validate Para2");
		Assert.assertEquals(main_head,"Your electricity");
	
		
	}
	
	@Step
	public void click_next() {
		
		Assert.assertTrue(ELEC_SRC_NEXT.isDisplayed());
		Assert.assertEquals(ELEC_SRC_NEXT.getText(),"Next");
		ELEC_SRC_NEXT.click();
		
	}

	@Step
	public void validate_error(String error) {
		
		Assert.assertTrue(ELEC_SRC_ERROR.getText().contains(error));
		Assert.assertTrue(ELEC_SRC_ERROR.isDisplayed());
	}


	@Step
	public void sel_amount_field() {
		
		TestUtil.selectByValues(SELECT_ELEC_TARIF, "Bristol Energy Standard Issue 4 Paper Billing");
		ECONOMY7_METER_NO.click();
		TestUtil.selectByValues(SELECT_PAY_ELEC,"Monthly Direct Debit");
		ELEC_SRC_OF_HEAT_YES.click();
		
		Assert.assertTrue(ELEC_SRC_KWH.isDisplayed());
		ELEC_SRC_KWH.click();
		Assert.assertFalse(ELEC_SRC_CAL_TEXT.isDisplayed());
		
		Assert.assertTrue(ELEC_SRC_POUND.isDisplayed());
		ELEC_SRC_POUND.click();
		
		
	}

	@Step
	public void val_date_on_bill(String strArg1) {
		
		Assert.assertTrue(ELEC_SRC_CAL_TEXT.isDisplayed());
		Assert.assertTrue(ELEC_SRC_CAL_TEXT.getText().contains(strArg1));
		
	}

	@Step
	public void sel_economy_no() {
		
		ECONOMY7_METER_NO.click();
		Assert.assertTrue(ELEC_SRC_KWH.isDisplayed());
		ELEC_SRC_KWH.click();
	
	}
	
	@Step
	public void val_curr_elec_usg() {
		
		Assert.assertTrue(ELEC_SRC_KWH_TEXT1.isDisplayed());
		TestUtil.selectByValues(ELEC_SRC_KWH_SELECT,"Annually");
		ELEC_SRC_KWH_TEXT1.sendKeys("1200");
		
	}

	@Step
	public void sel_economy_yes() {
	
		ECONOMY7_METER_YES.click();
		Assert.assertTrue(ELEC_SRC_KWH.isDisplayed());
		ELEC_SRC_KWH.click();
		
	}

	@Step
	public void val_curr_elec_usg_yes() {
		
		Assert.assertTrue(ELEC_SRC_DAY_TIME_TXT.isDisplayed());
		Assert.assertTrue(ELEC_SRC_NIG_TIME_TXT.isDisplayed());
		Assert.assertTrue(ELEC_SRC_DAY_TIME_TXT.getText().contains("Daytime electricity used (Economy 7) in kWh"));
		
	}

	

	

}
