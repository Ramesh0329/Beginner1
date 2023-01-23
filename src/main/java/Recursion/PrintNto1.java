package Recursion;

import java.util.Scanner;

    /*
        * Problem Description
            You are given an integer N, print N to 1 using using recursion.

        * Problem Constraints
            1 <= N <= 105

        * Input Format
            First line contains an integer N.

        * Output Format
            Print N space-separated integers N to 1.
            Note: There should be exactly one space after each integer.
    */

public class PrintNto1 {
    public static void printNum(int N){
        if(N <= 0){
            return;
        }else{
            System.out.print(N + " ");
            printNum(N-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printNum(N);
    }
}
