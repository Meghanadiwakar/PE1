/*this program uses a loop to print
*numbers upto nth iteration
 */

package com.stackroute.PE1;

import java.util.Scanner;

public class Iteration {

    //this method function checks for iteration//
    String function(int num) {
        String str;
        str = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                str = str + Integer.toString(i) + " ";
            }
        }
        return str;
    }
}
