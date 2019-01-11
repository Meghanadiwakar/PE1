/*this program reverses the string*/

package com.stackroute.PE1;

import java.util.Scanner;
public class Stringreverse {

    //this is for reversing the string//
    public String function(String str) {

        if (str != null) {
            String s;
            s = "";
            /*Reversing of string*/
            for (int i = str.length() - 1; i >= 0; i--) {
                s = s + str.charAt(i);
            }
            return s;

        }
        return null;
    }
}

