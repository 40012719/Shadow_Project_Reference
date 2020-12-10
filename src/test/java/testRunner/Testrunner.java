package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		 features = "src/test/resources/features",
	        glue= "stepDefinitions",
	        monochrome = true )
		

public class Testrunner {

}
