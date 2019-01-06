/*program accepts integer and
*prints tom if odd, jerry if even
*provided num is between 20 and 30
**/

package com.set1;

import java.util.Scanner;
public class Tomnjerry {

    String func(int n)
    {
        if (n % 2 ==0)
        {
            if ((n >= 20) && (n <= 30)) /*checking for the condition*/
            {
                return "Jerry";
            }
        }

        if (n>=20 && n<=30)
        {
            return "Tom";
        }
        else {
            return "Condition is not satisfied";
        }

    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n;
        n = in.nextInt();
        Tomnjerry obj=new Tomnjerry();
        System.out.println(obj.func(n));


    }
}