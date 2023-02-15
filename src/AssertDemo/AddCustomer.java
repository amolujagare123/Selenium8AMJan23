package AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomer {

    @Test
    public void addCustomer1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("Add C"));
        lnkAddCustomer.click();


       /* WebElement element = driver.findElement(By.name(""));
        element.sendKeys("");*/

        /*WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys("Ramya");

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("123456");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("223456");*/


        driver.findElement(By.name("Submit")).click();

        String expected = "PLEASE ENTER A CUSTOMER NAME";
        String actual = "";

        try {
            actual = driver.findElement(By.xpath("//label[@for='name']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");
    }

    @Test
    public void addCustomer2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("Add C"));
        lnkAddCustomer.click();


       /* WebElement element = driver.findElement(By.name(""));
        element.sendKeys("");*/

        String custName = "Ramya12";

        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys(custName);

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("123456");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("223456");


        driver.findElement(By.name("Submit")).click();


        String expected = "[ "+custName+" ] Customer Details Added !";
        String actual = "";

        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");
    }
}
