
/*program to check whether the num is palindrome
 *and print sum of even numbers present
 * if it is greater than 25*/
package com.stackroute.PE1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    //test for failure//
    @Test
    public void testCheckNotPalindrome(){
        Palindrome test = new Palindrome();
        int result = test.check(234356);
        assertEquals(0, result);
    }
//test for palindrome sum > 25//
    @Test
    public void testCheckPalindromeSumGreater(){
        Palindrome test = new Palindrome();
        int result = test.check(2468642);
        assertEquals(1, result);
    }

    //test for palindrome sum > 25//
    @Test
    public void testCheckPalindromeSumLess(){
        Palindrome test = new Palindrome();
        int result = test.check(12345654321L);
        assertEquals(2, result);
    }


}

