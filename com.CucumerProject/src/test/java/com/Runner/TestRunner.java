package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/FeatureFiles",
		
		glue="com.StepDefenitions",
		
		monochrome = true,
		
		plugin = {"pretty", "html:target/cucumber-reports/report.html"},
		
		publish = true,
		
		tags = "@Review"
		
			)

public class TestRunner {
	

}
