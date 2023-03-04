package TestNGDemo.real;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites  extends InitTests{



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
