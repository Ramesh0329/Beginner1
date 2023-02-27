package Begineers_Problems.Arrays;

import java.util.Scanner;

    /*
        * Problem Description
            Write a program to print the input array A of size N in reverse order
            where you have to take integer N and further N elements as input from user.

        * Problem Constraints
            1 <= N <= 1000
            1 <= A <= 1000

        * Input Format
            A single line representing N followed by N integers of the array A

        * Output Format
            A single line containing N space separated integers representing elements of the input array in reverse order.
    */

public class PrintInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        for(int j = A.length - 1; j >= 0; j--){
            System.out.print(A[j] + " ");
        }
    }

}
