package Strings;

import java.util.Scanner;

    /*
        * Problem Description
            You are given lowercase string (S) and you have to return a string that is the uppercase form of S.

        * Problem Constraints
            1 <= S.size() <= 1000

        * Input Format
            First and only argument containing a lowercase string S.

        * Output Format
            You have to return uppercase form of input string.
    */

public class LowToHigh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        // to upper case
        System.out.println(S.toUpperCase());

        // To lower case
        System.out.println(S.toLowerCase());
    }
}
