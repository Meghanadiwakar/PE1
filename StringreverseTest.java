package com.set1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringreverseTest {
    @Test
    public void demo() {
        Stringreverse obj = new Stringreverse();
        String expectedValue = "123456789";
        //Act
        String actualValue=obj.function("987654321");
        //Assert
        assertEquals(expectedValue,actualValue);
    }

}