package If_Condition;

import java.util.Scanner;

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
