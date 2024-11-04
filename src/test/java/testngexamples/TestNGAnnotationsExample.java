package testngexamples;

import org.testng.annotations.*;

// Basic annotations of TestNG
// Added Thread.sleep() for better observation of the output while execution
public class TestNGAnnotationsExample {

    @BeforeSuite
    public void beforeSuite() throws InterruptedException {
        System.out.println("BeforeSuite: Executed before all tests in the suite.");
        Thread.sleep(2000);
    }
    @BeforeTest
    public void beforeTest() throws InterruptedException {
        System.out.println("BeforeTest: Executed before any test method in this test class.");
        Thread.sleep(2000);
    }
    @BeforeClass
    public void beforeClass() throws InterruptedException {
        System.out.println("BeforeClass: Executed before the first method in the current class.");
        Thread.sleep(2000);
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        System.out.println("BeforeMethod: Executed before each test method");
        Thread.sleep(2000);
    }
    @Test
    public void simpleTest() throws InterruptedException {
        System.out.println("Test: This is a simple test method");
        Thread.sleep(2000);
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        System.out.println("AfterMethod: Executed after each test method");
        Thread.sleep(2000);
    }
    @AfterClass
    public void afterClass() throws InterruptedException {
        System.out.println("AfterClass: Executed after the last method in the current class.");
        Thread.sleep(2000);
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        System.out.println("AfterTest: Executed after all test methods in this test class.");
        Thread.sleep(2000);
    }
    @AfterSuite
    public void afterSuite() throws InterruptedException {
        System.out.println("AfterSuite: Executed after all tests in the suite.");
        Thread.sleep(2000);
    }
}
