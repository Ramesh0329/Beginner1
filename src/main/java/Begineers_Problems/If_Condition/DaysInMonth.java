package Begineers_Problems.If_Condition;

import java.util.Scanner;

    /*
        * Problem Description
            You are given an integer A.
            You have to tell how many days are there in the month denoted by A in a non-leap year.
            Months are denoted as follows:
            January : 1
            February : 2
            March : 3
            April : 4
            May : 5
            June : 6
            July : 7
            August : 8
            September : 9
            October : 10
            November : 11
            December : 12

        * Problem Constraints
            1 <= A <= 12

        * Input Format
            The input contains a single integer A.

        * Output Format
            Print a single integer denoting the number of days on a single line.
    */

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A == 1 || A == 3 || A == 5 || A == 7 || A == 8 || A == 10 || A == 12){
            System.out.println("31");
        }else if(A == 4 || A == 6 || A == 9 || A == 11){
            System.out.println("30");
        }else {
            System.out.println("28");
        }
    }
}
