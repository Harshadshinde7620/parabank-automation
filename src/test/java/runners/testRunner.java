package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class testRunner {

	
	@CucumberOptions(
		
			features="src/test/java/features",
			glue= "stepdefinitions",
			tags="@Task1",
			plugin= {
					"pretty",   								// Console output
					
	                "html:testOutputs/cucumber-report.html",	// HTML report

	                "json:testOutputs/cucumber.json",			// JSON report

	                "junit:testOutputs/cucumber.xml"
},
			monochrome = true,                               // Clean console output
		    dryRun = false                                   // Check for missing step definitions
					)

	public class TestRunner extends AbstractTestNGCucumberTests{
	}
}

