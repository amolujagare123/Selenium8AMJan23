package DataProvider;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class LoginDataProviderEx {

    @Test (dataProvider = "getData")
    public void myTest1(String username,String password)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();
    }


    @DataProvider
    public Object[][] getData() throws IOException {
        // 1. read file
        FileInputStream fis = new FileInputStream("Data/myData.xls");
        //2. convert file object into workbook object
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        //3. choose sheet
        HSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][2];

        for (int i=0;i<rowCount;i++)
        {
            HSSFRow row = sheet.getRow(i);

            data[i][0] = row.getCell(0).toString().trim();
            data[i][1] = row.getCell(1).toString().trim();

        }

        /*data[0][0] = "Admin";
        data[0][1] = "admin123";

        data[1][0] = "pqr";
        data[1][1] = "xyz";

        data[2][0] = "aaa";
        data[2][1] = "ppp";

        data[3][0] = "amol";
        data[3][1] = "amol12";*/

        return data;
    }

}
