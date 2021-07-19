package day_15;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First name:");
        char f = scan.next(). charAt(0);

        System.out.println("Enter your Last Name:");
        char b = scan.next(). charAt(0);
        scan.close();

       /* char f = firstName.charAt(0);
        char b = lastName.charAt(0);
        */
        String initial = f+"."+b;

        System.out.println(initial);

    }
}
