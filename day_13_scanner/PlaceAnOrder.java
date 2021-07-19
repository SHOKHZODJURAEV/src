package day_13_scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please Enter product name: ");
        String nameOfProduct = scan.nextLine();

        System.out.println("please enter price: ");
        double price = scan.nextDouble();

        System.out.println("please enter the quantity");
        int quantity = scan.nextInt();

        System.out.println(" what is your first name");
        String FirstName = scan.next();


        double totalPrice = price * quantity;

        System.out.println(FirstName+" Your order for "+quantity+" "+nameOfProduct +"has been placed. Total price is $"+totalPrice);

    }
}
