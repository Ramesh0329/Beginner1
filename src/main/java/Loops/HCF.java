package Loops;

import java.util.Scanner;

    /*
        * Problem Description
            Write a program to input an integer T which represents the number of test cases.
            For each test case input two integers A and B in two different lines.
            For each pair of A and B print the HCF of the given two numbers.

        * Problem Constraints
            1 <= T <= 1000
            1 <= A,B <= 1000000

        * Input Format
            The first line of input contains T which means number of test cases.
            Next 2T lines contains input A and B for each testcase.
            First line of each testcase contain an integer A and second line of the testcase contains input B.

        * Output Format
            T lines each containing an integer representing HCF of A & B.
    */

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int hcf = 1;
            for(int j = 1; j<= A && j <= B; j++){
                if(A % j == 0 && B % j == 0){
                    hcf = j;
                }
            }
            System.out.println(hcf);
        }
    }
}
