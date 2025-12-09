package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(
		features="src/test/resources/Smartphones.feature",
				
				
					glue="stepdef",
		
				  plugin = {"pretty", "html:target/Cucumber-report.html"}
		)

public class Runner {

}









	
	

