package testRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue= {"stepDefinitions"},
        monochrome = true,	
        plugin = {"pretty", "junit:target/automationreport.xml",
        		"json:target/automationreport.json",
        		"html:target/automationreport.html"})
public class Testrunner {

}