package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features", // feature file
		glue = "StepsDefinations", // step definition
		tags = "@SkyColor", // comes from feature file.
		monochrome = true, // makes it readable in the console
		dryRun = false, // will compile & execute, if TRUE it will not run and give nothing in console
		plugin = { 
				"pretty", "html:target/cucumber", "json:target/cucumber.json"

		})
public class Runner {

}