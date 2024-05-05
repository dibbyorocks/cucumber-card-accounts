package Cucumber_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"},
        features = {"src/test/java/cucumber_bdd.feature"} ,
glue="Step_definition" , stepNotifications = true)
public class runner {

}
