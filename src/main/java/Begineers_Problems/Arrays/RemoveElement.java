package Begineers_Problems.Arrays;

import java.util.Scanner;

    /*
        * Problem Description
            Write a program to input N numbers array from user and an integer X and
            print the array by deleting element at specified position X.

        * Problem Constraints
            1 <= N <= 100
            1 <= A[i] <= 1000
            1 <= X <= N

        * Input Format
            First line is N which means number of elements.
            Second line contains N space separated integers.
            Third line is X position which has to be deleted.

        * Output Format
            N-1 space separated integers of the input array after deleting the element at required position.
    */

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        for(int i = 0; i < N; i++){
            if(i == X-1){
                continue;
            }else{
                System.out.print(A[i] + " ");
            }
        }
    }
}
