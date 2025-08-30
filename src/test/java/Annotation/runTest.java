package Annotation;
import io.cucumber.java.en.Given;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = {"test.java.Annotation"}
        )


public class runTest {

}
