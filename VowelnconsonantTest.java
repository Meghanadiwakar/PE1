package com.set1;

import com.set1.Vowelnconsonant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelnconsonantTest {
    Vowelnconsonant object;

    @Before
    public void setUp() {
        object = new Vowelnconsonant();
    }

    @After
    public void tearDown() {
        object = null;
    }


    @Test
    public void demo()
    {
        Vowelnconsonant obj = new Vowelnconsonant();
        String expectedValue = "Consonant";
        //Act
        String actualValue=obj.VCcheck('h');
        //Assert
        assertEquals(expectedValue,actualValue);

        expectedValue = "vowel";
        //Act
        actualValue=obj.VCcheck('a');
        //Assert
        assertEquals(expectedValue,actualValue);
    }


}