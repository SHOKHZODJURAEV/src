package day_14Repeat;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your zip code:");
        long zipCode = scan.nextLong();

        System.out.println("how many people do you live with");
        byte number = scan.nextByte();

        System.out.println("are you married?");
        boolean married = scan.nextBoolean();

        System.out.println("I see you are"+ ( (married)? "married" : "not married")
                +" and live with "+number+" people in your house which is in the"+ zipCode + " area!");

    }
}
