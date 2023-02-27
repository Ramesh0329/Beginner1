package Begineers_Problems.Loops;

import java.util.Scanner;

    /*
        * Problem Description
            You are given two integers N and M, find the value of N raised to the power of M i.e. NM

        * Problem Constraints
            1 <= N <= 10
            0 <= M <= 9

        * Input Format
            First line of input contains an integer N.
            Second line of input contains an integer M.

        * Output Format
            Print the value of NM.
    */

public class FindPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ans = 1;
        for(int i = 1; i <= M; i++){
            ans = ans * N;
        }
        System.out.println(ans);
    }
}
