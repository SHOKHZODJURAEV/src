package day_13_scanner;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner scan  = new Scanner (System.in);
        System.out.println("How much is your total shares in the stock market?");
        double totalshares = scan.nextDouble();

        if(totalshares>0){
            System.out.println("How much is your total value in the stock market ");
            double totalvalue = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter company name:");
            String name = scan.nextLine();

            System.out.println("Your total stock market holding is $"+ totalvalue+" which is made up of "+totalshares+" "+name);

        }else{
            System.out.println("inValid number");
        }

    }
}
