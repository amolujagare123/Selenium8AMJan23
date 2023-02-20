package Reports.ScreenshotDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyScreenshot {

    @Test
    public void sample() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://instagram.com");

        // 1. create the object reference of TakesScreenshot
        // assign current driver to it

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. using ts call the method getScreenshotAs
        // & store this screenshot into file object
        File srcFile = ts.getScreenshotAs(OutputType.FILE);


        String timeStamp = new SimpleDateFormat("_ddMMyyyy").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. create an image (real)
        FileUtils.copyFile(srcFile, new File("D:\\programs\\"+fileName));


    }


}
