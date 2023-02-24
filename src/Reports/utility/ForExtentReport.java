package Reports.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReport {

    public static String theScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot
        // assign current driver to it

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. using ts call the method getScreenshotAs
        // & store this screenshot into file object
        File srcFile = ts.getScreenshotAs(OutputType.FILE);


        String timeStamp = new SimpleDateFormat("_ddMMyyyyhhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. create an image (real)
        FileUtils.copyFile(srcFile, new File("Report\\screenshots\\"+fileName));

        return fileName;
    }


    public static ExtentReports getExtentObject()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("HR management System");
        reporter.config().setReportName("regression testing");
        reporter.config().setTheme(Theme.DARK);

        extent.setSystemInfo("Developers Name","Madhavi");
        extent.setSystemInfo("Testers Name","Roshan");
        extent.setSystemInfo("Project Name","HR management System");
        extent.setSystemInfo("Start Date","1 Feb 2023");
        extent.setSystemInfo("Deadline","20 April 2023");
        extent.setSystemInfo("Test Configuration","OS : windows / browser : chrome");

        return extent;

    }
}
