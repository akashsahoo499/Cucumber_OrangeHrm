package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./FeatureFiles/AdminLogin.feature"},monochrome= true,
glue= {"./stepDefinition\\AdminLoginSteps.java"})
public class Runner {

}
