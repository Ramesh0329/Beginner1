package If_Condition;

import java.util.Scanner;

    /*
        * Problem Description
            Write a program to calculate the percentage (according to marks of a student) and grade
            (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the
            marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.
            If percentage >= 90% : Grade A
            If percentage >= 80% but <90 : Grade B
            If percentage >= 70% but <80: Grade C
            If percentage >= 60% but <70: Grade D
            If percentage >= 40% but <60: Grade E
            If percentage < 40%: Grade F
            NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.

        Input Format
            There will be five lines of inputs as following:
            The five lines contain the 5 subject marks of the student in numerical format.

        Output Format
            The first line indicates the percentage in integer format.
            The next line displays the grade in string format.
    */

public class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float total = 0;
        for(int i = 1; i <= 5; i++){
            float marks = sc.nextInt();
            if(marks < 0 || marks > 100){
                return;
            }
            total = total + marks;
        }
        float Avg = (total/500)*100;
        int pecentage = (int)Math.floor(Avg);
        if(pecentage > 90){
            System.out.println(pecentage + " A");
        }else if(pecentage >= 80){
            System.out.println(pecentage + " B");
        }else if(pecentage >= 70){
            System.out.println(pecentage + " C");
        }else if(pecentage >= 60){
            System.out.println(pecentage + " D");
        }else if(pecentage >= 40){
            System.out.println(pecentage + " E");
        }else{
            System.out.println(pecentage + " F");
        }
    }
}
