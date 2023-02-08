package Arrays;

import java.util.Scanner;

    /*
        * Problem Description
            Find the Bth smallest element in given array A .
            NOTE: Users should try to solve it in less than equal to B swaps.

        * Problem Constraints
            1 <= |A| <= 100000
            1 <= B <= min(|A|, 500)
            1 <= A[i] <= 109

        * Input Format
            The first argument is an integer array A.
            The second argument is integer B.

        * Output Format
            Return the Bth smallest element in given array.
    */

public class KthSmallestElement {
    public static int KthLeastElement(int[] A, int K){
        /*
            * find smallest element in the array
            * then swap that element as last element(N-1) in the array.
            * then swap next smallest element next to the last element.
            * once swap the all the elements find the K-1 element because its zero based index.
        */

        for(int i = 0; i < K; i++){
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j = i; j < A.length; j++){
                if(A[j] < min){
                    min = A[j];
                    index = j;
                }
            }
            int temp = A[i];
            A[i] = A[index];
            A[index] = temp;
        }
        return A[K-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        System.out.println(KthLeastElement(A,K));

    }
}
