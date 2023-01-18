package Loops;

import java.util.Scanner;


    /*
        * Problem Description

            Given an integer N as input, print the corresponding Full Numeric Pyramid pattern for N.
            For example if N = 5 then pattern will be like:

            0 0 0 0 1 0 0 0 0
            0 0 0 2 3 2 0 0 0
            0 0 3 4 5 4 3 0 0
            0 4 5 6 7 6 5 4 0
            5 6 7 8 9 8 7 6 5

            NOTE: There should be exactly one extra space after each number for each row.

        * Problem Constraints

            2 <= N <= 100

        * Input Format

            First and only line of input contains a single integer N.

        * Output Format

            Output the Full Pyramid pattern corresponding to the given N.

        NOTE:There is no extra space before the first integer of any row.
        There is an extra space after the last integer of any row.
        All the integers in any row are space separated
    * */

public class FullNumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
           int cnt = 1;
           for(int j = 1; j <= N-i; j++){
               System.out.print("0 ");
               cnt++;
           }
           int val = i;
           for(int k = i; k <= 2*i-1; k++){
               System.out.print(val + " ");
               val++;
               cnt++;
           }
           val = val -2;
           for(int l = 1; l <= i-1; l++){
               System.out.print(val + " ");
               val--;
               cnt++;
           }
            for(int j = 1; j <= N-i; j++){
                System.out.print("0 ");
                cnt++;
            }
            System.out.println();
        }
    }
}
