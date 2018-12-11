package com.syntax.cucumberproject.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features= "/Users/Bryce/eclipse-workspace/CucumberProject/src/test/resources/Features/Registration.feature"
					,glue ="/Users/Bryce/eclipse-workspace/CucumberProject/src/test/java/com/syntax/cucumberproject/test/stepDefinitions/RegistrationSteps.java" )
	
	public class RegistrationRunner {
		
	}

