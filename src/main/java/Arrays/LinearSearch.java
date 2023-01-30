package Arrays;

import java.util.Scanner;

    /*
        * Problem Description
            You are given an array of integers A of length N and an integer B.
            Return 1 if B is present in the array A, 0 otherwise.

        * Problem Constraints
            1 <= N <= 105
            1 <= Ai <= 109
            1 <= B <= 109

        * Input Format
            First argument is the integer array A.
            Second argument is the integer B.

        * Output Format
            Return 1 / 0, depending on the presence of B.
    */

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        boolean isPresent = false;
        for(int i = 0; i < A.length; i++){
            if( A[i] == B){
                isPresent = true;
                break;
            }
        }
        if(isPresent){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
