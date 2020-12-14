package testRunnerfor_cucu;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= {"specDefinitions"},
        plugin = { "html:target/Report-html"},
        monochrome = true
        )

public class Runnercucu {

}
