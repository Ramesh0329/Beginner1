package Begineers_Problems.Recursion;

import java.util.Scanner;

    /*
        * Problem Description
            Given two numbers A & B. Return their product.

        * Problem Constraints
            1 <= A <= 104
            1 <= B <= 104

        * Input Format
            First argument is an integer A.
            Second argument is an integer B.

        * Output Format
            Return an integer which is the product of A & B.

    */

public class MultiplyTheNumbers {
    public static int product(int A, int B){
        if(B == 0){
            return 0;
        }
        if(B == 1){
            return A;
        }else{
            return A + product(A, B-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(product(A,B));
    }
}
