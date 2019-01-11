/*this program accepts a number and if it is in the range specified
        * or matches the target separate messages appear accordingly
        */

package com.stackroute.PE1;

import static org.junit.Assert.*;

    import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

    public class GuesstargetTest {
        Guesstarget obj;
        @Before
        public void setUp()  {
            obj = new Guesstarget();
        }

        @After
        public void tearDown() throws Exception {
            obj = null;
        }
//test for success//
        @Test
        public void IntGuess1Success() {
            String actualStr = obj.guessInt(10,20);
            String expectedStr = "Number guessed is less than original number";
            assertEquals(actualStr,expectedStr);
        }
//test for success//
        @Test
        public void IntGuess2Success() {
            String actualStr = obj.guessInt(30,20);
            String expectedStr = "Number guessed is more than original number";
            assertEquals(actualStr,expectedStr);
        }
//test for success//
        @Test
        public void IntGuess3Success() {
            String actualStr = obj.guessInt(20,20);
            String expectedStr = "Number guessed matches the original number";
            assertEquals(actualStr,expectedStr);
        }

//test for failure//
        @Test
        public void IntGuess4failure() {
            String actualStr = obj.guessInt(-1,20);
            String expectedStr =null;
            assertEquals(actualStr,expectedStr);
        }
    }

