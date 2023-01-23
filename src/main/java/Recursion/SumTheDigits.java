package Recursion;

import java.util.Scanner;

    /*
        * Problem Description
            Take T (number of test cases) as input.
            For each test case, take integer N as input and Print the sum of digits of that number.

        * Problem Constraints
            1 <= T <= 1000
            0 <= N <= 100000000

        * Input Format
            The first line is T which means the total number of test cases.
            Each of the next T lines contain an integer N.

        * Output Format
            T lines each containing one integer representing the sum of the digits of the input integer.
    */

public class SumTheDigits {
    public static int sum(int N){
        if(N == 0){
            return 0;
        }
        if(N == 1){
            return N;
        }else{
            return (N % 10) + sum(N/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            System.out.println(sum(N));
        }

    }
}
