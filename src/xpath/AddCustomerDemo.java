package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomerDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();


        WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[@href='add_customer.php']"));
        lnkAddCustomer.click();


       /* WebElement element = driver.findElement(By.name(""));
        element.sendKeys("");*/

        WebElement txtName = driver.findElement(By.xpath("//*[@name='name']"));
        txtName.sendKeys("Ramya");

        WebElement txtAddress = driver.findElement(By.xpath("//*[@name='address']"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.xpath("//*[@name='contact1']"));
        txtContact1.sendKeys("123456");

        WebElement txtContact2 = driver.findElement(By.xpath("//*[@name='contact2']"));
        txtContact2.sendKeys("223456");


        driver.findElement(By.xpath("//*[@name='Submit']")).click();
    }
}
