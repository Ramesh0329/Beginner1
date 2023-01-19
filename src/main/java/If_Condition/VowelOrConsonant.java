package If_Condition;

import java.util.Scanner;

    /*
        * Problem Description:
            You are given a lowercase latin alphabetic character C. You have to tell whether it is a vowel or no
            The characters 'a', 'e', 'i', 'o', and 'u' are called vowels.

        * Problem Constraints:
            C ∈ ['a' - 'z']

        * Input Format:
            The input consists of a single character C.

        Output Format:
            Return 1 if the given character is a vowel, else return 0.
    */

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().toLowerCase().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
