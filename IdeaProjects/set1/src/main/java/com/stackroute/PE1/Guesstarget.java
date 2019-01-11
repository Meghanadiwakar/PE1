/*this program accepts a number and if it is in the range specified
* or matches the target separate messages appear accordingly
 */
package com.stackroute.PE1;

import java.util.Scanner;

public class Guesstarget {

    String guessInt(int inp, int num) {
        //Conditions for finding the original number
        if (inp > num) {
            return ("Number guessed is more than original number");
        } else if (inp < num) {
            return ("Number guessed is less than original number");
        }
        return ("Number guessed matches the original number");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = 20, inp = 0;
        Guesstarget obj = new Guesstarget();

        while (inp != num) {
            inp = input.nextInt();
            String outputStr = obj.guessInt(inp, num);
            System.out.println(outputStr);
        }
    }
}


