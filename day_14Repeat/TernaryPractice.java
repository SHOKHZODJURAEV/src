package day_14Repeat;

import java.util.Scanner;

public class TernaryPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number between 1~7:");
        int number = scan.nextInt();

        String name = (number>=1 && number<=7)?
                (number==1)?"Monday": (number == 2)?"Tuesday":
                        (number==3)?"wednersday":
                (number==4)?"Thursday":(number==5)? "Friday":
                        (number==6)?"Saturday": "Sunday"
                :"Invalid number";
        System.out.println(name);
    }
}
