package Begineers_Problems.Loops;

import java.util.Scanner;


    /*
        * Problem Description
            Take T (number of test cases) as input.
            For each test case, take integer N as input and Print the count of digits of that number.
            Note: No of digits for number 0 is considered as 1.

        * Problem Constraints
            1 <= T <= 100
            0 <= N <= 100000000

        * Input Format
            The first line is the number T which denotes the total number of test cases.
            Next T lines contain an integer N for which you have to print the number of digits.

        * Output Format
            For T different Numbers, Print the number of digits in separate lines.
    * */

public class CountTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i <= T; i++){
            int N = sc.nextInt();
            int count = 0;
            if(N == 0){
                System.out.println(1);
            }else{
                while(N > 0){
                    N = N/10;
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}
