package day_13_scanner;

import java.util.Scanner;

public class Scanner10_DISCOUNT {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter price:");
        int price = scan.nextInt();
        double discountprecent = price*0.10;
        double discount = (price>=200)? price : price+discountprecent;

        System.out.println("Total price: "+discount);
    }
}
