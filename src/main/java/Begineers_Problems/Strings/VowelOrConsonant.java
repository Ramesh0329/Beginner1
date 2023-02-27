package Begineers_Problems.Strings;

import java.util.Scanner;

    /*
        * Problem Description:
            You are given a lowercase latin alphabetic character C. You have to tell whether it is a vowel or not.
            The characters 'a', 'e', 'i', 'o', and 'u' are called vowels.

        * Problem Constraints:
            C ∈ ['a' - 'z']

        * Input Format:
            The input consists of a single character C.

        * Output Format:
            Return 1 if the given character is a vowel, else return 0.
    */

public class VowelOrConsonant {
    public static int vowel(char C){
        if(C == 'a' || C == 'e' || C == 'i' || C == 'o' || C == 'u'){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char C = sc.next().charAt(0);
        System.out.println(vowel(C));
    }
}
