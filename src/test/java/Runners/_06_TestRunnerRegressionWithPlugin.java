package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        tags  ="@Regression or @SmokeTestr",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json"}//jenkins için 4 runners tan eklendi
        //plugin = {"html:target\\cucumber-reports.html"}
)



public class _06_TestRunnerRegressionWithPlugin extends AbstractTestNGCucumberTests {


}
