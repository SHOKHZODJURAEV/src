package day_14Repeat;

import java.util.Scanner;

public class createlevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter grade number?");
        int number = scan.nextInt();
        String GradeLevel = "";
        if(number>1 && number<18)
        switch(number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                GradeLevel = "elementery School";
                break;

            case 6:
            case 7:
            case 8:
                GradeLevel = "Middle school";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                GradeLevel = "High School";
                break;
            case 14:
            case 15:
            case 16:
                GradeLevel = "College";
                break;
            default:
                GradeLevel = "Grand School";
        }else {
            GradeLevel = " invalid number";
        }
        System.out.println(GradeLevel);
    }
}
