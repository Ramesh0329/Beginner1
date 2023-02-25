package Strings;

import java.util.Scanner;

    /*
        * Problem Description
            You are given two character strings A and B.
            You have to find the first occurrence of string B in string A, as a substring,
            and return the starting position of first occurrence.
            A substring is a contiguous sequence of characters within a string.
            For e.g "at" is a substring in "catalogue".

        * Problem Constraints
            1 <= |A|, |B| <= 1000
            A[i], B[i] ∈ ['a'-'z']

        * Input Format
            First argument is a character string A.
            Second argument is a character string B.

        * Output Format
            Return an integer denoting the starting position of first occurrence,
            or return -1 to report that there is no such occurrence.
    */

public class FirstOccurrenceOfWord {
    public static int solve(String A, String B){
        String res = A.replaceFirst(B,"*");
        if(A.equals(B)){
            return -1;
        }
        for(int i = 0; i < A.length(); i++){
            if(res.charAt(i) == '*'){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println(solve(A,B));
    }
}
