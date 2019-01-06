package com.set1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatnumberTest {
    Repeatnumber object;

    @Before
    public void setUp() {
        object = new Repeatnumber();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void repeatWordTest() {
        Repeatnumber repeatWord = new Repeatnumber();
        String expectedValue = "stackroutetete";
        //Act
        String actualValue = repeatWord.repeatNtimes("stackroute", 2);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

}