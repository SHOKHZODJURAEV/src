package day_13_scanner;

import java.util.Scanner;

public class Scan_new {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Days");
        int dayNumber = scan.nextInt();
        int year = dayNumber/365;
        int Remainder1 = dayNumber%365;
        int month = Remainder1/30;
        int remainder2 = Remainder1%30;
        int week = remainder2/7;
        int day = remainder2%7;

        System.out.println("Year: "+year);
        System.out.println("Month: "+month);
        System.out.println("week:"+ week);
        System.out.println("days: "+ day);


    }
}
