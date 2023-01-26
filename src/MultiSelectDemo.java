import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amolujagare.com/sample");

        // 1. find the web element
        WebElement multi = driver.findElement(By.id("multiSel"));

        // 2. create the object of select class
        Select selMulti = new Select(multi);

        // 3. select the option
        Thread.sleep(4000);

        selMulti.selectByIndex(2);

        Thread.sleep(4000);
        selMulti.selectByIndex(0);

        Thread.sleep(4000);
        selMulti.selectByIndex(3);


        Thread.sleep(4000);
        selMulti.deselectByIndex(0);

        Thread.sleep(4000);
        selMulti.deselectByIndex(2);

        Thread.sleep(4000);
        selMulti.deselectByIndex(3);

    }
}
