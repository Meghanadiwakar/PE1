/*this program uses a loop to print
*numbers upto nth iteration
 */

package com.set1;

import java.util.Scanner;

public class Iteration {
    String function(int num)
    {
        String str;
        str="";
        for( int i=1; i<=num; i++ )
        {
            for( int j=1; j<=i ;j++ )
            {
                str=str+Integer.toString(i)+" ";
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int num=input.nextInt();
        Iteration obj = new Iteration();
        System.out.println(obj.function(num));

    }
}
