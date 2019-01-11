/*program to check whether the num is palindrome
*and print sum of even numbers present
 * if it is greater than 25*/

package com.stackroute.PE1;
import java.util.Scanner;

public class Palindrome {
    //this is the method which checks for palindrome//
    public int check(long k) {

        long rev = 0, rem, sum = 0;
        long temp = k;
        while (temp != 0) {
            rem = temp % 10;

            if (rem % 2 == 0)
                sum = sum + rem;

            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (k != rev)        //return 0 if not palindrome//
            return 0;
        else {
            if (sum > 25)   //return 1 if sum of even numbers is more than 25//
                return 1;
            else
                return 2;     //return 2 if sum is less than 25//
        }
    }
}


