package bddFinal.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class TestRunnerFinal {

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "C:\\Users\\Himmat\\Desktop\\Class_Spartan\\Final-Project\\Final-project\\src\\test\\resources\\Features\\homePage.feature",
            glue = "bddFinal.SetUpDefination",
            dryRun = false
    )
}
