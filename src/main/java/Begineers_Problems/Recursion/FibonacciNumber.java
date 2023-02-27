package Begineers_Problems.Recursion;

import java.util.Scanner;

    /*
        * Problem Description
            Given a positive integer A, write a program to find the Ath Fibonacci number.
            In a Fibonacci series, each term is the sum of the previous two terms and
            the first two terms of the series are 0 and 1. i.e. f(0) = 0 and f(1) = 1.
            Hence, f(2) = 1, f(3) = 2, f(4) = 3 and so on.
            NOTE: 0th term is 0. 1th term is 1 and so on.

        * Problem Constraints
            0 <= A <= 44

        * Input Format
            First and only argument is an integer A.

        * Output Format
            Return an integer denoting the Ath Fibonacci number.
    */

public class FibonacciNumber {
    public static int fibo(int A){
        int ans = 0;
        if(A == 0 || A == 1){
            return A;
        }else{
            int f1 = fibo(A-1);
            int f2 = fibo(A-2);
            ans = f1 + f2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(fibo(A));
    }
}
