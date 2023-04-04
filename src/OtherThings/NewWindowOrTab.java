package OtherThings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class NewWindowOrTab {

    @Test
    public void testPopup() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://facebook.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://gmail.com");


        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(windows.get(0));

        System.out.println(driver.getTitle());


    }
}
