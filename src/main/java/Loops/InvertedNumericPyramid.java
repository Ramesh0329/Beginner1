package Loops;

import java.util.Scanner;

    /*
    * Problem Description

        Take an integer N as input, print the corresponding Numeric Inverted Half Pyramid pattern for N.
        For example if N = 4 then pattern will be like:

        1 2 3 4
        1 2 3
        1 2
        1

    * Problem Constraints

        1 <= N <= 100

    * Input Format

        First and only line of input contains a single integer N.

    * Output Format

        Output the Numeric Inverted Half Pyramid pattern corresponding to the given N.
        NOTE: There should be no extra spaces after last integer and
        before first integer in any row and all integers in any row
        in the pattern are space separated.
    * */

public class InvertedNumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            int val = 1;
            for(int j = N; j >= i; j--){
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }
}
