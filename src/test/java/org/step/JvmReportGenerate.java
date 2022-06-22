package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportGenerate {
	
	public static void jvmReports(String jsonpath) {
		
		//file path
		File f = new File(System.getProperty("user.dir")+"\\Report\\JVM report");
		
		//configuration class
		Configuration c = new Configuration(f, "fb login function");
		c.addClassifications("Tools", "Eclipse");
		c.addClassifications("Lang", "Java");
		
		//List
		
		List<String> l = new ArrayList();
		l.add(jsonpath);
		
		//create object for report builder class
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
	
	
	
	
	}

}
