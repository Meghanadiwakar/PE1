

package com.set1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecreasingsortTest {

    Decreasingsort ob =new Decreasingsort();
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void sumOfNumbers() {
        int expectedValue = 4;
        //Act
        int actualValue = ob.sumOfNumbers(1232);
        //assert
        assertEquals(expectedValue,actualValue);

    }
}