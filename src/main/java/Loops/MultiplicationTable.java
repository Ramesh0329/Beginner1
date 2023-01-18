package Loops;

import java.util.Scanner;


    /*
        * Problem Description

            Write a program to print the multiplication table of the number entered by the user, N.

            The table for input N = 5 should get displayed in the following form:

            5 * 1 = 5
            5 * 2 = 10
            5 * 3 = 15
            5 * 4 = 20
            5 * 5 = 25
            5 * 6 = 30
            5 * 7 = 35
            5 * 8 = 40
            5 * 9 = 45
            5 * 10 = 50

        * Problem Constraints

            1 <= N <= 100

        * Input Format

            First and only line of input contains an integer N.

        * Output Format

            Output the Multiplication Table in the given form.
    * */

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d", N, i, N*i ).println();
        }
    }
}
