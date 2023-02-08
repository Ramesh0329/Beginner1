package Arrays;

import java.util.Scanner;

public class KthSmallestElement {
    public static int KthLeastElement(int[] A, int K){
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
