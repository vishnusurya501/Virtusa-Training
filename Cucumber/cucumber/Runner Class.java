package cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Feature", glue="Stepdefinitions",dryRun=true, plugin = {"html:cucumber_report/report", "json:cucumber_report/json"}, tags = ("~@Simplelogin"))
public class openClass 
{
	
}
