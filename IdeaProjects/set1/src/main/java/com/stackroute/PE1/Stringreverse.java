/*this program reverses the string*/

package com.stackroute.PE1;

import java.util.Scanner;
public class Stringreverse {

    public String function(String str)
    {

        String s;
        s="";
        /*Reversing of string*/
        for( int i=str.length()-1 ; i >= 0 ; i-- )

        {
            s=s+str.charAt(i);
        }
        return s;

    }
        public static void main(String[] args)
        {
            String str;
            Scanner in=new Scanner(System.in);
            str=in.nextLine();
            Stringreverse obj=new Stringreverse();
            System.out.println(obj.function(str));

        }
}


