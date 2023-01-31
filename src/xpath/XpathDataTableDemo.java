package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDataTableDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://openclinic.sourceforge.net/openclinic/admin/staff_list.php");

        String name = "Galaxy";

        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//img[@alt='edit']")).click();


    }
}
