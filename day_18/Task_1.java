package day_18;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address");
        String fullname = scan.next();
        int firstName = fullname.indexOf("_");
        int lastName = fullname.indexOf("@");
        String Fname= fullname.substring(0,firstName);
        String Lname = fullname.substring(firstName+1,lastName);
        String result = Lname+Fname+"@gmail.com";

        System.out.println(result);



    }
}
/*
Assume that email address is constructed by person's first name and followed by an underscore and last name.
			Write a program that can swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

			Ex:
				input: mike_tyson@gmail.com
				output: tyson_mike@gmail.com
 */
