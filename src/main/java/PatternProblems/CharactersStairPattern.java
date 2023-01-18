package PatternProblems;

import java.util.Scanner;



    /*
        * Problem Description

            Given an integer N, print the corresponding pattern for N.

            For example if N = 4 then pattern will be like:

            A
            B B
            C C C
            D D D D

        * Problem Constraints

            1 <= N <= 26

        * Input Format

            First and only line of input contains a single integer N.

        * Output Format

            Output the pattern corresponding to the given N.
            NOTE: There should be no extra spaces after last character or before first character
            in any row and all characters in any row in the pattern are space separated.
    * */

public class CharactersStairPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int alpha = 65;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                if(j != i){
                    System.out.print((char)alpha + " ");
                }else{
                    System.out.print((char)alpha + "\n");
                }
            }
            alpha++;
        }
    }
}
