package day_14Repeat;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("How many people do you live with?");
        int number = scan.nextInt();

        if (number >=1) {
            switch (number){
                case 1 :
                case 2:
                    System.out.println("Live with less than 3 people");


                    case 3 :
                case 4:
                case 5:
                case 6:
                    System.out.println("Live with 3-6 people");

                default:
                    System.out.println("Live with more than 6 people");

            }


        }else{
            System.out.println("invalid number");

        }
        scan.close();

        System.out.println("Enter next number");
        int number2 = scan.nextInt();
    }
}
