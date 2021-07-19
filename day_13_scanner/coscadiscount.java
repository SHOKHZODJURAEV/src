package day_13_scanner;

import java.util.Scanner;

public class coscadiscount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price:");
        int price = scan.nextInt();


        System.out.println("do you have Cosca card?");
        boolean coscaCard = scan.nextBoolean();

        if (price >= 200) {
            if (coscaCard == true) {
                System.out.println("you are eligible for 10% discount");
            } else {
                System.out.println("You must have Cosca card");
            }
        }else{
            System.out.println("you are not eligible for discount");
        }
    }
}
