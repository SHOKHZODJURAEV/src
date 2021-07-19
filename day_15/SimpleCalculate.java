package day_15;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner (System.in);

        System.out.println("Enter first number:");
        double num1 = scan.nextDouble();

        System.out.println("Enter a math operator:");
        char mathOperator = scan.next().charAt(0); // +, -, *, /

        System.out.println("Enter your second number:");
        double num2 = scan.next().charAt(0);

        double result = 0;
        switch (mathOperator){
            case '-':
                result = num1 - num2;
                break;

            case '+':
                result= num1+ num2;
                break;

            case '*':
                result = num1*num2;
                break;

            case '/':
                break;
            default:
                System.out.println("Invalid Operator");
        }
        System.out.println("result = "+ result);
        scan.close();
*/
        System.out.println("-------------");
        String word = "Navoiy School";
        // index:      012345678
        String sentence = "Hello world";
        int totalNumber = sentence.length()-1;
        System.out.println(totalNumber);

        char first = word.charAt(0);
        int lastindex = word.length()-1;
        char last = word.charAt(lastindex);

        System.out.println("last = " + last);
        System.out.println("first = " + first);
        System.out.println("-------------");

        String firstname = "Shokhzod";
        String lastname = "Juraev";
        String Fullname = firstname.concat(" ").concat("   ")+lastname;
        System.out.println("Fullname = " + Fullname);







    }
}
