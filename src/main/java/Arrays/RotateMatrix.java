package Arrays;

import java.util.Arrays;
import java.util.Scanner;

    /*
        * Problem Description
            You are given a n x n 2D matrix A representing an image.
            Rotate the image by 90 degrees (clockwise).
            You need to do this in place.
            Note: If you end up using an additional array, you will only receive partial score.

        * Problem Constraints
            1 <= n <= 1000

        * Input Format
            First argument is a 2D matrix A of integers

        * Output Format
            Return the 2D rotated matrix.
    */

public class RotateMatrix {
    public static int[][] rotate(int[][] arr){
        //System.out.println("I am in rotate:::::");
        int N = arr.length;
        int M = arr[0].length;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                //System.out.println("Am I in infinite::::111111:");
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i < N; i++){
            int low = 0;
            int high = N-1;
            while(low < high){
                //System.out.println("Am I in infinite::::22222222:");
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++;
                high--;
            }
        }
        //System.out.println("Am i successfull!!!! ");
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int N = sc.nextInt();
        System.out.println("Enter m ");
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.println("Enter i: "+i+" j: "+j);
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                int[][] ans = rotate(arr);
                System.out.print(Arrays.deepToString(ans));
            }
        }
    }
}
