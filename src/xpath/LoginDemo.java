package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.amolujagare.com");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("Add C"));
        lnkAddCustomer.click();


        WebElement lnkViewCustomer = driver.findElement(By.linkText("View Customers"));
        lnkViewCustomer.click();

        String name = "Anita";
        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//input")).click();


    }
}
