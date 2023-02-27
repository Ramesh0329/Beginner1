package Begineers_Problems.Loops;

import java.util.Scanner;

    /*
        * Problem Description
            Take a number A as input in binary format (Base = 2).
            You have to print the number in decimal format (Base = 10).

        * Problem Constraints
            1 <= A <= 210

        * Input Format
            First and only line contains a single binary number A.

        * Output Format
            Print in a single line, a decimal integer.
    */

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int sum = 0;
        int power = 1;
        while(A != 0){
            int lastDigit = A % 10;
            sum = sum + (lastDigit * power);
            power = power * 2;
            A = A/10;
        }
        System.out.println(sum);
    }
}
