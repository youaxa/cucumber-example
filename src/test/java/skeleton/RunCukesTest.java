package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"pretty", "html:target/cucumber", "json:target/cucumber/skeleton.json" },
		features = {"classpath:skeleton"},
		glue = {"classpath:skeleton"})
public class RunCukesTest {
}
