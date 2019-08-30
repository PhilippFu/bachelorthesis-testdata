package bachelorthesis.testdata;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/TES-1.json"},
        glue = {"bachelorthesis.testdata"},
        tags = {"@Feature1"},
        features = {"src/test/resources/bachelorthesis.testdata/"})
public class RunFirstFeatureTest {
}

