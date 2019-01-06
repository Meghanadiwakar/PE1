/*program which accepts word and
*checks each letter for consonant or vowel
 */
package com.set1;

import java.util.Scanner;
public class Vowelnconsonant {

         public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your String");
            String str=input.nextLine();
            char c;
            for(int i=0; i<str.length() ;i++ ) {
                c=str.charAt(i);
                Vowelnconsonant obj = new Vowelnconsonant();
                System.out.println(obj.VCcheck(c));


            }

        }

    public String VCcheck(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return "vowel";
        } else {
            return "Consonant";
        }
    }


}


