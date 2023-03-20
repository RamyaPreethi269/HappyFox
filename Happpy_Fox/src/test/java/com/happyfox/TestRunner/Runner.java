package com.happyfox.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features\\happyfox.feature",glue = {"com.happyfox.Stepdefination","Hooks"},
stepNotifications = true,tags = "@Demo",dryRun = false,
plugin = "html:target\\report\\Happyfox.html")

public class Runner {

}
