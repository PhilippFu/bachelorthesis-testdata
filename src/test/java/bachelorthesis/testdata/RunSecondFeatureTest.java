package bachelorthesis.testdata;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/TES-2.json"},
        glue = {"bachelorthesis.testdata"},
        tags = {"@Feature2"},
        features = {"src/test/resources/bachelorthesis.testdata/"})
public class RunSecondFeatureTest {
}