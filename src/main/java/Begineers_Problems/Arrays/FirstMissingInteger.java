package Begineers_Problems.Arrays;

import java.util.Scanner;

    /*
        * Problem Description
            Given an unsorted integer array, A of size N. Find the first missing positive integer.
            Note: Your algorithm should run in O(n) time and use constant space.

        * Problem Constraints
            1 <= N <= 1000000
            -109 <= A[i] <= 109

        * Input Format
            First argument is an integer array A.

        * Output Format
            Return an integer denoting the first missing positive integer.
    */

public class FirstMissingInteger {
    public static int FirstMissingPositiveInteger(int[] A){
        int N = A.length;
        for(int i = 0; i < N; i++){
            if(A[i] > 0 && A[i] < N){
                int index = A[i] - 1;
                if(index != i && A[index] != A[i]){
                    int temp = A[index];
                    A[index] = A[i];
                    A[i] = temp;
                }
            }
        }
        for(int i = 0; i < N; i++){
            if(A[i] != i + 1){
                return i + 1;
            }
        }
        return N + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        System.out.println(FirstMissingPositiveInteger(A));
    }
}
