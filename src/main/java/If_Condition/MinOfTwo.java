package If_Condition;


    /*
    * Problem Description
        Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.

    * Problem Constraints
        1 <= A <= 1000000

        1 <= B <= 1000000

    * Input Format
        First line is a single integer A.
        Second line is a single integer B.

    * Output Format
        One line containing an integer as per the question.
    * */

import java.util.Scanner;

public class MinOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Math.min(A,B));
    }
}
