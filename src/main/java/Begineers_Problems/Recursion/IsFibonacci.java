package Begineers_Problems.Recursion;

import java.util.Scanner;

    /*
        * Problem Description
            Laxman is newbie in programming. He just learned how to generate fibonacci series,
            he told this to his elder brother, so his brother gave him an interesting problem.

            The problem is, given an integer N, task is to check whether
            the given number exist in fibonacci sequence or not.

        * INPUT
            The first line contains an integer, T, denoting the number of test cases.
            Next T lines contains an integer, N.

        * OUTPUT:
            For each test case , print “Yes” if the number exists in fibonacci sequence, else print “No”.
    */

public class IsFibonacci {
    public static String checkFibonacci(int N){
        if(N == 0){
            return "YES";
        }
        int n1 = 0;
        int n2 = 1;
        int n3;
        for(int i = 0; i <= N; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if(n3 == N){
                return "YES";
            }
            if(n3 >= N){
                break;
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(checkFibonacci(N));
    }
}
