/*program which accepts word and
*checks each letter for consonant or vowel
 */
package com.stackroute.PE1;

import java.util.Scanner;
public class Vowelnconsonant {

    //  this checks for vowels //
    public String VCcheck(char c) {
        if (c != '\0' ) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                return "vowel";
            } else {
                return "Consonant";
            }
        }
        return null;

    }
}


