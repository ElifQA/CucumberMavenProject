package com.hrms.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/features"
		,glue="com.hrms.Steps"
		,dryRun=false
		,tags= {"@regression"}
		,plugin= {"pretty", "html:target/htm/cucumber-default-report"}
				,monochrome=true
		)


public class RegressionRunner {

}
