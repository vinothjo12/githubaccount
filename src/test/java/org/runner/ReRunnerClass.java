package org.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JvmReportGenerate;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(features ="@src\\test\\resources\\RerunFiles",
glue="org.step", monochrome=true, dryRun=false, snippets=SnippetType.CAMELCASE, strict=true,  plugin = {"pretty",
		"json:C:\\Users\\VINOTH.S\\eclipse-workspace\\CucumberDataTable\\Report\\JsonReport\\vinothJson.json",
		"rerun:C:\\Users\\VINOTH.S\\eclipse-workspace\\CucumberDataTable\\src\\test\\resources\\RerunFiles\\failed.txt"})

public class ReRunnerClass {
	
	@AfterClass
	public static void report() {
		JvmReportGenerate.jvmReports("C:\\Users\\VINOTH.S\\eclipse-workspace\\CucumberDataTable\\Report\\JsonReport\\vinothJson.json");
	}

}
