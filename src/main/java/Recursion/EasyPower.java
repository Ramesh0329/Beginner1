package Recursion;

import java.util.Scanner;

    /*
        * Problem Description
            You are given two integers A and B. You have to find the value of A^B.
            NOTE: The value of A^B will always be less than or equal to 10^9.

        * Problem Constraints
            1 <= A, B <= 1000

        * Input Format
            First line of the input contains a single integer A.
            Second line of the input contains a single integer B.

        * Output Format
            Print a single integer in single line.

    */

public class EasyPower {
    public static int power(int A, int B){
        if(B == 0){
            return 0;
        }
        if(B == 1){
            return A;
        }else{
            return A * power(A, B-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(power(A,B));
    }
}
