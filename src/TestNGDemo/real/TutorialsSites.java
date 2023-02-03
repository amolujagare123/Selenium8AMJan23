package TestNGDemo.real;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites {

    WebDriver driver;

    @BeforeClass  // this method will run before first test method of the class
    public  void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass  // this method will run after last test method of the class
    public  void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void tutorialspoint()
    {

        driver.get("https://www.tutorialspoint.com/index.htm");

    }

    @Test
    public void w3schools()
    {

        driver.get("https://www.w3schools.com/index.htm");

    }



}
