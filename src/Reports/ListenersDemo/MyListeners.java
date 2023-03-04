package Reports.ListenersDemo;

import TestNGDemo.real.InitTests;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static Reports.utility.ForExtentReport.getExtentObject;
import static Reports.utility.ForExtentReport.theScreenshot;

    public class MyListeners extends InitTests implements ITestListener {
    ExtentReports extent;
    ExtentTest test;
    //WebDriver driver = new ChromeDriver();
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getMethod().getMethodName());

    }
    public void onTestSuccess(ITestResult result) {
        test.info(result.getMethod().getMethodName());
        test.pass("This test is passed");
    }

    public void onTestFailure(ITestResult result) {
        test.info(result.getMethod().getMethodName());
        test.fail(result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+theScreenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void onTestSkipped(ITestResult result) {
        test.skip("there could be some error:"+result.getThrowable());
    }

    public void onStart(ITestContext context)  // test tag starts
    {
        if(extent==null)
          extent = getExtentObject();
    }

    public void onFinish(ITestContext context)  // test tag ends
    {
        extent.flush();
    }
}
