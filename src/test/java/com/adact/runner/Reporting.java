package com.adact.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;

import net.masterthought.cucumber.Configuration;


public class Reporting {
	
	public static void jvmReport(String JsonFile) {
		
		File report = new File("C:\\Users\\Elcot\\eclipse-workspace\\Cucumberproject\\src\\test\\java\\com\\adact\\runner\\Report");
		Configuration configuration = new Configuration(report,"Ravi Project");
		configuration.addClassifications("tester", "Ravi");
		configuration.addClassifications("Browser", "chrome");
		List<String> al = new ArrayList<String>();
     al.add(JsonFile);
     ReportBuilder builder = new ReportBuilder(al, configuration);
     builder.generateReports();
	}
}