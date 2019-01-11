/*this program reads unspecified number of only integers
 * and adds them. The program displays total sum and
 * shows error for non integer values
 */

package com.stackroute.PE1;

import static org.junit.Assert.*;

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
//test for success//
        @Test
        public void sumTestsuccess() {

            int expectedValue = 40;
            //Act
            int actualValue = object.total(12);
            actualValue = object.total(14);
            actualValue = object.total(14);
            //Assort
            assertEquals(expectedValue,actualValue);
        }
//test for failure//
        @Test
        public void sumTestfailure() {

            int expectedValue = 30;
            //Act
            int actualValue = object.total(12);
            actualValue = object.total(14);
            actualValue = object.total(14);
            //Assort
            assertNotEquals(expectedValue,actualValue);
        }

    }

