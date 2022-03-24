package com.adact.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Features\\booking.feature", glue = "com\\adact\\stepdef",
dryRun=false,monochrome = true,plugin = {
		"pretty","html:target\\ravi.html","json:target\\prasanna.json","junit:target\\unit.xml" })
public class TestRunner {
	
	public static void tearDown() {
		Reporting.jvmReport("C:\\Users\\Elcot\\eclipse-workspace\\Cucumberproject\\target\\prasanna.json");
	}

}
