package Loops;

import java.util.Scanner;

    /*
        * Problem Description
            You are given an integer A, you need to find and return the sum of all the even numbers between 1 and A.
            Even numbers are those numbers that are divisible by 2.

        * Problem Constraints
            1 <= N <= 500

        * Input Format
            First and only argument is an integer A.

        * Output Format
        Return an integer denoting the sum of even numbers between [1, A] (both inclusive).

     */

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= A; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
