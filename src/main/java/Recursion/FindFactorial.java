package Recursion;

import java.util.Scanner;

    /*
        * Problem Description
            Write a program to find the factorial of the given number A.

        * Problem Constraints
            0 <= A <= 12

        * Input Format
            First and only argument is an integer A.

        * Output Format
            Return an integer denoting the factorial of the number A.
    */

public class FindFactorial {
    public static int fact(int A){
        if(A == 0 || A == 1){
            return A;
        }else{
            return A * fact(A-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(fact(A));
    }
}
