package Begineers_Problems.PatternProblems;

import java.util.Scanner;

public class IncDecNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            int cnt = 1;
            for(int j = 1; j <= N-i; j++){
                System.out.print("  ");
                cnt++;
            }
            int val = i;
            for(int k = i; k <= 2*i - 1; k++){
                System.out.print(val + " ");
                val++;
                cnt++;
            }
            val = val - 2;
            for(int l = 1; l <= i-1; l++){
                System.out.print(val + " ");
                val--;
                cnt++;
            }
            System.out.println();
        }
    }
}
