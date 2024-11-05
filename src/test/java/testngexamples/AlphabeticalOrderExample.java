package testngexamples;

import org.testng.annotations.Test;

// if no priority defined, TestNG will start executing the tests in alphabetical Order
// alphabetical Order execution applicable to only the test methods which doesn't have the priority set
public class AlphabeticalOrderExample {

    @Test
    public void aSimpleTest(){
        System.out.println("Simple Test A");
    }
    @Test
    public void cSimpleTest(){
        System.out.println("Simple Test C");
    }
    @Test
    public void eSimpleTest(){
        System.out.println("Simple Test E");
    }
}
