package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report 
 {
  public static ExtentReports generateReports()
  {
	ExtentSparkReporter htmlReport = new ExtentSparkReporter("myReports.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReport);
	extent.setSystemInfo("Project", "ProjectName");
	extent.setSystemInfo("User", "UserName");
	extent.setSystemInfo("Tester","TesterName");
	return extent;
  }
 }