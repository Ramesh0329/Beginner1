package Arrays;

import java.util.Scanner;

    /*
        * Problem Description
            You have a newspaper which has A lines to read.
            You decided to start reading the 1st line from Monday. You are given a schedule,
            B, where B[i] = number of lines you can read on that day.
            You are very strict in reading the newspaper and you will read as much as you can every day.
            Determine and return, which day of the week you will read the last line of the newspaper.

        * Problem Constraints
            1 <= A <= 1000
            0 <= B[i] <= 1000

        * Input Format
            The first argument contains the single integer A — the number of lines in the newspaper.
            The second argument is an array B, of size 7 and those integers represent how many lines
            you can read on Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday correspondingly.
            Note: It is guaranteed that at least one of the number in B[i] is larger than zero.

        * Output Format
            Return a single integer — the number of the day of the week, when you will finish reading the newspaper.
            The days of the week are numbered starting with one in the
            order: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
    */

public class ReadingNewspaper {
    public static int numberOfDay(int A, int[] B){
        int count = 0;
        while(count < A){
            for(int i = 0; i < B.length; i++){
                count = count + B[i];
                if(count >= A){
                    return i + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = sc.nextInt();
        int[] B = new int[N];
        for(int i = 0; i < B.length; i++){
            B[i] = sc.nextInt();
        }
        System.out.println(numberOfDay(A,B));
    }
}
