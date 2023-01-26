import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amolujagare.com/sample");

        WebElement java = driver.findElement(By.id("check0"));
        WebElement selenium = driver.findElement(By.id("check1"));
        WebElement cucumber = driver.findElement(By.id("check2"));

        Thread.sleep(5000);
        // make all check boxes un ticked

        if (java.isSelected())
            java.click();

        if (selenium.isSelected())
            selenium.click();

        if (cucumber.isSelected())
            cucumber.click();

    }
}
