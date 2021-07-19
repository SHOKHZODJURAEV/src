package day_14Repeat;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);


        System.out.println("Enter your grade number:");
        int Grade = scan.nextInt();
        String gradeLevel = "";

        if(Grade>=1 && Grade <= 18){
            gradeLevel = (Grade<=5)? "Elementary school":(Grade<=8)? "Middle School":(Grade<12)? "High School":
                    (Grade<16)? "College" : "Grand School";

        }else{
            System.out.println("Invalid number");
        }
        System.out.println(gradeLevel);
    }
}
