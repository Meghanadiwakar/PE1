/*Write a program that takes a character from the user/
*as input and determines whether the character entered is a capital letter/
* , a small case letter, a digit or a special symbol and display appropriately.
 */

package com.stackroute.PE1;

public class Characterdisplay {

//this method checks whether the entered input is digit or not//
    public String letterndigit(char h){

        if( h >=65 && h <= 90 )
        {
            return "The entered character is a Capital Letter";
        }
        else if( h >=97 && h <= 122 )
        {
            return "The entered character is a small Letter";
        }
        else if( h >= 48 && h <= 57 )
        {
            return "The entered character is a Digit";
        }
        else
        {
            return "The entered character is a Special Symbol";
        }

    }
}

