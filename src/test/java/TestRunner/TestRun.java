package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import net.serenitybdd.cucumber.CucumberWithSerenity;


//@RunWith(CucumberWithSerenity.class)
@RunWith(Cucumber.class)
@CucumberOptions
		(
		features= {".//Features/"},
		glue="stepDefinitions",
		dryRun=false,
	//	monochrome=true,
		plugin= {"pretty","html:test-output"}//,
	//	tags= {"@sanity, @regression"}
		)

public class TestRun {

 
}
