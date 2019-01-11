/*this is a program which takes in num and string
 *and last n  characters of integer
 *  should be repeated in string
 */

package com.stackroute.PE1;

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
//test for success//
    @Test
    public void repeatWordTestsuccess() {
        Repeatnumber repeatWord = new Repeatnumber();
        String expectedValue = "stackroutetete";
        //Act
        String actualValue = repeatWord.repeatNtimes("stackroute", 2);
        //Assert
        assertEquals(expectedValue, actualValue);

    }
//test checks for failure//
    @Test
    public void repeatWordTestfailure() {
        Repeatnumber repeatWord = new Repeatnumber();
        String expectedValue = "stackroutetete";
        //Act
        String actualValue = repeatWord.repeatNtimes("stackroute", 3);
        //Assert
        assertNotEquals(expectedValue, actualValue);

    }
//test checks for not null value//
    @Test
    public void repeatWordTestnull() {
        Repeatnumber repeatWord = new Repeatnumber();
        String expectedValue = "stackroutetete";
        //Act
        String actualValue = repeatWord.repeatNtimes("",0);
        //Assert
        assertNotEquals(expectedValue, actualValue);

    }

}

