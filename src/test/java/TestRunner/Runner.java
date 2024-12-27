package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "C:\\Users\\prati\\IdeaProjects\\Luma\\src\\test\\FeatureFiles"
            ,glue={"StepDefinitions"}
    )

    public class Runner {

    }
