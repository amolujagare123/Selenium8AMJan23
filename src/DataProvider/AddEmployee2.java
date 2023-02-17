package DataProvider;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class AddEmployee2 {
    WebDriver driver ;
    @BeforeClass
    public void doLogin() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("Admin");
        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin123");
        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();
        driver.findElement(By.xpath("//span[contains(@class,'main-menu') and normalize-space()='PIM']")).click();
    }


    @Test(dataProvider = "getData")
    public void addEmpTest(String fName,String mName,String lName,String id) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath(" //a[normalize-space()='Add Employee']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fName); // First name
        driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys(mName); // middle name
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lName); // Last name
        driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"))
                .sendKeys(id); //id
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        Thread.sleep(3000);
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        // 1. read file
        FileInputStream fis = new FileInputStream("Data/myData.xls");
        //2. convert file object into workbook object
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        //3. choose sheet
        HSSFSheet sheet = workbook.getSheet("Add Employee 2");
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount-1][colCount];

        for (int i=0;i<rowCount-1;i++)
        {
            HSSFRow row = sheet.getRow(i+1);

            data[i][0] = row.getCell(0).toString().trim();
            data[i][1] = row.getCell(1).toString().trim();
            data[i][2] = row.getCell(2).toString().trim();
            data[i][3] = row.getCell(3).toString().trim();

        }

        return data;
    }
}
