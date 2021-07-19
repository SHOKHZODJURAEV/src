package day_13_scanner;

import java.util.Scanner;  // only imports scanner class from "java.util" package
import java.util.*; // imports everything from "java.util" package
public class CentstoDollar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cents");
        int cents = scan.nextInt();
        int dollar = cents / 100;
        int remainder = cents % 100;

        if(cents>=0) {

            if (remainder == 0) {
                System.out.println(cents + "equal to " + dollar + " dollars and " + cents);
            } else {
                System.out.println(cents + " cents equal to " + dollar + " dollar and " + remainder + "cents");
            }
        }else{
            System.err.println("Invalid Amount");
        }

    }
}
