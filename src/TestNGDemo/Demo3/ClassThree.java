package TestNGDemo.Demo3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }


    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classThreeTest2(String url1,String username,String password)
    {
        String url = url1;
        /*String username = "amol";
        String password = "amol1234";*/
        System.out.println("url ="+url);
        System.out.println("username ="+username);
        System.out.println("password ="+password);

        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }

    @BeforeSuite
    public void beforeMySuite()
    {
        System.out.println("beforeMySuite");
    }

    @AfterSuite
    public void afterMySuite()
    {
        System.out.println("afterMySuite");
    }
}
