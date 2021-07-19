package day_14Repeat;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter your birth year");

        short year = scan.nextShort();
        System.out.println("Enter your birth day");
        byte day = scan.nextByte();
        System.out.println("Enter month");
        int month = scan.nextInt();
        boolean isValid = (year<=2021)&& (day<=30)&&(month<=31);

        if(isValid = true){
            System.out.println("date of Birth:"+day+"/"+month+"/"+year);

        }else {
            System.out.println("Invalid number");
        }
    }
}
