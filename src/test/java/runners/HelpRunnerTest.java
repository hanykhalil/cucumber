/**
 *
 */
package runners;

/**
 * @author 13465
 *
 */

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\13465\\eclipse\\workspace\\cucumber\\src\\test\\java\\cucumber\\features"
, glue = "stepDefintionTest", tags = "@regression", plugin = {"pretty", "html:target/reports/cucumberReport.html", "json:target/reports/cucumberReport.json"}, monochrome = true)
public class HelpRunnerTest {

}
