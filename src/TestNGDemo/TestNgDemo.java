package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgDemo {
    WebDriver driver;
    @BeforeClass
    public void myTest1()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test
    public void addCustomer()
    {
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("Add C"));
        lnkAddCustomer.click();


       /* WebElement element = driver.findElement(By.name(""));
        element.sendKeys("");*/

        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys("Ramya");

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("123456");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("223456");


        driver.findElement(By.name("Submit")).click();
    }


    @Test
    public void myTest2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("dsdsd");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("ewewew");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test
    public void myTest3()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

}
