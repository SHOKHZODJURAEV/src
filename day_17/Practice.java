package day_17;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email");
        String email = scan.next();
        int firstName = email.indexOf("_");
        int lastName = email.indexOf("@");
        String Fname = email.substring(0,firstName);
        String Lname = email.substring(firstName+1,lastName);
        String domain = Lname+Fname+"@gmail.com";





    }
}
