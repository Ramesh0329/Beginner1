package If_Condition;

import java.util.Scanner;

    /*
        * Problem Description
            You are given a positive integer A denoting the radius of a circle.
            You have to calculate the area of the circle.
            Area of a circle having radius R is given by (π * R2).
            NOTE: Since, the answer can be a real number, you have to return the ceil value of the area.
            Ceil value of a real number X is the smallest integer that is greater than or equal to X.
            Use standard PI value in the particular programming language.

        * Problem Constraints
            1 <= A <= 1000

        * Input Format
            First and only argument is an integer A.

        * Output Format
            Return a single integer denoting the ceil value of area of the circle.
    */

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        double Area = 0;
        if(A > 0){
            Area = Math.ceil((double)Math.PI * A * A);
        }

        System.out.println((int)Area);


    }
}
