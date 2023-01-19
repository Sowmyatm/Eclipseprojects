package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(name = "\'Login\'", plugin = {"pretty","html:src/main/resources/demo.html"} , monochrome= true, features="src\\main\\java\\features", glue = "steps")
@RunWith(Cucumber.class)
public class SFDCRunner {

	
	
}

