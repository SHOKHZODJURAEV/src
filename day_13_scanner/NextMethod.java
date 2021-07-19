package day_13_scanner;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();// only takes the first word

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println(age);
        System.out.println(fullName);

    }
}
