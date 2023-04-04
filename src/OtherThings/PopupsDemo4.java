package OtherThings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopupsDemo4 {


    @Test
    public void testPopup() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_popup");

        driver.switchTo().frame("iframeResult");

       WebElement popUpText = driver.findElement(By.xpath("//div[@class='popup']"));
        popUpText.click();

        WebElement popUp = driver.findElement(By.xpath("//span[@id='myPopup']"));
        System.out.println(popUp.getText());
        Thread.sleep(4000);
        popUp.click();

    }
}
