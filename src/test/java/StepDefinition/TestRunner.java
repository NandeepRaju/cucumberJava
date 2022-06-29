package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"StepDefinition"}, monochrome = true,
plugin = {"pretty", "html:target/HtmlReports/report.html", "json:target/JsonReports/report.json", "junit:target/JUnitReports/report.xml"}, 
tags = "@Smoke")
public class TestRunner {

}
