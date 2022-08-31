package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_02_Country.feature"},
        glue = {"StepDefinitions"},

        dryRun = true// true oldugunda testi calıstırma sadece feature lara ait stepler var mı?
//   dry false olur ise testi calıstırıyor ki koymamıza gerek yok olmadıgında sistem öyle algılıyor.


)

public class _02__02_TestRunnerBelirliFeaturelar extends AbstractTestNGCucumberTests {




}
