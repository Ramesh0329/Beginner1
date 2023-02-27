package Begineers_Problems.If_Condition;

import java.util.Scanner;

    /*
        * Problem Description
            Given 2 non-negative integers A and B, find gcd(A, B)
            GCD of 2 integers A and B is defined as the greatest
            integer 'g' such that 'g' is a divisor of both A and B.
            Both A and B fit in a 32 bit signed integer.
            Note: DO NOT USE LIBRARY FUNCTIONS.

        * Problem Constraints
            0 <= A, B <= 109

        * Input Format
            First argument is an integer A.
            Second argument is an integer B.

        * Output Format
            Return an integer denoting the gcd(A, B).
    */

public class GreatestCommonDivisor {
    public static int gcd(int A, int B){
        if(A == 0){
            return B;

        }
        return gcd(B%A, A);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(gcd(A,B));
    }
}
