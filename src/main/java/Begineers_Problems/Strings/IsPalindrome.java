package Begineers_Problems.Strings;

import java.util.Scanner;

    /*
        * Problem Description
            Write a program to input T strings (S) from user and print 1 if it is palindrome otherwise print 0.
            NOTE:A string is palindrome if it reads the same from backward as from forward.

        * Problem Constraints
            1 <= T <= 100
            1 <= S.size() <= 1000

        * Input Format
            First line is T which means number of test cases.
            Each next T lines contain a string S.

        * Output Format
            T lines each containing either 0 or 1.
    */

public class IsPalindrome {
    public static boolean palindrome(String S){
        int N = S.length();
        int low = 0;
        int high = N-1;
        boolean flag = true;
        while(low < high){
            if(S.charAt(low) != S.charAt(high)){
                flag = false;
                break;
            }
            low++;
            high--;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < T; i++) {
            System.out.println("Enter String to check palindrome ::");
            String S = sc.nextLine();
            if(palindrome(S)){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }

    }

}
