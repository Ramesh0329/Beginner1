package Loops;

import java.util.Scanner;

    /*
        * Problem Description
            Given an integer A, find and return the Ath magic number.
                A magic number is defined as a number that can be expressed as a
                power of 5 or a sum of unique powers of 5.
                First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….

        * Problem Constraints
            1 <= A <= 5000

        * Input Format
            The only argument given is integer A.

        * Output Format
            Return the Ath magic number.
    */

public class FindNthMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int power = 5;
        int sum = 0;
        while(A > 0) {
            int reminder = A % 2;
            sum = sum + (reminder * power);
            power = power * 5;
            A = A/2;
        }
        System.out.println(sum);
    }
}
