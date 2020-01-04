package newfacebook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features", tags="@Test",
plugin= {"pretty","json:target/cucumber.json","html:target/cucumber.htmal.reporty"},
dryRun=false)



public class runner {

}
