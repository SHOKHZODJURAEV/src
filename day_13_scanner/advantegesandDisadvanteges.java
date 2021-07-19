package day_13_scanner;

import java.util.Scanner;

public class advantegesandDisadvanteges {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your job title");
        String title = scan.nextLine();

        System.out.println(age);
        System.out.println(title);
    }
}
