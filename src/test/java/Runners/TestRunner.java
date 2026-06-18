package Runners;

import Tests.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = "StepDefinitions",
features = "src/main/resources/Features",
plugin =  {
        "pretty",
        "html:target/cucumber-reports/report.html",
        "json:target/cucumber-reports/cucumber.json"
        })
public class TestRunner extends TestBase {
}
