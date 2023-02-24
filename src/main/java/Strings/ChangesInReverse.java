package Strings;

import java.util.Scanner;

    /*
        * Problem Description
            You are given a string A.
            Find the number of indices where the reverse of the given string and the original string are different.

        * Problem Constraints
            1 <= Length of String A <= 105

        * Input Format
            The first argument is the string A.

        * Output Format
            Return an integer denoting the number of indices where the reverse and the original string are different.
    */

public class ChangesInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int count = 0;
        int N = A.length();
        for(int i = 0; i < N; i++){
            if(A.charAt(i) != A.charAt(N-1-i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
