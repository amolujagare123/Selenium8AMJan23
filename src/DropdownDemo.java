import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amolujagare.com/sample");

        // 1. find the web element
        WebElement txt = driver.findElement(By.id("seltext"));

        // 2. create the object of select class
        Select selTxt = new Select(txt);

        // 3. select the option
        Thread.sleep(4000);
        //selTxt.selectByIndex(2);
       /// selTxt.selectByVisibleText("text 2");

        selTxt.selectByValue("v12");
    }
}
