/*program to check whether the num is palindrome
*and print sum of even numbers present
 * if it is greater than 25*/

package com.stackroute.PE1;
import java.util.Scanner;

public class Palindrome {
    public int check(long k) {

        long rev=0, rem, sum=0;
        long temp=k;
        while(temp!=0){
            rem=temp%10;

            if(rem%2==0)
                sum=sum+rem;

            rev=rev*10+rem;
            temp=temp/10;
        }
        if(k!=rev)
            return 0;
        else{
            if(sum>25)
                return 1;
            else
                return 2;
        }
    }

    public static void main(String[] args){

        int p;
        Palindrome q = new Palindrome();

        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.println("Input number: ");

        /** number might be long and not fit in int*/
        long n= sc.nextLong();
        p= q.check(n);

        /** checking if the number and its reverse are same */
        if(p==0){
            System.out.println(n + " is not a palindrome");
        }
        else{
            if(p==1){
                System.out.println(n + " is a palindrome and the sum of even numbers is greater than 25");
            }
            else{
                System.out.println(n + " is a palindrome and the sum of even numbers is less than 25");
            }
        }
    }

    public static class Characterdisplay
    {

        public static void main(String[] args)
        {
            char s;
            Scanner input=new Scanner(System.in);
            s =input.next().charAt(0);
            if( s >=65 && s <= 90 )
            {
                System.out.println("Capital Letter");
            }
            else if( s >=97 && s <= 122 )
            {
                System.out.println("Small Letter");
            }
            else if( s >= 48 && s <= 57 )
            {
                System.out.println("Digit");
            }
            else
            {
                System.out.println("Special Symbol");
            }

        }
    }
}


