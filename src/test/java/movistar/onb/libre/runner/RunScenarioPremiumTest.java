package movistar.onb.libre.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/scenarioPremium.feature",
                 glue = "movistar.onb.libre.stepdefinitions",
                  snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunScenarioPremiumTest {
}
