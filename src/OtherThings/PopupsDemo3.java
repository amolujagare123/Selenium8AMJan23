package OtherThings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopupsDemo3 {


    @Test
    public void testPopup() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

        driver.switchTo().frame("iframeResult");

        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

       String expected = "Amol Ujagare";

        Alert alert = driver.switchTo().alert();

        alert.sendKeys(expected);

        Thread.sleep(4000);
        alert.accept(); // press ok

        String actual = driver.findElement(By.id("demo")).getText();

        System.out.println("actual="+actual);
        System.out.println("expected="+expected);


        Assert.assertTrue(actual.contains(expected),"Enterd text is not appeared");

    }
}
