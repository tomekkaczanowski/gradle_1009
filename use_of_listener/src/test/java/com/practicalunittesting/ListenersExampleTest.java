package com.practicalunittesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: tomek
 * Date: 7/28/11
 * Time: 10:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListenersExampleTest {

    @DataProvider
    private static final Object[][] someData(){
        return new Object[][] {{1}, {2}, {3}, {4}, {5}};
    }

    @Test(dataProvider = "someData", invocationCount = 10)
    public void testExample(int i) {
        assertTrue(i > 2);
    }

    @Test
    public void someTest() {
        assertTrue(false);
    }

    @Test(dependsOnMethods = "someTest")
    public void someDependantTest() {
        assertTrue(true);
    }

    @Test(dependsOnMethods = "someTest")
    public void someDependantTestB() {
        assertTrue(true);
    }

    @Test(dependsOnMethods = "someTest")
    public void someDependantTestC() {
        assertTrue(true);
    }

    @Test(dependsOnMethods = "someTest")
    public void someDependantTestD() {
        assertTrue(true);
    }
}
