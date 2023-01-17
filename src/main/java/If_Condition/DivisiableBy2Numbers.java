package If_Condition;

    /*
    Problem Description :

    Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.

    Problem Constraints :

    1 <= A <= 109

    Input Format :

    The input contains a single integer A.

    Output Format :

    Print 1 if A is divisible by both 5 and 11, else print 0.
    */

import java.util.Scanner;

public class DivisiableBy2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A % 5 == 0 && A % 11 == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
