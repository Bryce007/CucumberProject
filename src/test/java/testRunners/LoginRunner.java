package testRunners;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features/Login.feature" }
, glue = { "stepDefinition" } 
,plugin = { "pretty", "html:test-output" }
,dryRun = true
, monochrome=true)

//pretty prints what is executed on the console. HTML is the name of the folder({"pretty" , "html:test-output"}
//monochrome=true-- gets rid of the numbers inside your console
//plugin creates a report. HTML is where we are storing that file
//put ,dryRun=true/false after the glue
//or put ,strict=true after the glue
//strict=true-- will fail execution if there are undefined or pending steps
//dryRun=true-- shows if you have any missing steps. Short term it is a scan your files
//dryRun=false-- lets you execute the test

public class LoginRunner {

}
