package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(//or oldugunda herhangibir tanesi varsa calıstırır
        //and oldugunda her ikisininde senaryoda tag olarak olan senaryoları çalıştırır
        tags  ="@Regression or @SmokeTestr", //hangi senaryolarda bu etiket varsa onlar calısacak
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}


)




public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}// browser tipi vermek için,rapora ek parametre eklemek için sonra kullanılıcak bu bölüm kod olarak
