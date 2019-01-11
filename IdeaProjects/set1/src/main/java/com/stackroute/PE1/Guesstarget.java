/*this program accepts a number and if it is in the range specified
* or matches the target separate messages appear accordingly
 */
package com.stackroute.PE1;

import java.util.Scanner;

public class Guesstarget {

    String guessInt(int inp, int num) {
        if (inp > 0) {
            //Conditions for finding the original number
            if (inp > num) {
                return ("Number guessed is more than original number");
            } else if (inp < num) {
                return ("Number guessed is less than original number");
            } else if (inp == num) {
                return ("Number guessed matches the original number");
            } else if (inp == 0) {
                return ("number is out of range ");
            }

        }
        return null;
    }
}
