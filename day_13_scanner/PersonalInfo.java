package day_13_scanner;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter salary");
        int Salary = scan.nextInt();

        System.out.println("Enter your gender:");
        String gender = scan.next();
        scan.nextLine();

        System.out.println("Enter your full name");
        String fullname = scan.nextLine();


        System.out.println("salary: "+Salary);
        System.out.println("gender: "+gender);
        System.out.println("Full name: "+fullname);
    }
}
