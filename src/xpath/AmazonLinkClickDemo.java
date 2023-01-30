package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkClickDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/s?k=amol+ujagare");

        //driver.findElement(By.xpath("//*[normalize-space()='please click here to go to the facebook page']")).click();
        driver.findElement(By.xpath("//img[contains (@alt, 'Kick Start - Automation Testing')]")).click();


    }
}
