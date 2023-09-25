package ua.ithillel.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTest {

    @BeforeSuite
    public void beforeSuite() { System.out.println("Before Suite"); }
    @AfterSuite
    public void afterSuite() { System.out.println("After Suite"); }
    @BeforeTest
    public void beforeTest() { System.out.println("Before Test"); }
    @AfterTest
    public void afterTest() { System.out.println("After Test"); }
    @BeforeClass
    public void beforeClass() { System.out.println("Before Class"); }
    @AfterClass
    public void afterClass() { System.out.println("After Class"); }
    @BeforeMethod
    public void beforeMethod() { System.out.println("Before Method"); }
    @AfterMethod
    public void afterMethod() { System.out.println("After Method"); }


    @Test //"option button" + Enter for import class
    public void Test_1() {
        System.out.println("FirstTest.Test_1()");
        Assert.assertTrue(true);
    }

    @Test
    public void Test_2() {
        System.out.println("FirstTest.Test_2()");
        Assert.assertFalse(false);
    }
}
