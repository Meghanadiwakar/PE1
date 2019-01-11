/*this program accepts number and sorts in decreasing order
 * and sums up all even numbers
 * if the sum is above 15 it prints true,and false if not
 */

package com.stackroute.PE1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecreasingsortTest {
    Decreasingsort obj;

    @Before
    public void setUp(){
        obj = new Decreasingsort();
    }

    @After
    public void tearDown(){
        obj = null;
    }

    //this checks for success//
    @Test
    public void checkdecreasingsortsuccess(){
        int expectedValue = 4;
        //Act
        int actualValue = obj.sumOfNumbers(1232);
        //assert
        assertEquals(expectedValue,actualValue);

    }

    //this checks for failure//
    @Test
    public void checkdecreasingsortfailure(){
        int expectedValue = 4;
        //Act
        int actualValue = obj.sumOfNumbers(12);
        //assert
        assertNotEquals(expectedValue,actualValue);

    }

    //this checks for not null//
    @Test
    public void checkdecreasingsortnotnull(){
        int expectedValue = 0;
        //Act
        int actualValue = obj.sumOfNumbers(-2);
        //assert
        assertEquals(expectedValue,actualValue);

    }

}