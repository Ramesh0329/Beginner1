package If_Condition;

import java.util.Scanner;

    /*
    * Problem Description
        Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.

    * Problem Constraints
        1 <= A <= 1000000

        1 <= B <= 1000000

        1 <= C <= 1000000

    * Input Format
        First line is a single integer A.
        Second line is a single integer B.
        Third line is a single integer C.

    * Output Format
        One line containing an integer as per the question.
    * */


public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A >= B && A >= C){
            System.out.println(A);
        }else if(B >= C) {
            System.out.println(B);
        }else{
            System.out.println(C);
        }
    }
}
