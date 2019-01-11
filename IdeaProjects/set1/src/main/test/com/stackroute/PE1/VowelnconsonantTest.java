/*program which accepts word and
 *checks each letter for consonant or vowel
 */

package com.stackroute.PE1;

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

//test for success//
    @Test
    public void demosuccess()
    {
        Vowelnconsonant obj = new Vowelnconsonant();
        String expectedValue = "Consonant";
        //Act
        String actualValue=obj.VCcheck('f');
        //Assert
        assertEquals(expectedValue,actualValue);

        expectedValue = "vowel";
        //Act
        actualValue=obj.VCcheck('a');
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    //test for failure//
    @Test
    public void demofailure()
    {
        Vowelnconsonant obj = new Vowelnconsonant();
        String expectedValue = "Consonant";
        //Act
        String actualValue=obj.VCcheck('e');
        //Assert
        assertNotEquals(expectedValue,actualValue);

        expectedValue = "vowel";
        //Act
        actualValue=obj.VCcheck('p');
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }

    //test for notnull//
    @Test
    public void demonotnull()
    {
        Vowelnconsonant obj = new Vowelnconsonant();
        String expectedValue = null;
        //Act
        String actualValue=obj.VCcheck('\0');
        //Assert
        assertEquals(expectedValue,actualValue);

        expectedValue = null;
        //Act
        actualValue=obj.VCcheck('\0');
        //Assert
        assertEquals(expectedValue,actualValue);
    }


}
