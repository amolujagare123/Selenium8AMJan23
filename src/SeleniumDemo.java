import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {


       //WebDriver driver = new ChromeDriver(); // upcasting



     //  WebDriver driver = new FirefoxDriver();

      //  WebDriver driver = new EdgeDriver();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://facebook.com");
        Thread.sleep(4000);

        driver.navigate().to("http://gmail.com");
        Thread.sleep(4000);

        driver.navigate().back();
        Thread.sleep(4000);

        driver.navigate().forward();
        Thread.sleep(4000);

        driver.navigate().refresh();




    }
}
