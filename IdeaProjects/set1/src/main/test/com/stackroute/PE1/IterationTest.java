
/*this program uses a loop to print
 *numbers upto nth iteration
 */
package com.stackroute.PE1;

import static org.junit.Assert.*;


    import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationTest {
        Iteration object;

        @Before
        public void setUp() {
            object = new Iteration();
        }

        @After
        public void tearDown() {
            object = null;
        }
        @Test
        public void demosuccess()
        {
            Iteration obj = new Iteration();
            String expectedValue = "1 2 2 3 3 3 ";
            //Act
            String actualValue=obj.function(3);
            //Assert
            assertEquals(expectedValue,actualValue);

        }
    @Test
    public void demofailure()
    {
        Iteration obj = new Iteration();
        String expectedValue = "1 3 3 ";
        //Act
        String actualValue=obj.function(3);
        //Assert
        assertNotEquals(expectedValue,actualValue);

    }


    }