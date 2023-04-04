package OtherThings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PopupsDemo2 {


    @Test
    public void testPopup() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

        driver.switchTo().frame("iframeResult");

        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

        Thread.sleep(4000);

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

       // alert.accept(); // press ok
        alert.dismiss(); // press close or escape
    }
}
