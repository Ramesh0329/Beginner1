package Recursion;

import java.util.Scanner;

public class EasyPower {
    public static int power(int A, int B){
        if(B == 0){
            return 0;
        }
        if(B == 1){
            return A;
        }else{
            return A * power(A, B-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(power(A,B));
    }
}
