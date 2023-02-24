package Strings;

import java.util.Scanner;

    /*
        * Problem Description
            Write a program to input T strings (S) from user and print count of vowels and consonants in it.

        * Problem Constraints
            1 <= T <= 100
            1 <= S.size() <= 1000

        * Input Format
            First line is T which means number of test cases.
            Each next T lines contain a lowercase string S.

        * Output Format
            T lines each containing two space separated integers representing cont of vowels and consonants in input string.
    */

public class VowelsVsConsonants {
    public static void vCount(String S){
        int N = S.length();
        int V_count = 0;
        int C_count = 0;
        for(int i = 0; i < N; i++){
            char ch = S.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                V_count++;
            }else{
                C_count++;
            }
        }
        System.out.println(V_count + " " + C_count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < T; i++){
            String S = sc.nextLine();
            vCount(S);
        }

    }
}
