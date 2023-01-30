package Arrays;

import java.util.Scanner;

    /*
        * Problem Description
            Write a program to print all negative numbers from input array A of size N.
            Take integer N and N elements of the array as input from user.

        * Problem Constraints
            1 <= N <= 1000
            -1000 <= A <= 1000

        * Input Format
            A single line representing N followed by N integers of the array A

        * Output Format
            A single line containing elements from the input array which are negative in the same order.
    */

public class NegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < A.length; i++){
            if( A[i] < 0){
                System.out.println(A[i] + " ");
            }
        }

    }
}
