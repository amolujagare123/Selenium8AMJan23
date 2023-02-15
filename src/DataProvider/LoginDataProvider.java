package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginDataProvider {

    @Test (dataProvider = "getData")
    public void myTest1(String username,String password)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();
    }


    @DataProvider
    public Object[][] getData()
    {
        String[][] data = new String[4][2];

        data[0][0] = "Admin";
        data[0][1] = "admin123";

        data[1][0] = "pqr";
        data[1][1] = "xyz";

        data[2][0] = "aaa";
        data[2][1] = "ppp";

        data[3][0] = "amol";
        data[3][1] = "amol12";

        return data;
    }

}
