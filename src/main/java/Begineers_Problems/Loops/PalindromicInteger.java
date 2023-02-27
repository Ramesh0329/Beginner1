package Begineers_Problems.Loops;

import java.util.Scanner;

    /*
        * Problem Description
            Take an integer A as input, determine whether it is palindromic or not.
            A palindrome integer is an integer X for which reverse(X) = X where reverse(X) is X with its digits reversed.
            For e.g., reverse(123) = 321. Note : There will be no zeros at the start of a number.

        * Problem Constraints
            1 <= A <= 106

        * Input Format
            First and the only line contains a single integer A.

        * Output Format
            Print Yes if it is palindromic, else print No.
    */

public class PalindromicInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int temp = A;
        int pal = 0;
        while(temp > 0){
            int rem = temp % 10;
            pal = pal * 10 + rem;
            temp = temp / 10;
        }
        if(pal == A){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
