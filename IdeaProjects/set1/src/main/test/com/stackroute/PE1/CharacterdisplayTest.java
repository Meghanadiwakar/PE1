/*Write a program that takes a character from the user/
 *as input and determines whether the character entered is a capital letter/
 * , a small case letter, a digit or a special symbol and display appropriately.
 */
package com.stackroute.PE1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterdisplayTest {

    Characterdisplay obj;

    @Before
    public void setUp() {
        obj = new Characterdisplay();

    }

    @After
    public void tearDown() {
        obj = null;

    }

    @Test
    public void checkdigitsuccess() {
        String actualstr = obj.letterndigit('4');
        String expectedstr = "The entered character is a Digit";
        Assert.assertEquals(actualstr, expectedstr);

    }

    @Test
    public void checksymbolsuccess() {
        String actualstr = obj.letterndigit('a');
        String expectedstr = "The entered character is a small Letter";
        Assert.assertEquals(actualstr, expectedstr);

    }
}