package com.set1;

public class Characterdisplay {


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

