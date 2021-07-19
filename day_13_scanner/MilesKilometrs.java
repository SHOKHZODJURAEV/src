package day_13_scanner;

import java.util.Scanner;

public class MilesKilometrs {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter miles");
        double Mile = scan.nextDouble();
        double KmConver = Mile*1.609;


        System.out.println(KmConver+" Kilometers");

    }
}
