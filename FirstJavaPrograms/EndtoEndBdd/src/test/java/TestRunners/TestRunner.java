package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\AppFeatures\\Guru.feature", glue = { "stepDefinitions" }, plugin = { "pretty",
        "html:target/cucumber-reports/html", "json:target/cucumber-reports/json",
        "junit:target/cucumber-reports/xml" }, monochrome = true, dryRun = true, publish = true)

public class TestRunner {

}
