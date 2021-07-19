package day_13_scanner;

import java.util.Scanner;

public class ScannerKGPD {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter kg");
        double kgConvert = scan.nextDouble();
        double kgtoPd = kgConvert*2.204;

        System.out.println(kgConvert+" equal to "+kgtoPd+" pounds");

    }
}
