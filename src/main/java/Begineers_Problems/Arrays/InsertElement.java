package Begineers_Problems.Arrays;

import java.util.Scanner;

    /*
        * Problem Description
            Write a program to input N numbers array, a number X and a number
            Y from user and insert an element Y in it at specified position X.
            X is based on 1-based indexing.
            Note: When an element is inserted at position X, all elements that
            were already present at position >= X, gets shifted to one position right, not replaced.

        * Problem Constraints
            1 <= N <= 100
            1 <= A[i] <= 1000
            1 <= X <= N
            1 <= Y <= 1000

        * Input Format
            First line is N which represents number of elements.
            Second line contains N space separated integers.
            Third line is X position where Y has to be inserted.
            Fourth line is Y which is the value to be inserted.

        * Output Format
            N+1 space separated integers of the input array after inserting the element at required position.
    */

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        int Y = sc.nextInt();
        for(int i = 0; i < N; i++){
            if(i == X-1){
                System.out.print(Y + " " + A[i] + " ");
            }else{
                System.out.print(A[i] + " ");
            }
        }
    }
}
