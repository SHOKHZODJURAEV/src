package day_13_scanner;

import java.util.Scanner;

public class Freeshipping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of the item");
        double price = scan.nextDouble();

        System.out.println("are you a prime member");
        boolean isPrime = scan.nextBoolean();

        double totalPrice = (isPrime)?price : price+3.99;

        System.out.println(totalPrice+"$");
    }
}
