

package com.set1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntergersumTest {
    Intergersum object;

    @Before
    public void setUp() {
        object = new Intergersum();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void sumTest() throws Exception {

        int expectedValue = 40;
        //Act
        int actualValue = object.total(12);
        actualValue = object.total(14);
        actualValue = object.total(14);
        //Assort
        assertEquals(expectedValue,actualValue);
    }

}