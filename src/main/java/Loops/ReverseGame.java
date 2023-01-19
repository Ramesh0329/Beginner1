package Loops;

import java.util.Scanner;

    /*
        * Problem Description
            Write a program that accepts T numbers(N) from the user and find reverse of the given number(N).

        * Problem Constraints
            1 <= T <= 100
            1 <= N <= 100000000

        * Input Format
            First line is T which means number of test cases.
            Each next N lines contain an integer N.

        * Output Format
            T lines each containing reverse of the input integer.
    */

public class ReverseGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i <= T; i++){
            int N = sc.nextInt();
            int rev = 0;
            while(N != 0){
                int rem = N % 10;
                rev = rev * 10 + rem;
                N = N/10;
            }
            System.out.println(rev);
        }
    }
}
