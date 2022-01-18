package utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporterNG {

	static ExtentReports extent;


	public static ExtentReports extentReportGenerator() 
	{
		String reportPath=System.getProperty("user.dir")+"\\Project reports\\index1.html";
		System.out.println("Extent Reporting");
		ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
		spark.config().setReportName("Automation Results");
		spark.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		return extent;
	}


}
