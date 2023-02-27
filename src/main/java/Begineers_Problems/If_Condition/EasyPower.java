package Begineers_Problems.If_Condition;

import java.util.Scanner;

    /*
        * Problem Description
            You are given two integers A and B. You have to find the value of AB.
            NOTE: The value of AB will always be less than or equal to 109.

        * Problem Constraints
            1 <= A, B <= 1000

        * Input Format
            First line of the input contains a single integer A.
            Second line of the input contains a single integer B.

        * Output Format
            Print a single integer in single line.

    */

public class EasyPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(B == 0){
            System.out.println(1);
        }
        if(B == 1){
            System.out.println(A);
        }
        if(B != 0){
            int pow = (int)Math.pow(A,B);
            System.out.println(pow);
        }
    }
}
