package Recursion;

import java.util.Scanner;

    /*
        * Problem Description
            Write a function that takes to positive integers A and B and returns their LCM.

        * Problem Constraints
            1 <= A,B <= 109

        * Input Format
            The first argument is a single integer A
            The second argument is a single integer B

        * Output Format
            Return a single integer that is the LCM of A and B.
    */

public class LCM {
    public static int gcd(int A, int B){
        if(A == 0){
            return B;
        }
        return gcd(B%A, A);
    }
    public static int lcm(int A, int B){
        return (A/gcd(A,B)) * B;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(lcm(A,B));
    }
}
