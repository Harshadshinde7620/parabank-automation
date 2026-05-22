package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/features",

        glue = {"stepdefinitions", "hooks"},

        tags = "@Task1",

        plugin = {

                "pretty",

                "html:testOutputs/cucumber-report.html",

                "json:testOutputs/cucumber.json",

                "junit:testOutputs/cucumber.xml"
        },

        monochrome = true,

        dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests {

}