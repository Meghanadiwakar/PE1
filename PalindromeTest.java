package com.set1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void testCheckNotPalindrome(){
        Palindrome test = new Palindrome();
        int result = test.check(234356);
        assertEquals(0, result);
    }

    @Test
    public void testCheckPalindromeSumGreater(){
        Palindrome test = new Palindrome();
        int result = test.check(2468642);
        assertEquals(1, result);
    }

    @Test
    public void testCheckPalindromeSumLess(){
        Palindrome test = new Palindrome();
        int result = test.check(12345654321L);
        assertEquals(2, result);
    }


}