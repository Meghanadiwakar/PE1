
/*this program reverses the string*/
package com.stackroute.PE1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringreverseTest {

    //this is for success//
    @Test
    public void demosuccess() {
        Stringreverse obj = new Stringreverse();
        String expectedValue = "123456789";
        //Act
        String actualValue=obj.function("987654321");
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    //this is for failure//
    @Test
    public void demofailure() {
        Stringreverse obj = new Stringreverse();
        String expectedValue = "12789";
        //Act
        String actualValue=obj.function("987654321");
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }

    //this is for notnull//
    @Test
    public void demonotnull() {
        Stringreverse obj = new Stringreverse();
        String expectedValue = "";
        //Act
        String actualValue=obj.function("");
        //Assert
        assertEquals(expectedValue,actualValue);
    }

}