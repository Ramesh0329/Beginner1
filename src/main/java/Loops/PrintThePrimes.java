package Loops;

import java.util.Scanner;

    /*
        * Problem Description
            You are given an integer N you need to print all the Prime Numbers between 1 and N.
            Prime numbers are numbers that have only 2 factors: 1 and themselves. For example,
            the first 5 prime numbers are 2, 3, 5, 7, and 11.

        * Problem Constraints
            1 <= N <= 300

        * Input Format
            First and only line of input contains a single integer N.

        * Output Format
            Print all the prime numbers between between 1 and N each in a new line.
    */

public class PrintThePrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 2; i <= N; i++){
            boolean isPrime = true;
            for(int j = 2; j*j <= i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.print(i+ " ");
            }
        }
    }
}
