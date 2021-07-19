package day_13_scanner;

import java.util.Scanner;

public class numberOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number: 1 to 10,000");
        int number = scan.nextInt();
        boolean isDigit;

        if(number>=1 && number<= 100000){
            if(number<=9){
                System.out.println("1 digit");

            }else if (number<99){
                System.out.println("2 digit");
            }else if (number<999){
                System.out.println(" 3 digit");
            }else if (number<9999){
                System.out.println(" 4 digit");
            }else if(number < 99999){
                System.out.println("5 digit");
            }else{
                System.out.println(" 6 digit");
            }


        }else{
            System.out.println("Invalid number");
        }

        scan.close();

        //String result  = (number>=1 && number<= 100000)? (number<=9)? "1 digit":(number<99)

    }
}
