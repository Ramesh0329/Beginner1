package If_Condition;

import java.util.Scanner;

    /*
        * Problem Description
            You are given a positive integer A denoting the radius of a sphere.
            You have to calculate the volume of the sphere.
            Volume of a sphere having radius R is given by (4 * π * R3) / 3.
            NOTE: Since, the answer can be a real number, you have to return the ceil value of the volume.
            Ceil value of a real number X is the smallest integer that is greater than or equal to X.

        * Problem Constraints
            1 <= A <= 400

        * Input Format
            First and only argument is an integer A.

        * Output Format
            Return a single integer denoting the ceil value of volume of the sphere.
    */

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        double volume = 0;
        if(A > 0){
            volume = Math.ceil((double)((Math.PI * 4 * A * A * A)/3));
        }
        System.out.println((int)volume);
    }
}
