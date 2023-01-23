package Recursion;

import java.util.Scanner;

    /*
        * Problem Description
            You are given an integer N, print 1 to N using using recursion.

        * Problem Constraints
            1 <= N <= 105

        * Input Format
            First line contains an integer N.

        * Output Format
            Print N space-separated integers 1 to N.
            Note: There should be exactly one space after each integer.
    */

public class Print1ToN {
    public static void printnum(int N){
        if(N <= 0){
            return;
        }else{
            printnum(N-1);
            System.out.print(N + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printnum(N);
    }
}
