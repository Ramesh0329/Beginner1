package Begineers_Problems.Loops;

import java.util.Scanner;

    /*
        * Problem Description
            You will be given an integer n. You need to return the count of prime numbers less than or equal to n.

        * Problem Constraints
            0 <= n <= 10^3

        * Input Format
            Single input parameter n in function.

        * Output Format
            Return the count of prime numbers less than or equal to n.
    */

public class CountOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        if(N < 2){
            System.out.println(count);
        }
        for(int i = 2; i <= N; i++){
            boolean isPrime = true;
            for(int j = 2; j *  j <= i; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                count++;
            }
        }
        System.out.println(count);
    }
}
