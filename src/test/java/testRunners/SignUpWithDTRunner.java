package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import testUtils.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Features"}
,glue= {"SignUpWithDTSteps"}
,dryRun=true)

public class SignUpWithDTRunner extends BaseClass {
	
}
