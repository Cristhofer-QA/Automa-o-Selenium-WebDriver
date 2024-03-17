package runner;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@FixMethodOrder
@RunWith(Cucumber.class)
@CucumberOptions(
	monochrome = true,
	tags = "@test",
	features = {"src/test/resources/features"},
	glue = {"steps"},
	plugin = {"pretty",
			  "html:target/reports/Relatorio.html"
			}
)
public class RunCucumberTest extends RunBase{

}
