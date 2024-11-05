package testngexamples;

import org.testng.annotations.Test;

// Tests with unspecified priority (aSimpleTest,zSimpleTest,bSimpleTest) will be assigned to default = 0
// TestNG now will execute (aSimpleTest,zSimpleTest,bSimpleTest and simpleTest1) in alphabetical order
// simpleTest2 with priority = 1 run last
public class PriorityWithAlphabeticalOrderExample {

    @Test(priority = 0)
    public void simpleTest1(){
        System.out.println("This is simple test 1");
    }
    @Test
    public void aSimpleTest(){
        System.out.println("This is Simple Test A");
    }
    @Test
    public void zSimpleTest(){
        System.out.println("This is Simple Test Z");
    }
    @Test
    public void bSimpleTest(){
        System.out.println("This is Simple Test B");
    }
    @Test(priority = 1)
    public void simpleTest2(){
        System.out.println("This is Simple Test 2");
    }
}
