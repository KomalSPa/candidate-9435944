package ho.qat.seo.testrunners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;


@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = {"src/test/resources/features/VisaConfirmation.feature"},
        glue = "ho.qat.seo.stepDefinitions",
        plugin = "pretty",
        tags = ""
)
public class TestRunner {
}

