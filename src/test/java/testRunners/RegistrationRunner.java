package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Registration.feature"
,glue = "src/test/java/com/syntax/cucumberproject/test/stepDefinitions/RegistrationSteps.java"
)

public class RegistrationRunner {

}
