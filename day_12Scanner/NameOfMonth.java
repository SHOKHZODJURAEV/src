package day_12Scanner;

import java.util.Scanner;

public class NameOfMonth {
    public static void main(String[] args) {


        Scanner Variable = new Scanner (System.in);
        System.out.println("Enter number:");
        System.out.println(" Enter number:");
        int number =  Variable.nextInt();
        String result = "";

        switch(number){
            case 1:
                result = "Jan";
                break;
            case 2:
                result = "Feb";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "July";
                break;
            case 9:
                result = "July";
                break;
            case 10:
                result = "July";
                break;
            case 11:
                result = "July";
                break;
            case 12:
                result = "July";
                break;
            default:
                result = "Invalid number";

        }
        System.out.println(result);
    }
}
