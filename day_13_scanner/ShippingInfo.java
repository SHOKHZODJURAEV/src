package day_13_scanner;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your bulding number: ");
        int number = scan.nextInt();

        scan.nextLine();

        System.out.println("Street adress:");
        String address = scan.nextLine();

        System.out.println("City name:");
        String CityName = scan.nextLine();

        System.out.println("State:");
        String state = scan.nextLine();

        System.out.println("Zip code:");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Full name");
        String fullName = scan.nextLine();

        System.out.println("Bulding number: "+number);
        System.out.println("Street Address: "+address);
        System.out.println("City name: "+CityName);
        System.out.println("State: "+state);
        System.out.println("Zip code: "+zipCode);
        System.out.println("Full name: "+fullName);

    }
}
