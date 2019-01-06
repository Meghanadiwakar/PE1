package com.set1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterdisplayTest {
    Characterdisplay object;

    @Before
    public void setUp() {
        object = new Characterdisplay();
    }

    @After
    public void tearDown() {
        object = null;
    }


    @Test
    public void demo()
    {
        Characterdisplay obj = new Characterdisplay();
        String expectedValue = "The entered character is a small Letter";
        //Act
        String actualValue=obj.letterndigit('h');
        //Assert
        assertEquals(expectedValue,actualValue);

        expectedValue = "The entered character is a Digit";
        //Act
        actualValue=obj.letterndigit('6');
        //Assert
        assertEquals(expectedValue,actualValue);
    }


}