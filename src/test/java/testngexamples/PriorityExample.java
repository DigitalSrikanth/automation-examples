package testngexamples;

import org.testng.annotations.Test;

// lower priority values run first
// if one or more tests have the same priority, TestNG will run them in the order they defined
// if any test method doesn't set priority, TestNG will defaults to 0
public class PriorityExample {

    @Test(priority = 0)
    public void simpleTest1(){
        System.out.println("This is simple test 1");
    }
    @Test(priority = 1)
    public void simpleTest2(){
        System.out.println("This is simple test 2");
    }
    @Test(priority = 3)
    public void simpleTest3(){
        System.out.println("This is simple test 3");
    }
    @Test(priority = 4)
    public void simpleTest4(){
        System.out.println("This is simple test 4");
    }
    @Test(priority = 1)
    public void simpleTest5(){
        System.out.println("This is simple test 5");
    }
    @Test
    public void simpleTest6(){
        System.out.println("This is simple test 6");
    }

}
