package org.stepdefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.json.Json;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
glue = "org.stepdefinition", monochrome = true, 
dryRun = false, tags = {"@Smoke"},
plugin = {"html:Report", "json:Report\\Jsunreport1.json", "junit:Report\\junitreports.xml"})
public class TestRunner {

}
