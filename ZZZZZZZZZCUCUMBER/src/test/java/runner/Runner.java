package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature",
        		 glue={"setpDefinationram"},
        	
        		 plugin={"pretty",
        				 "json:target/MyReport/report.json",
        				 "junit:target/MYReport/report.xml"
})
public class Runner {
	
	
	

}
