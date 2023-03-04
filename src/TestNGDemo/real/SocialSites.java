package TestNGDemo.real;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites  extends InitTests {


    @Test (priority = 2)
    public void facebook()
    {
        driver.get("http://facebook.com");
    }
    @Test (priority = 3)
    public void instagram()
    {
        driver.get("http://instagram.com");

        Assert.assertEquals(driver.getTitle(),
                "InstaFB"
        ,"This is not instagram");
    }
    @Test (priority = 3)
    public void twitter()
    {
        driver.get("http://twitter.com");
    }
    @Test (priority = 4)
    public void linkedIn()
    {
        driver.get("http://linkedin.com");
    }






}
