import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) throws InterruptedException {




        WebDriver driver = new ChromeDriver();

        //driver.manage().window().maximize();

        driver.get("http://facebook.com");
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://gmail.com");


        Thread.sleep(2000);
        //driver.close(); // closes current window only

        driver.quit(); // closes all the windows opened by the driver






    }
}
