package day_17;

import java.util.Scanner;

public class Initial2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine(); //Cybertek School
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        String initial = firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();
        // create substi
        System.out.println(initial);
        scan.close();
    }
}
