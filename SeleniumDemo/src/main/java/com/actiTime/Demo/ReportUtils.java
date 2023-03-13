package com.actiTime.Demo;

import org.testng.ITestResult;
import org.testng.annotations.Optional;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.observer.entity.MediaEntity;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportUtils {

	public static ExtentSparkReporter reporter;
	public static ExtentReports report;
	public static ExtentTest test;

	public void intializedReport() {
		reporter = new ExtentSparkReporter("SeleniumDemo_Report.html");
		reporter.config().setDocumentTitle("Selenium_Demo");
		report= new ExtentReports();
		report.attachReporter(reporter);
		report.flush();
	}

	public void createReport(String className) {
		test=report.createTest(className);
	}
	public void logStatus(String status,String useCase) {
		if(status.contains("INFO")) {
			test.info(MarkupHelper.createLabel(useCase, ExtentColor.BLUE));	
		}
		else if(status.contains("PASS")) {
			test.pass(MarkupHelper.createLabel(useCase, ExtentColor.GREEN));
		}
		else if(status.contains("FAIL")) {
			test.fail(MarkupHelper.createLabel(useCase, ExtentColor.RED));
		}
		else if(status.contains("WARNING")) {
			test.warning(MarkupHelper.createLabel(useCase, ExtentColor.YELLOW));
		}
	}
}
