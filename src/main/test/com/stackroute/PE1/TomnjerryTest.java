/*program accepts integer and
*prints tom if odd, jerry if even
*provided num is between 20 and 30
**/

package com.stackroute.PE1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomnjerryTest {
//object of the class//
        Tomnjerry obj =new Tomnjerry();

        @Before
        public void setUp()throws Exception {

        }

        @After
        public void tearDown() throws Exception {
            obj = null;
        }


//this checks for success//
        @Test
        public void demosuccess()
        {
            Tomnjerry obj = new Tomnjerry();
            String expectedValue = "Jerry";
            //Act
            String actualValue=obj.func(22);
            //Assert
            assertEquals(expectedValue,actualValue);
        }

        //this checks for failure//
    @Test
    public void demofailure()
    {
        Tomnjerry obj = new Tomnjerry();
        String expectedValue = "Jerry";
        //Act
        String actualValue=obj.func(13);
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }


    //this checks for null value//
    @Test
    public void demonotnull()
    {
        Tomnjerry obj = new Tomnjerry();
        String expectedValue = null;
        //Act
        String actualValue=obj.func(-1);
        //Assert
        assertEquals(expectedValue,actualValue);
    }


    }
