package Reports.extentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static Reports.utility.ForExtentReport.theScreenshot;

public class LoginTest {
    ExtentReports extent;
    @BeforeClass
    public void initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock management System");
        reporter.config().setReportName("regression testing");
        reporter.config().setTheme(Theme.DARK);

        extent.setSystemInfo("Developers Name","Neha");
        extent.setSystemInfo("Testers Name","Kirti");
        extent.setSystemInfo("Project Name","Stock management System");
        extent.setSystemInfo("Start Date","1 Jan 2023");
        extent.setSystemInfo("Deadline","31 March 2023");
        extent.setSystemInfo("Test Configuration","OS : windows / browser : chrome");
    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }


    @Test
    public void loginTest3() throws IOException {
        ExtentTest test = extent.createTest("valid Login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);


        try {
            Assert.assertEquals(actual,expected,"This is not a dashboard");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {

            test.addScreenCaptureFromPath("./screenshots/"+theScreenshot(driver));
            test.fail(e.getMessage());
        }
    }
    @Test
    public void loginTest1() throws IOException {
        ExtentTest test = extent.createTest("invalid Login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin11");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin11");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);


        try {
            Assert.assertEquals(actual,expected,"This is not a dashboard");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
          //  test.fail(e.getMessage());
       //    test.addScreenCaptureFromPath("D:\\Study\\CucumberPOM-Aug22\\Selenium8AMJan23\\Report\\screenshots\\"+theScreenshot(driver));


           test.addScreenCaptureFromPath("./screenshots/"+theScreenshot(driver));
            test.fail(e.getMessage());
        }
       /* String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a dashboard");*/
    }
    @Test
    public void loginTest2() throws IOException {
        ExtentTest test = extent.createTest("blank Login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("username is entered blank");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("password is entered blank");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);


        try {
            Assert.assertEquals(actual,expected,"This is not a dashboard");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
           // test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+theScreenshot(driver));
            test.fail(e.getMessage());
        }

       /* String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a dashboard");*/
    }
}
