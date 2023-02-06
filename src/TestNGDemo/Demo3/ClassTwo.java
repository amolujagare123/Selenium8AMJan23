package TestNGDemo.Demo3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @BeforeTest
    public void beforeMyTest()
    {
        System.out.println("beforeMyTest");
    }

    @AfterTest
    public void afterMyTest()
    {
        System.out.println("afterMyTest");
    }

    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classTwoTest1(String url1,String username,String password)
    {
        String url = url1;
        /*String username = "amol";
        String password = "amol1234";*/
        System.out.println("url ="+url);
        System.out.println("username ="+username);
        System.out.println("password ="+password);
        System.out.println("classTwoTest1");
    }

    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
