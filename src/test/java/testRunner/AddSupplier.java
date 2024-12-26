package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./featureFiles/supplier.feature"},monochrome = true,glue = {"stepDefinitions"}, plugin = {"pretty","html:target/Cucmber-Supplier"})

public class AddSupplier {

}
